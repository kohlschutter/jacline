package com.kohlschutter.jacline.lib.common.vanilla;

import com.kohlschutter.jacline.annotations.JsIgnoreType;
import com.kohlschutter.jacline.lib.common.DecodingException;
import com.kohlschutter.jacline.lib.common.EncodableSupportProvider;
import com.kohlschutter.jacline.lib.common.KeyDecoder;
import com.kohlschutter.jacline.lib.common.KeyEncoder;
import com.kohlschutter.jacline.lib.common.SequenceDecoder;
import com.kohlschutter.jacline.lib.common.SequenceEncoder;

@JsIgnoreType
public class JsonEncodableSupportProvider implements EncodableSupportProvider {

  @Override
  public KeyDecoder keyDecoder(String expectedCodedType, Object encoded) throws DecodingException {
    return new JsonKeyDecoder(expectedCodedType, encoded);
  }

  @Override
  public KeyEncoder keyEncoder(String type) {
    return new JsonKeyEncoder(type);
  }

  @Override
  public SequenceDecoder sequenceDecoder(Object encoded) throws DecodingException {
    return new JsonSequenceDecoder(encoded);
  }

  @Override
  public SequenceEncoder sequenceEncoder() {
    return new JsonSequenceEncoder();
  }
}
