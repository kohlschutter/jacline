package com.kohlschutter.jacline.jscomp.serviceloader;

import java.nio.file.Path;
import java.util.List;

@FunctionalInterface
public interface PatchNotifier {
  void notify(Path originalFile, Path newFile, String service, List<String> providers);
}
