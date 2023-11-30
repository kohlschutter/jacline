goog.module("kohlschutter.coding.KeyDecoder");

// FIXME type checking
class KeyDecoder {
    constructor(o) {
        this.o = o;
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
            // FIXME check type
        }
        return new KeyDecoder(o);
    }
}

exports = KeyDecoder;
