goog.module("kohlschutter.coding.SequenceDecoder");

// FIXME type checking
class SequenceDecoder {
    constructor(o) {
        this.o = o;
        this.pos = 0;
    }

    close() {
        this.o = null;
    }

    /** @export */
    m_close__void() {
        this.close();
    }

    position() {
        return this.pos;
    }

    size() {
        if (this.o) {
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

    strings(count, consumer) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos];
            try {
                // FIXME check type
                consumer(obj);
            } finally {
                this.pos++;
            }
        }
        return this;
    }

    booleans(count, consumer) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos];
            try {
                // FIXME check type
                consumer(obj);
            } finally {
                this.pos++;
            }
        }
        return this;
    }

    numbers(count, consumer) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos];
            try {
                // FIXME check type
                consumer(obj);
            } finally {
                this.pos++;
            }
        }
        return this;
    }

    arrays(count, decoder, consumer) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos];
            try {
                if (decoder) {
                    obj = decoder(obj);
                }
                consumer(obj);
            } finally {
                this.pos++;
            }
        }
        return this;
    }

    objects(count, decoder, consumer) {
        count = this._checkCount(count);
        for (var i = 0; i < count; i++) {
            var obj = this.o[this.pos];
            try {
                if (decoder) {
                    obj = decoder(obj);
                }
                consumer(obj);
            } finally {
                this.pos++;
            }
        }
        return this;
    }

    static load(o) {
        // FIXME check that o is an array
        return new SequenceDecoder(o);
    }
}

exports = SequenceDecoder;
