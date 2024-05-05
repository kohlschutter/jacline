goog.module("com.kohlschutter.jacline.lib.coding.KeyEncoder$impl$patched");

var KeyEncoder = goog.require("com.kohlschutter.jacline.lib.coding.KeyEncoder$impl");

var JsKeyEncoder = goog.require("kohlschutter.coding.KeyEncoder");

KeyEncoder.begin = function(/** ?string */ type) {
    KeyEncoder.$clinit();
    return JsKeyEncoder.begin(type);
}

exports = KeyEncoder;
