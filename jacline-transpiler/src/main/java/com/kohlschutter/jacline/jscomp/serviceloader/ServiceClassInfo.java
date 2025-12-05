package com.kohlschutter.jacline.jscomp.serviceloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utility class for ServiceLoader shim code generation. 
 * 
 * @author Christian Kohlschütter
 */
public final class ServiceClassInfo {
  private static final String JACLINE_GENERATED_BEGIN = "// JACLINE-GENERATED-BEGIN:ServiceLoader";
  private static final String JACLINE_GENERATED_END = "// JACLINE-GENERATED-END:ServiceLoader";

  private Path originalFilePath;
  private final String service;
  private final List<String> providers = new ArrayList<>();

  public ServiceClassInfo(String service) {
    this.service = service;
  }

  public ServiceClassInfo addProvider(String provider) {
    providers.add(provider);
    return this;
  }

  public List<String> getProviders() {
    return Collections.unmodifiableList(providers);
  }

  public String getService() {
    return service;
  }

  public boolean isCovered() {
    return originalFilePath != null;
  }

  public Path patch(Path originalFile, Path generatedCodeOutputPath, PatchNotifier callback)
      throws IOException {
    this.originalFilePath = originalFile;

    String newFilename = service.replace('.', '/') + ".java.js";
    Path newPath = generatedCodeOutputPath.resolve(newFilename);

    callback.notify(originalFile, newPath, service, providers);

    Files.createDirectories(newPath.getParent());

    Path tmpFile = Files.createTempFile(generatedCodeOutputPath, "ServiceClassInfo", ".tmp");
    try {

      try (BufferedReader in = Files.newBufferedReader(originalFile, StandardCharsets.UTF_8);
          PrintWriter out = new PrintWriter(Files.newBufferedWriter(tmpFile, StandardCharsets.UTF_8,
              StandardOpenOption.CREATE, StandardOpenOption.WRITE));) {

        String implConst = null;
        String implConstRequire = "goog.require('" + service + "$impl');";

        boolean skip = false;
        String l;
        while (true) {
          l = in.readLine();
          if (l == null) {
            break;
          }
          if (l.startsWith(JACLINE_GENERATED_BEGIN)) {
            skip = true;
          } else if (l.startsWith(JACLINE_GENERATED_END)) {
            skip = false;
          }
          if (skip) {
            continue;
          }

          if (implConst == null) {
            if (l.startsWith("const ") && l.endsWith(implConstRequire)) {
              implConst = l.substring("const ".length(), l.indexOf(' ', "const ".length()));
            }
          }

          out.println(l);
        }

        if (implConst == null) {
          throw new IOException("Could not find  declaration " + implConstRequire + " in "
              + originalFile);
        }

        out.println(JACLINE_GENERATED_BEGIN);
        out.println(
            "const jaclineServiceLoader_ServiceLoader = goog.require('java.util.ServiceLoader');");
        out.println("const jaclineServiceLoader_Class = goog.require('java.lang.Class$impl');");
        out.println();

        int provIdx = 0;
        for (String provider : providers) {
          out.println("const jaclineServiceLoader_" + (++provIdx) + " = goog.require('" + provider
              + "');");
        }
        out.println();

        out.println("const jaclineServiceLoader_origInit = " + implConst + ".$clinit;");
        out.println(implConst + ".$clinit = function() {");
        out.println("  let serviceClass = jaclineServiceLoader_Class.$get(" + implConst + ");");

        for (int i = 1; i <= provIdx; i++) {
          out.println();
          String providerConst = "jaclineServiceLoader_" + i;
          out.println("  if (" + providerConst + ".$clinit) {");
          out.println("      " + providerConst + ".$clinit();");
          out.println("  }");
          out.println(
              "  jaclineServiceLoader_ServiceLoader.m_jaclineRegisterService__java_lang_Class__java_util_ServiceLoader_ServiceProvider__void(serviceClass, "
                  + providerConst + ".$create__);");
        }

        out.println();
        out.println("  jaclineServiceLoader_origInit();");
        out.println("};");

        out.println(JACLINE_GENERATED_END);
      }
      Files.move(tmpFile, newPath, StandardCopyOption.REPLACE_EXISTING);
    } finally {
      Files.deleteIfExists(tmpFile);
    }

    return newPath;
  }
}
