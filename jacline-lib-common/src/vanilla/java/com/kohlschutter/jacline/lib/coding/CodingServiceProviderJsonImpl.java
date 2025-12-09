package com.kohlschutter.jacline.lib.coding;

import com.kohlschutter.jacline.annotations.JsIgnoreType;

@JsIgnoreType
public class CodingServiceProviderJsonImpl implements CodingServiceProvider {

  @Override
  public KeyDecoder keyDecoder(String expectedCodedType, Object encoded) throws CodingException {
    return new JsonKeyDecoder(expectedCodedType, encoded);
  }

  @Override
  public KeyEncoder keyEncoder(String type) {
    return new JsonKeyEncoder(type);
  }
}
