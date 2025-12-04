package com.kohlschutter.jacline.mavenplugin;

import org.apache.maven.plugin.logging.Log;

final class DoubleLog implements Log {
  private final Log log1;
  private final Log log2;

  public DoubleLog(Log log, Log log2) {
    this.log1 = log;
    this.log2 = log2;
  }

  @Override
  public boolean isInfoEnabled() {
    return log1.isInfoEnabled();
  }

  @Override
  public boolean isWarnEnabled() {
    return log1.isWarnEnabled();
  }

  @Override
  public boolean isErrorEnabled() {
    return log1.isErrorEnabled();
  }

  @Override
  public boolean isDebugEnabled() {
    return log1.isDebugEnabled();
  }

  @Override
  public void debug(CharSequence content) {
    log1.debug(content);
    log2.debug(content);
  }

  @Override
  public void debug(CharSequence content, Throwable error) {
    log1.debug(content, error);
    log2.debug(content, error);
  }

  @Override
  public void debug(Throwable error) {
    log1.debug(error);
    log2.debug(error);
  }

  @Override
  public void info(CharSequence content) {
    log1.info(content);
    log2.info(content);
  }

  @Override
  public void info(CharSequence content, Throwable error) {
    log1.info(content, error);
    log2.info(content, error);
  }

  @Override
  public void info(Throwable error) {
    log1.info(error);
    log2.info(error);
  }

  @Override
  public void warn(CharSequence content) {
    log1.warn(content);
    log2.warn(content);
  }

  @Override
  public void warn(CharSequence content, Throwable error) {
    log1.warn(content, error);
    log2.warn(content, error);
  }

  @Override
  public void warn(Throwable error) {
    log1.warn(error);
    log2.warn(error);
  }

  @Override
  public void error(CharSequence content) {
    log1.error(content);
    log2.error(content);
  }

  @Override
  public void error(CharSequence content, Throwable error) {
    log1.error(content, error);
    log2.error(content, error);
  }

  @Override
  public void error(Throwable error) {
    log1.error(error);
    log2.error(error);
  }
}
