goog.module('java.util.Spliterators');

goog.require('java.lang.ArrayIndexOutOfBoundsException');
goog.require('java.lang.Object');
goog.require('java.util.Collection');
goog.require('java.util.Iterator');
goog.require('java.util.PrimitiveIterator.OfDouble');
goog.require('java.util.PrimitiveIterator.OfInt');
goog.require('java.util.PrimitiveIterator.OfLong');
goog.require('java.util.Spliterator');
goog.require('java.util.Spliterator.OfDouble');
goog.require('java.util.Spliterator.OfInt');
goog.require('java.util.Spliterator.OfLong');
goog.require('java.util.Spliterators.ArraySpliterator');
goog.require('java.util.Spliterators.ConsumerIterator');
goog.require('java.util.Spliterators.DoubleArraySpliterator');
goog.require('java.util.Spliterators.DoubleConsumerIterator');
goog.require('java.util.Spliterators.DoubleIteratorSpliterator');
goog.require('java.util.Spliterators.EmptySpliterator');
goog.require('java.util.Spliterators.IntArraySpliterator');
goog.require('java.util.Spliterators.IntConsumerIterator');
goog.require('java.util.Spliterators.IntIteratorSpliterator');
goog.require('java.util.Spliterators.IteratorSpliterator');
goog.require('java.util.Spliterators.LongArraySpliterator');
goog.require('java.util.Spliterators.LongConsumerIterator');
goog.require('java.util.Spliterators.LongIteratorSpliterator');
goog.require('javaemul.internal.InternalPreconditions');
goog.require('nativebootstrap.Long');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Exceptions');

const Spliterators = goog.require('java.util.Spliterators$impl');
exports = Spliterators;
