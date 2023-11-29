goog.module('java.util.Collections.UnmodifiableCollection');

goog.require('java.lang.Iterable');
goog.require('java.lang.Object');
goog.require('java.lang.UnsupportedOperationException');
goog.require('java.util.Collection');
goog.require('java.util.Collections.UnmodifiableCollectionIterator');
goog.require('java.util.Iterator');
goog.require('java.util.Spliterator');
goog.require('java.util.function.Consumer');
goog.require('java.util.function.Predicate');
goog.require('java.util.stream.Stream');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Exceptions');
goog.require('vmbootstrap.Objects');

const UnmodifiableCollection = goog.require('java.util.Collections.UnmodifiableCollection$impl');
exports = UnmodifiableCollection;
