goog.module("kohlschutter.pledge.Pledge$impl$patched");

var Pledge = goog.require("kohlschutter.pledge.Pledge$impl");

/**  @suppress {checkTypes} @template T_1 @return {Pledge<T_1>} */
Pledge.ofResolved = function(obj) {
    return Promise.resolve(obj);
};

/**  @suppress {checkTypes} @template T_1 @return {Pledge<T_1>} */
Pledge.ofThenable = function(thenable) {
    return Promise.resolve(thenable);
};

/**  @suppress {checkTypes} @template T_1 @return {Pledge<T_1>} */
Pledge.ofRejected = function(err) {
    return Promise.reject(err);
};

/**  @suppress {checkTypes} @template T_1 return {Pledge<T_1>} */
Pledge.allOf = function(_, pledges) {
    return Promise.all(pledges);
};

/**  @suppress {checkTypes} @template T_1 @return {Pledge<T_1>} */
Pledge.firstToSettle = function(pledges) {
    return Promise.race(pledges);
};

/**  @suppress {checkTypes} @template T_1 @return {Pledge<T_1>} */
Pledge.firstToSucceed = function(pledges) {
    return Promise.any(pledges);
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
