goog.module("kohlschutter.coding.KeyDecoder");

const DecodingException = goog.require("com.kohlschutter.jacline.lib.coding.DecodingException");

// FIXME type checking
class KeyDecoder {
    constructor(o) {
        this.o = o;
    }

    close() {
        this.o = null;
    }

    /** @export */
    m_close__void() {
        this.close();
    }

    hasKey(k) {
        return this.o[k] != null;
    }

    numberForKey(k) {
        return this.o[k];
    }

    booleanForKey(k) {
        return this.o[k];
    }

    stringForKey(k) {
        return this.o[k];
    }

    arrayForKey(k, dp) {
        return dp(this.o[k]);
    }

    objectForKey(k, decoder) {
        var obj = this.o[k];
        if (obj) {
            return decoder(obj);
        } else {
            return null;
        }
    }

    static load(expectedType, o) {
        if (expectedType) {
            if (o["javaClass"] != expectedType) {
                throw DecodingException.withUnexpectedType(expectedType, o["javaClass"]);
            }
        }
        return new KeyDecoder(o);
    }
}

exports = KeyDecoder;
