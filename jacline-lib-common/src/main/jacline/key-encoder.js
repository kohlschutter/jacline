goog.module("kohlschutter.coding.KeyEncoder");

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

    encodeString(key, value) {
        this.obj[key] = value;
        return this;
    }
    encodeBoolean(key, value) {
        this.obj[key] = value;
        return this;
    }
    encodeNumber(key, value) {
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
        this.obj["javaClass"] = this.type;
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
