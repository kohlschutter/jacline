goog.module("kohlschutter.coding.KeyEncoder");

var JaclineUtil = goog.require('com.kohlschutter.jacline.lib.util.JaclineUtil$impl');

// FIXME type checking
class KeyEncoder {
    constructor(...args) {
        this.type = args[0];
        this.parent = args[1];
        this.parentKey = args[2];
        this.obj = {};
    }

    static begin(type) {
        var e = new KeyEncoder(type);
        return e;
    }

    static unbox(v) { // hacky way to unbox j2cl Number and Boolean objects
        if(typeof v == "object") {
            for (var i in v) {
                return v[i];
            }
        }
        return v;
    }

    encodeString(key, value) {
        this.obj[key] = value;
        return this;
    }
    encodeBoolean(key, value) {
        value = KeyEncoder.unbox(JaclineUtil.m_toJsonBoolean__java_lang_Boolean__java_lang_Object(value));
        this.obj[key] = value;
        return this;
    }
    encodeNumber(key, value) {
        value = KeyEncoder.unbox(JaclineUtil.m_toJsonNumber__java_lang_Number__java_lang_Object(value));
        this.obj[key] = value;
        return this;
    }

    markAdvisory(_) {
    }
    encodeArray(key, encoder, value) {
        this.obj[key] = value == null ? null : encoder(value);
        return this;
    }

    beginEncodeObject(key, type) {
        return new KeyEncoder(type, this, key);
    }

    end() {
        if (this.type != null) {
            this.obj["javaClass"] = this.type;
        }
        var p = this.parent;
        if (p == null) {
            return this;
        }
        p.obj[this.parentKey] = this.obj;
        return p;
    }

    getEncoded() {
        this.end();
        return this.obj;
    }
}

exports = KeyEncoder;
