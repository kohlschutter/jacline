package com.kohlschutter.jacline.lib.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CommonLogServiceProviderSlf4jImpl implements CommonLogServiceProvider {

  private static final Logger LOG = LoggerFactory.getLogger(CommonLog.class);

  public CommonLogServiceProviderSlf4jImpl() {
  }

  @FunctionalInterface
  private interface LogTarget {
    void log(String message, Object[] args);
  }

  private static void doLog(LogTarget target, String message, Object[] args) {
    if (args.length > 0) {
      int offset = 0;
      int count = 0;
      while (true) {
        offset = message.indexOf("{}", offset);
        if (offset < 0) {
          break;
        }
        offset++;
        count++;
      }

      for (int i = count, n = args.length; i < n; i++) {
        message += " {}";
      }
    }

    target.log(message, args);
  }

  @Override
  public void log(String message, Object... args) {
    info(message, args);
  }

  @Override
  public void debug(String message, Object... args) {
    if (LOG.isDebugEnabled()) {
      doLog(LOG::debug, message, args);
    }
  }

  @Override
  public void info(String message, Object... args) {
    if (LOG.isInfoEnabled()) {
      doLog(LOG::info, message, args);
    }
  }

  @Override
  public void warn(String message, Object... args) {
    if (LOG.isWarnEnabled()) {
      doLog(LOG::warn, message, args);
    }
  }

  @Override
  public void error(String message, Object... args) {
    if (LOG.isErrorEnabled()) {
      doLog(LOG::error, message, args);
    }
  }
}
