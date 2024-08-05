goog.module("com.kohlschutter.jacline.lib.coding.KeyEncoder$impl$patched");

var KeyEncoder = goog.require("com.kohlschutter.jacline.lib.coding.KeyEncoder$impl");

var JsKeyEncoder = goog.require("kohlschutter.coding.KeyEncoder");

KeyEncoder.begin = function(/** ?string */ type) {
    KeyEncoder.$clinit();

    if (window.keepClosureHappy) {
        // prevent closure-compiler from pruning these methods
        // FIXME
        JsKeyEncoder.begin(type).beginEncodeObject(null, null).end().encodeString("X", "Y").encodeNumber("N", 123).encodeBoolean("B", true).end().getEncoded();
    }

    return JsKeyEncoder.begin(type);
}

exports = KeyEncoder;
