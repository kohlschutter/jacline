goog.module('jsinterop.base.InternalJsUtil');

goog.require('java.lang.Class');
goog.require('java.lang.Object');
goog.require('jsinterop.base.JsArrayLike.$Overlay');
goog.require('jsinterop.base.JsConstructorFn.$Overlay');
goog.require('jsinterop.base.JsPropertyMap.$Overlay');
goog.require('nativebootstrap.Long');
goog.require('nativebootstrap.Util');

const InternalJsUtil = goog.require('jsinterop.base.InternalJsUtil$impl');
exports = InternalJsUtil;
