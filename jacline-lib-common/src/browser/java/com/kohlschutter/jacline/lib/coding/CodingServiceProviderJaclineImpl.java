package com.kohlschutter.jacline.lib.coding;

import com.kohlschutter.jacline.annotations.JsServiceProvider;

@JsServiceProvider(CodingServiceProvider.class)
public class CodingServiceProviderJaclineImpl implements CodingServiceProvider {

  public CodingServiceProviderJaclineImpl() {
  }

  @Override
  public KeyDecoder keyDecoder(String expectedCodedType, Object encoded) throws CodingException {
    return new JaclineKeyDecoder(this, expectedCodedType, encoded);
  }

  @Override
  public KeyEncoder keyEncoder(String type) throws CodingException {
    return new JaclineKeyEncoder(this, type);
  }

  @Override
  public SequenceDecoder sequenceDecoder(Object encoded) throws CodingException {
    return new JaclineSequenceDecoder(this, encoded);
  }

  @Override
  public SequenceEncoder sequenceEncoder() throws CodingException {
    return new JaclineSequenceEncoder(this);
  }
}
