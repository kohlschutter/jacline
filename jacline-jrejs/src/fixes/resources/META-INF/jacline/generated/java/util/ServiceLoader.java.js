goog.module('java.util.ServiceLoader');

goog.require('java.lang.Class');
goog.require('java.lang.Iterable');
goog.require('java.lang.Object');
goog.require('java.lang.String');
goog.require('java.util.Collections');
goog.require('java.util.Iterator');
goog.require('java.util.Optional');
goog.require('java.util.Spliterator');
goog.require('java.util.function.Consumer');
goog.require('nativebootstrap.Util');

const ServiceLoader = goog.require('java.util.ServiceLoader$impl');
exports = ServiceLoader;
