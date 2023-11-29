goog.module("kohlschutter.coding.Dictionary");

/** @interface @suppress {checkTypes} */
class Dictionary {
    constructor() {
        this.dict = {};
    }

    containsKey(k) {
        return typeof this.dict[k] != "undefined";
    }

    get(k) {
        return this.dict[k];
    }

    put(k, v) {
        this.dict[k] = v;
    }

    remove(k) {
        delete this.dict[k];
    }

    static newDictionary() {
        return new Dictionary();
    }
}

exports = Dictionary;
