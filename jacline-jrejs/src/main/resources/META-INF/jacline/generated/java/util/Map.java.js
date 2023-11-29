goog.module('java.util.Map');

goog.require('java.util.Collection');
goog.require('java.util.Map.Entry');
goog.require('java.util.Objects');
goog.require('java.util.Set');
goog.require('java.util.function.BiConsumer');
goog.require('java.util.function.BiFunction');
goog.require('java.util.function.Function');
goog.require('javaemul.internal.InternalPreconditions');
goog.require('nativebootstrap.Equality');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Casts');

const Map = goog.require('java.util.Map$impl');
exports = Map;