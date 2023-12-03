goog.module("kohlschutter.promise.Pledge$impl$patched");

var Pledge = goog.require("kohlschutter.promise.Pledge$impl");

/**  @suppress {checkTypes} @return {Pledge<T_1>} */
Pledge.resolveObject = function(obj) {
    return Promise.resolve(obj);
};

/**  @suppress {checkTypes} @return {Pledge<T_1>} */
Pledge.resolveThenable = function(_, obj) {
    return Promise.resolve(obj);
};

/**  @suppress {checkTypes} */
Pledge.asThrowable = function(o) {
    return o;
};

/**  @suppress {checkTypes} */
Pledge.asObject = function(o) {
    return o;
};

exports = Pledge;
