goog.module('java.util.Arrays');

goog.require('java.lang.Boolean');
goog.require('java.lang.Byte');
goog.require('java.lang.Character');
goog.require('java.lang.Comparable');
goog.require('java.lang.Double');
goog.require('java.lang.Float');
goog.require('java.lang.Integer');
goog.require('java.lang.Long');
goog.require('java.lang.Object');
goog.require('java.lang.Short');
goog.require('java.lang.String');
goog.require('java.util.Arrays.ArrayList');
goog.require('java.util.Comparator');
goog.require('java.util.Comparators');
goog.require('java.util.HashSet');
goog.require('java.util.List');
goog.require('java.util.Objects');
goog.require('java.util.Set');
goog.require('java.util.Spliterator');
goog.require('java.util.Spliterator.OfDouble');
goog.require('java.util.Spliterator.OfInt');
goog.require('java.util.Spliterator.OfLong');
goog.require('java.util.Spliterators');
goog.require('java.util.StringJoiner');
goog.require('java.util.function.BinaryOperator');
goog.require('java.util.function.DoubleBinaryOperator');
goog.require('java.util.function.IntBinaryOperator');
goog.require('java.util.function.IntFunction');
goog.require('java.util.function.IntToDoubleFunction');
goog.require('java.util.function.IntToLongFunction');
goog.require('java.util.function.IntUnaryOperator');
goog.require('java.util.function.LongBinaryOperator');
goog.require('java.util.stream.DoubleStream');
goog.require('java.util.stream.IntStream');
goog.require('java.util.stream.LongStream');
goog.require('java.util.stream.Stream');
goog.require('java.util.stream.StreamSupport');
goog.require('javaemul.internal.ArrayHelper');
goog.require('javaemul.internal.InternalPreconditions');
goog.require('nativebootstrap.Equality');
goog.require('nativebootstrap.Long');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Arrays');
goog.require('vmbootstrap.Asserts');
goog.require('vmbootstrap.LongUtils');
goog.require('vmbootstrap.Objects');
goog.require('vmbootstrap.primitives.$boolean');
goog.require('vmbootstrap.primitives.$byte');
goog.require('vmbootstrap.primitives.$char');
goog.require('vmbootstrap.primitives.$double');
goog.require('vmbootstrap.primitives.$float');
goog.require('vmbootstrap.primitives.$int');
goog.require('vmbootstrap.primitives.$long');
goog.require('vmbootstrap.primitives.$short');

const Arrays = goog.require('java.util.Arrays$impl');
exports = Arrays;
