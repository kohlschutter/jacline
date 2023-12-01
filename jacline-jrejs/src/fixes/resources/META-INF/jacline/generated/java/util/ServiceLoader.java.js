goog.module('java.util.ServiceLoader');

goog.require('java.lang.Class');
goog.require('java.lang.Iterable');
goog.require('java.lang.Object');
goog.require('java.lang.String');
goog.require('java.util.Collection');
goog.require('java.util.Collections');
goog.require('java.util.HashMap');
goog.require('java.util.Iterator');
goog.require('java.util.LinkedHashSet');
goog.require('java.util.Map');
goog.require('java.util.Optional');
goog.require('java.util.Spliterator');
goog.require('java.util.function.Consumer');
goog.require('java.util.function.Function');
goog.require('nativebootstrap.Equality');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Casts');

const ServiceLoader = goog.require('java.util.ServiceLoader$impl');
exports = ServiceLoader;
