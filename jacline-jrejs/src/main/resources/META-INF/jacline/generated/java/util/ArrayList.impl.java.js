goog.module('java.util.ArrayList$impl');

const ArrayListBase = goog.require('java.util.ArrayListBase$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let j_l_Object = goog.forwardDeclare('java.lang.Object$impl');
let Collection = goog.forwardDeclare('java.util.Collection$impl');
let ArrayHelper = goog.forwardDeclare('javaemul.internal.ArrayHelper$impl');
let InternalPreconditions = goog.forwardDeclare('javaemul.internal.InternalPreconditions$impl');
let $Arrays = goog.forwardDeclare('vmbootstrap.Arrays$impl');

/**
 * @template E
 * @extends {ArrayListBase<E>}
 */
class ArrayList extends ArrayListBase {
 /** @protected @nodts */
 constructor() {
  super();
 }
 //Factory method corresponding to constructor 'ArrayList()'.
 /** @nodts @template E @return {!ArrayList<E>} */
 static $create__() {
  ArrayList.$clinit();
  let $instance = new ArrayList();
  $instance.$ctor__java_util_ArrayList__void();
  return $instance;
 }
 //Initialization from constructor 'ArrayList()'.
 /** @nodts */
 $ctor__java_util_ArrayList__void() {
  this.$ctor__java_util_ArrayListBase__void();
  this.f_array__java_util_ArrayListBase = /**@type {!Array<E>}*/ (new Array(0));
 }
 //Factory method corresponding to constructor 'ArrayList(Collection)'.
 /** @nodts @template E @return {!ArrayList<E>} */
 static $create__java_util_Collection(/** Collection<?> */ c) {
  ArrayList.$clinit();
  let $instance = new ArrayList();
  $instance.$ctor__java_util_ArrayList__java_util_Collection__void(c);
  return $instance;
 }
 //Initialization from constructor 'ArrayList(Collection)'.
 /** @nodts */
 $ctor__java_util_ArrayList__java_util_Collection__void(/** Collection<?> */ c) {
  this.$ctor__java_util_ArrayList__void();
  this.m_addAllImpl__int__java_util_Collection__boolean_$p_java_util_ArrayList(0, c);
 }
 //Factory method corresponding to constructor 'ArrayList(int)'.
 /** @nodts @template E @return {!ArrayList<E>} */
 static $create__int(/** number */ initialCapacity) {
  ArrayList.$clinit();
  let $instance = new ArrayList();
  $instance.$ctor__java_util_ArrayList__int__void(initialCapacity);
  return $instance;
 }
 //Initialization from constructor 'ArrayList(int)'.
 /** @nodts */
 $ctor__java_util_ArrayList__int__void(/** number */ initialCapacity) {
  this.$ctor__java_util_ArrayList__void();
  InternalPreconditions.m_checkArgument__boolean__java_lang_Object__void(initialCapacity >= 0, 'Initial capacity must not be negative');
 }
 /** @override @return {boolean} */
 add(/** E */ o) {
  ArrayHelper.m_push__arrayOf_java_lang_Object__java_lang_Object__void(this.f_array__java_util_ArrayListBase, o);
  return true;
 }
 /** @override */
 addAtIndex(/** number */ index, /** E */ o) {
  InternalPreconditions.m_checkPositionIndex__int__int__void(index, this.f_array__java_util_ArrayListBase.length);
  ArrayHelper.m_insertTo__arrayOf_java_lang_Object__int__java_lang_Object__void(this.f_array__java_util_ArrayListBase, index, o);
 }
 /** @override @return {boolean} */
 addAllAtIndex(/** number */ index, /** Collection<?> */ c) {
  InternalPreconditions.m_checkPositionIndex__int__int__void(index, this.f_array__java_util_ArrayListBase.length);
  return this.m_addAllImpl__int__java_util_Collection__boolean_$p_java_util_ArrayList(index, c);
 }
 /** @nodts @return {boolean} */
 m_addAllImpl__int__java_util_Collection__boolean_$p_java_util_ArrayList(/** number */ insertIndex, /** Collection<?> */ c) {
  let values = c.toArray();
  let len = values.length;
  if (len == 0) {
   return false;
  }
  let newLength = this.f_array__java_util_ArrayListBase.length + len | 0;
  ArrayHelper.m_setLength__java_lang_Object__int__java_lang_Object(this.f_array__java_util_ArrayListBase, newLength);
  let insertEndIndex = insertIndex + len | 0;
  ArrayHelper.m_copy__java_lang_Object__int__java_lang_Object__int__int__void(this.f_array__java_util_ArrayListBase, insertIndex, this.f_array__java_util_ArrayListBase, insertEndIndex, newLength - insertEndIndex | 0);
  ArrayHelper.m_copy__java_lang_Object__int__java_lang_Object__int__int__void(values, 0, this.f_array__java_util_ArrayListBase, insertIndex, len);
  return true;
 }
 /** @nodts @return {*} */
 m_clone__java_lang_Object() {
  return /**@type {!ArrayList<E>}*/ (ArrayList.$create__java_util_Collection(this));
 }
 /** @nodts */
 m_ensureCapacity__int__void(/** number */ ignored) {}
 /** @override @nodts */
 m_removeImpl__int__void_$pp_java_util(/** number */ index) {
  ArrayHelper.m_removeFrom__arrayOf_java_lang_Object__int__int__void(this.f_array__java_util_ArrayListBase, index, 1);
 }
 /** @override @nodts @return {number} */
 m_sizeImpl__int_$pp_java_util() {
  return this.f_array__java_util_ArrayListBase.length;
 }
 /** @override @return {Array<*>} */
 toArray() {
  return /**@type {Array<*>}*/ ($Arrays.$castTo(ArrayHelper.m_clone__java_lang_Object__java_lang_Object(this.f_array__java_util_ArrayListBase), j_l_Object, 1));
 }
 /** @nodts */
 m_trimToSize__void() {}
 /** @override @nodts */
 m_removeRange__int__int__void(/** number */ fromIndex, /** number */ endIndex) {
  InternalPreconditions.m_checkPositionIndexes__int__int__int__void(fromIndex, endIndex, this.f_array__java_util_ArrayListBase.length);
  let count = endIndex - fromIndex | 0;
  ArrayHelper.m_removeFrom__arrayOf_java_lang_Object__int__int__void(this.f_array__java_util_ArrayListBase, fromIndex, count);
 }
 /** @override @nodts */
 m_setSize__int__void_$pp_java_util(/** number */ newSize) {
  ArrayHelper.m_setLength__java_lang_Object__int__java_lang_Object(this.f_array__java_util_ArrayListBase, newSize);
 }
 /** @nodts */
 static $clinit() {
  ArrayList.$clinit = () =>{};
  ArrayList.$loadModules();
  ArrayListBase.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof ArrayList;
 }
 
 /** @nodts */
 static $loadModules() {
  j_l_Object = goog.module.get('java.lang.Object$impl');
  ArrayHelper = goog.module.get('javaemul.internal.ArrayHelper$impl');
  InternalPreconditions = goog.module.get('javaemul.internal.InternalPreconditions$impl');
  $Arrays = goog.module.get('vmbootstrap.Arrays$impl');
 }
}
$Util.$setClassMetadata(ArrayList, 'java.util.ArrayList');

exports = ArrayList;

//# sourceMappingURL=ArrayList.js.map
