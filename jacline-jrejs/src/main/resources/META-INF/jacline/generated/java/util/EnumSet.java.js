goog.module('java.util.EnumSet');

goog.require('java.lang.Class');
goog.require('java.lang.Cloneable');
goog.require('java.lang.Enum');
goog.require('java.util.AbstractSet');
goog.require('java.util.Collection');
goog.require('java.util.Iterator');
goog.require('java.util.TreeMap');
goog.require('javaemul.internal.InternalPreconditions');
goog.require('nativebootstrap.Equality');
goog.require('nativebootstrap.Util');
goog.require('vmbootstrap.Casts');

const EnumSet = goog.require('java.util.EnumSet$impl');
exports = EnumSet;
