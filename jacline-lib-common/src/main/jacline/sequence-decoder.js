goog.module("kohlschutter.coding.SequenceDecoder");

// FIXME type checking
class SequenceDecoder {
    constructor(o) {
        this.o = o;
        this.out = [];
        this.pos = 0;
    }

    size() {
        if(this.o) {
            return this.o.length;
        } else {
            return 0;
        }
    }

    _checkCount(count) {
        if (this.o == null) {
            return null;
        } else if (count < 0) {
            return this.o.length;
        } else if (this.pos + count > this.o.length) {
            return this.o.length - this.pos;
        } else {
            return count;
        }
    }

    strings(count) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos++];
            // FIXME check type
            this.out.push(obj);
        }
        return this;
    }

    booleans(count) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos++];
            // FIXME check type
            this.out.push(obj);
        }
        return this;
    }

    numbers(count) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos++];
            // FIXME check type
            this.out.push(obj);
        }
        return this;
    }

    arrays(count, decoder) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos++];
            // FIXME check type
            obj = decoder(obj);
            this.out.push(obj);
        }
        return this;
    }

    objects(count, expectedType, decoder) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos++];
            // FIXME check type
            obj = decoder(obj);
            this.out.push(obj);
        }
        return this;
    }

    getArray() {
        if (this.o) {
            return this.out;
        } else {
            return null;
        }
    }

    static load(o) {
        // FIXME check that o is an array
        return new SequenceDecoder(o);
    }
}

exports = SequenceDecoder;
