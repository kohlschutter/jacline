package com.kohlschutter.jacline.lib.coding;

import java.util.Arrays;

import jsinterop.annotations.JsType;

/**
 * An information message, warning or error that may be occur upon coding or decoding.
 * 
 * @author Christian Kohlschütter
 */
@JsType
public class CodingAdvisory {
  private final CodingAdvisoryLevel level;
  private final String[] keys;
  private final String reason;

  private static final String[] NO_KEYS = new String[0];

  public CodingAdvisory(CodingAdvisoryLevel level, String reason, String... keys) {
    this.level = level;
    this.keys = keys.length == 0 ? NO_KEYS : Arrays.copyOf(keys, keys.length);
    this.reason = reason;
  }

  public CodingAdvisoryLevel getLevel() {
    return level;
  }

  public String[] getKeys() {
    return keys; 
  }

  public String getReason() {
    return reason;
  }

  @JsType
  public enum CodingAdvisoryLevel {
    INFO("info"), WARNING("warning"), ERROR("error");

    private final String label;

    CodingAdvisoryLevel(String label) {
      this.label = label;
    }

    public String getLabel() {
      return label;
    }
  }
}
