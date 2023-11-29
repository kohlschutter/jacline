goog.module('java.util.ArrayListBase$impl');

const Serializable = goog.require('java.io.Serializable$impl');
const Cloneable = goog.require('java.lang.Cloneable$impl');
const AbstractList = goog.require('java.util.AbstractList$impl');
const List = goog.require('java.util.List$impl');
const RandomAccess = goog.require('java.util.RandomAccess$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let $1 = goog.forwardDeclare('java.util.ArrayListBase.$1$impl');
let Arrays = goog.forwardDeclare('java.util.Arrays$impl');
let Collection = goog.forwardDeclare('java.util.Collection$impl');
let Comparator = goog.forwardDeclare('java.util.Comparator$impl');
let Iterator = goog.forwardDeclare('java.util.Iterator$impl');
let Objects = goog.forwardDeclare('java.util.Objects$impl');
let Consumer = goog.forwardDeclare('java.util.function.Consumer$impl');
let Predicate = goog.forwardDeclare('java.util.function.Predicate$impl');
let UnaryOperator = goog.forwardDeclare('java.util.function.UnaryOperator$impl');
let ArrayHelper = goog.forwardDeclare('javaemul.internal.ArrayHelper$impl');
let InternalPreconditions = goog.forwardDeclare('javaemul.internal.InternalPreconditions$impl');
let $Arrays = goog.forwardDeclare('vmbootstrap.Arrays$impl');

/**
 * @abstract
 * @template E
 * @extends {AbstractList<E>}
 * @implements {List<E>}
 * @implements {Cloneable}
 * @implements {RandomAccess}
 * @implements {Serializable}
 */
class ArrayListBase extends AbstractList {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {Array<E>} @nodts*/
  this.f_array__java_util_ArrayListBase;
 }
 /** @nodts */
 $ctor__java_util_ArrayListBase__void() {
  this.$ctor__java_util_AbstractList__void();
 }
 /** @override @return {boolean} */
 addAll(/** Collection<?> */ c) {
  return this.addAllAtIndex(this.m_sizeImpl__int_$pp_java_util(), c);
 }
 /** @override @return {boolean} */
 contains(/** * */ o) {
  return this.indexOf(o) != (- 1 | 0);
 }
 /** @override @return {E} */
 getAtIndex(/** number */ index) {
  InternalPreconditions.m_checkElementIndex__int__int__void(index, this.m_sizeImpl__int_$pp_java_util());
  return this.f_array__java_util_ArrayListBase[index];
 }
 /** @override @return {number} */
 indexOf(/** * */ o) {
  return this.m_indexOf__java_lang_Object__int__int_$pp_java_util(o, 0);
 }
 /** @override @nodts @return {Iterator<E>} */
 m_iterator__java_util_Iterator() {
  return /**@type {!$1<E>}*/ ($1.$create__java_util_ArrayListBase(this));
 }
 /** @override @nodts */
 m_forEach__java_util_function_Consumer__void(/** Consumer<?> */ consumer) {
  InternalPreconditions.m_checkNotNull__java_lang_Object__java_lang_Object(consumer);
  let size = this.m_sizeImpl__int_$pp_java_util();
  for (let i = 0; i < size; i = i + 1 | 0) {
   consumer.m_accept__java_lang_Object__void(this.f_array__java_util_ArrayListBase[i]);
  }
 }
 /** @override @return {number} */
 lastIndexOf(/** * */ o) {
  return this.m_lastIndexOf__java_lang_Object__int__int_$pp_java_util(o, this.m_sizeImpl__int_$pp_java_util() - 1 | 0);
 }
 /** @override @return {E} */
 removeAtIndex(/** number */ index) {
  let previous = this.getAtIndex(index);
  this.m_removeImpl__int__void_$pp_java_util(index);
  return previous;
 }
 /** @override @return {boolean} */
 remove(/** * */ o) {
  let i = this.indexOf(o);
  if (i == (- 1 | 0)) {
   return false;
  }
  this.m_removeImpl__int__void_$pp_java_util(i);
  return true;
 }
 /** @abstract @nodts */
 m_removeImpl__int__void_$pp_java_util(/** number */ index) {}
 /** @override @nodts @return {boolean} */
 m_removeIf__java_util_function_Predicate__boolean(/** Predicate<?> */ filter) {
  InternalPreconditions.m_checkNotNull__java_lang_Object__java_lang_Object(filter);
  let newIndex = 0;
  let size = this.m_sizeImpl__int_$pp_java_util();
  for (let index = 0; index < size; index = index + 1 | 0) {
   let e = this.f_array__java_util_ArrayListBase[index];
   if (!filter.m_test__java_lang_Object__boolean(e)) {
    if (newIndex != index) {
     $Arrays.$set(this.f_array__java_util_ArrayListBase, newIndex, e);
    }
    newIndex = newIndex + 1 | 0;
   }
  }
  if (newIndex != size) {
   this.m_setSize__int__void_$pp_java_util(newIndex);
   return true;
  }
  return false;
 }
 /** @override @nodts */
 m_replaceAll__java_util_function_UnaryOperator__void(/** UnaryOperator<E> */ operator) {
  InternalPreconditions.m_checkNotNull__java_lang_Object__java_lang_Object(operator);
  let size = this.m_sizeImpl__int_$pp_java_util();
  for (let i = 0; i < size; i = i + 1 | 0) {
   $Arrays.$set(this.f_array__java_util_ArrayListBase, i, operator.m_apply__java_lang_Object__java_lang_Object(this.f_array__java_util_ArrayListBase[i]));
  }
 }
 /** @override @return {E} */
 setAtIndex(/** number */ index, /** E */ o) {
  let previous = this.getAtIndex(index);
  $Arrays.$set(this.f_array__java_util_ArrayListBase, index, o);
  return previous;
 }
 /** @override @return {number} */
 size() {
  return this.m_sizeImpl__int_$pp_java_util();
 }
 /** @abstract @nodts @return {number} */
 m_sizeImpl__int_$pp_java_util() {}
 /** @override @nodts @template T @return {Array<T>} */
 m_toArray__arrayOf_java_lang_Object__arrayOf_java_lang_Object(/** Array<T> */ out) {
  let size = this.m_sizeImpl__int_$pp_java_util();
  if (out.length < size) {
   out = ArrayHelper.m_createFrom__arrayOf_java_lang_Object__int__arrayOf_java_lang_Object(out, size);
  }
  for (let i = 0; i < size; i = i + 1 | 0) {
   $Arrays.$set(out, i, /**@type {T}*/ (this.f_array__java_util_ArrayListBase[i]));
  }
  if (out.length > size) {
   $Arrays.$set(out, size, null);
  }
  return out;
 }
 /** @override @nodts */
 m_sort__java_util_Comparator__void(/** Comparator<?> */ c) {
  Arrays.m_sort__arrayOf_java_lang_Object__int__int__java_util_Comparator__void(this.f_array__java_util_ArrayListBase, 0, this.m_sizeImpl__int_$pp_java_util(), c);
 }
 /** @nodts @return {number} */
 m_indexOf__java_lang_Object__int__int_$pp_java_util(/** * */ o, /** number */ index) {
  for (let size = this.m_sizeImpl__int_$pp_java_util(); index < size; index = index + 1 | 0) {
   if (Objects.m_equals__java_lang_Object__java_lang_Object__boolean(o, this.f_array__java_util_ArrayListBase[index])) {
    return index;
   }
  }
  return - 1 | 0;
 }
 /** @nodts @return {number} */
 m_lastIndexOf__java_lang_Object__int__int_$pp_java_util(/** * */ o, /** number */ index) {
  for (; index >= 0; index = index - 1 | 0) {
   if (Objects.m_equals__java_lang_Object__java_lang_Object__boolean(o, this.f_array__java_util_ArrayListBase[index])) {
    return index;
   }
  }
  return - 1 | 0;
 }
 /** @abstract @nodts */
 m_setSize__int__void_$pp_java_util(/** number */ newSize) {}
 /** @nodts */
 static $clinit() {
  ArrayListBase.$clinit = () =>{};
  ArrayListBase.$loadModules();
  AbstractList.$clinit();
  List.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof ArrayListBase;
 }
 
 /** @nodts */
 static $loadModules() {
  $1 = goog.module.get('java.util.ArrayListBase.$1$impl');
  Arrays = goog.module.get('java.util.Arrays$impl');
  Objects = goog.module.get('java.util.Objects$impl');
  ArrayHelper = goog.module.get('javaemul.internal.ArrayHelper$impl');
  InternalPreconditions = goog.module.get('javaemul.internal.InternalPreconditions$impl');
  $Arrays = goog.module.get('vmbootstrap.Arrays$impl');
 }
}
List.$markImplementor(ArrayListBase);
Cloneable.$markImplementor(ArrayListBase);
RandomAccess.$markImplementor(ArrayListBase);
Serializable.$markImplementor(ArrayListBase);
$Util.$setClassMetadata(ArrayListBase, 'java.util.ArrayListBase');

exports = ArrayListBase;

//# sourceMappingURL=ArrayListBase.js.map
