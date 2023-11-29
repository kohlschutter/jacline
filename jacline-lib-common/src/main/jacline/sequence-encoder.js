goog.module("kohlschutter.coding.SequenceEncoder");

// FIXME type checking
class SequenceEncoder {
    constructor(...args) {
        this.out = [];
        this.parent = args[0];
    }

    static begin() {
        return new SequenceEncoder();
    }

    getEncoded() {
        return this.out;
    }

    encodeStrings(...value) {
        for (var i = 0, n = value.length; i < n; i++) {
            var v = value[i];
            this.out.push(v);
        }
        return this;
    }

    encodeBooleans(...value) {
        for (var i = 0, n = value.length; i < n; i++) {
            var v = value[i];
            this.out.push(v);
        }
        return this;
    }

    encodeNumbers(...value) {
        for (var i = 0, n = value.length; i < n; i++) {
            var v = value[i];
            this.out.push(v);
        }
        return this;
    }

    beginEncodeArray() {
        return new SequenceEncoder(this);
    }

    end() {
        if (this.parent) {
            this.parent.out.push(this.out);
            return this.parent;
        } else {
            return this;
        }
    }

    encodeObjects(encoder, ...value) {
        for (var i = 0, n = value.length; i < n; i++) {
            var obj = value[i];
            obj = encoder(obj);
            this.out.push(obj);
        }
        return this;
    }
}

exports = SequenceEncoder;
