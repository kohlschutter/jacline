package com.kohlschutter.jacline.lib.coding;

import com.kohlschutter.jacline.annotations.JsServiceProvider;

@JsServiceProvider(CodingServiceProvider.class)
public class CodingServiceProviderJaclineImpl implements CodingServiceProvider {

  public CodingServiceProviderJaclineImpl() {
  }

  @Override
  public KeyDecoder keyDecoder(String expectedCodedType, Object encoded) throws CodingException {
    return new JaclineKeyDecoder(expectedCodedType, encoded);
  }

  @Override
  public KeyEncoder keyEncoder(String type) throws CodingException {
    return new JaclineKeyEncoder(type);
  }
}
