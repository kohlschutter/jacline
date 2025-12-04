package com.kohlschutter.jacline.mavenplugin;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.apache.maven.plugin.logging.Log;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

@SuppressFBWarnings("INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE")
final class FileLog implements Log, Closeable {
  private final PrintWriter out;

  FileLog(Path p) {
    try {
      out = new PrintWriter(Files.newBufferedWriter(p, StandardOpenOption.CREATE,
          StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING), true);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public void close() {
    out.close();
  }

  @Override
  public boolean isDebugEnabled() {
    return true;
  }

  @Override
  public void debug(CharSequence content) {
    out.println(content);
  }

  @Override
  public void debug(CharSequence content, Throwable error) {
    out.println(content);
    error.printStackTrace(out);
  }

  @Override
  public void debug(Throwable error) {
    error.printStackTrace(out);
  }

  @Override
  public boolean isInfoEnabled() {
    return true;
  }

  @Override
  public void info(CharSequence content) {
    out.println(content);
  }

  @Override
  public void info(CharSequence content, Throwable error) {
    out.println(content);
    error.printStackTrace(out);

  }

  @Override
  public void info(Throwable error) {
    error.printStackTrace(out);
  }

  @Override
  public boolean isWarnEnabled() {
    return true;
  }

  @Override
  public void warn(CharSequence content) {
    out.println(content);
  }

  @Override
  public void warn(CharSequence content, Throwable error) {
    out.println(content);
    error.printStackTrace(out);
  }

  @Override
  public void warn(Throwable error) {
    error.printStackTrace(out);
  }

  @Override
  public boolean isErrorEnabled() {
    return true;
  }

  @Override
  public void error(CharSequence content) {
    out.println(content);
  }

  @Override
  public void error(CharSequence content, Throwable error) {
    out.println(content);
    error.printStackTrace(out);
  }

  @Override
  public void error(Throwable error) {
    error.printStackTrace(out);
  }
}