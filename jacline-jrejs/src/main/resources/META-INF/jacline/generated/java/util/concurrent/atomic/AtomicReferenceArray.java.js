goog.module('java.util.concurrent.atomic.AtomicReferenceArray');

goog.require('java.lang.Object');
goog.require('java.util.Arrays');
goog.require('nativebootstrap.Equality');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Arrays');

const AtomicReferenceArray = goog.require('java.util.concurrent.atomic.AtomicReferenceArray$impl');
exports = AtomicReferenceArray;
