goog.module('javaemul.internal.PrimitiveLists');

goog.require('java.lang.Object');
goog.require('javaemul.internal.JsUtils');
goog.require('javaemul.internal.PrimitiveLists.Byte.$Overlay');
goog.require('javaemul.internal.PrimitiveLists.Double.$Overlay');
goog.require('javaemul.internal.PrimitiveLists.Int.$Overlay');
goog.require('javaemul.internal.PrimitiveLists.Long.$Overlay');
goog.require('nativebootstrap.Long');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Arrays');
goog.require('vmbootstrap.primitives.$byte');
goog.require('vmbootstrap.primitives.$double');
goog.require('vmbootstrap.primitives.$int');
goog.require('vmbootstrap.primitives.$long');

const PrimitiveLists = goog.require('javaemul.internal.PrimitiveLists$impl');
exports = PrimitiveLists;
