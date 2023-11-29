goog.module('java.util.EnumSet$impl');

const Cloneable = goog.require('java.lang.Cloneable$impl');
const AbstractSet = goog.require('java.util.AbstractSet$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Class = goog.forwardDeclare('java.lang.Class$impl');
let Enum = goog.forwardDeclare('java.lang.Enum$impl');
let Collection = goog.forwardDeclare('java.util.Collection$impl');
let Iterator = goog.forwardDeclare('java.util.Iterator$impl');
let TreeMap = goog.forwardDeclare('java.util.TreeMap$impl');
let InternalPreconditions = goog.forwardDeclare('javaemul.internal.InternalPreconditions$impl');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

/**
 * @template E
 * @extends {AbstractSet<E>}
 * @implements {Cloneable}
 */
class EnumSet extends AbstractSet {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {TreeMap<E, *>} @nodts*/
  this.f_map__java_util_EnumSet_;
 }
 /** @nodts @template E @return {!EnumSet<E>} */
 static $create__() {
  EnumSet.$clinit();
  let $instance = new EnumSet();
  $instance.$ctor__java_util_EnumSet__void();
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_EnumSet__void() {
  this.$ctor__java_util_AbstractSet__void();
  this.$init__void_$p_java_util_EnumSet();
 }
 /** @nodts @return {boolean} */
 m_add__java_lang_Enum__boolean(/** E */ e) {
  let old = this.f_map__java_util_EnumSet_.put(e, this);
  return $Equality.$same(old, null);
 }
 /** @override @return {boolean} */
 remove(/** * */ o) {
  return !$Equality.$same(this.f_map__java_util_EnumSet_.remove(o), null);
 }
 /** @override @return {boolean} */
 contains(/** * */ o) {
  return this.f_map__java_util_EnumSet_.containsKey(o);
 }
 /** @override @return {number} */
 size() {
  return this.f_map__java_util_EnumSet_.size();
 }
 /** @override */
 clear() {
  this.f_map__java_util_EnumSet_.clear();
 }
 /** @override @nodts @return {Iterator<E>} */
 m_iterator__java_util_Iterator() {
  return this.f_map__java_util_EnumSet_.keySet().m_iterator__java_util_Iterator();
 }
 /** @nodts @template E_1 @return {EnumSet<E_1>} */
 static m_of__java_lang_Enum__java_util_EnumSet(/** E_1 */ first) {
  EnumSet.$clinit();
  let enumSet = /**@type {!EnumSet}*/ (EnumSet.$create__());
  enumSet.m_add__java_lang_Enum__boolean(first);
  return enumSet;
 }
 /** @nodts @template E_1 @return {EnumSet<E_1>} */
 static m_of__java_lang_Enum__arrayOf_java_lang_Enum__java_util_EnumSet(/** E_1 */ first, /** Array<E_1> */ rest) {
  EnumSet.$clinit();
  let enumSet = /**@type {!EnumSet}*/ (EnumSet.$create__());
  enumSet.m_add__java_lang_Enum__boolean(first);
  for (let $array = rest, $index = 0; $index < $array.length; $index++) {
   let e = $array[$index];
   {
    enumSet.m_add__java_lang_Enum__boolean(e);
   }
  }
  return enumSet;
 }
 /** @nodts @template E_1 @return {EnumSet<E_1>} */
 static m_copyOf__java_util_Collection__java_util_EnumSet(/** Collection<E_1> */ c) {
  EnumSet.$clinit();
  InternalPreconditions.m_checkArgument__boolean__java_lang_Object__void(!c.isEmpty(), 'Collection is empty');
  let enumSet = /**@type {!EnumSet}*/ (EnumSet.$create__());
  for (let $iterator = c.m_iterator__java_util_Iterator(); $iterator.m_hasNext__boolean(); ) {
   let e = /**@type {E_1}*/ ($Casts.$to($iterator.m_next__java_lang_Object(), Enum));
   {
    enumSet.m_add__java_lang_Enum__boolean(e);
   }
  }
  return enumSet;
 }
 /** @nodts @template E_1 @return {EnumSet<E_1>} */
 static m_noneOf__java_lang_Class__java_util_EnumSet(/** Class<E_1> */ elementType) {
  EnumSet.$clinit();
  return /**@type {!EnumSet}*/ (EnumSet.$create__());
 }
 /** @nodts @return {EnumSet<E>} */
 m_clone__java_util_EnumSet() {
  return /**@type {EnumSet<E>}*/ (EnumSet.m_copyOf__java_util_Collection__java_util_EnumSet(this));
 }
 //Bridge method.
 /** @final @override @return {boolean} */
 add(/** E */ arg0) {
  return this.m_add__java_lang_Enum__boolean(/**@type {E}*/ ($Casts.$to(arg0, Enum)));
 }
 /** @private @nodts */
 $init__void_$p_java_util_EnumSet() {
  this.f_map__java_util_EnumSet_ = /**@type {!TreeMap<E, *>}*/ (TreeMap.$create__());
 }
 /** @nodts */
 static $clinit() {
  EnumSet.$clinit = () =>{};
  EnumSet.$loadModules();
  AbstractSet.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof EnumSet;
 }
 
 /** @nodts */
 static $loadModules() {
  Enum = goog.module.get('java.lang.Enum$impl');
  TreeMap = goog.module.get('java.util.TreeMap$impl');
  InternalPreconditions = goog.module.get('javaemul.internal.InternalPreconditions$impl');
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}
Cloneable.$markImplementor(EnumSet);
$Util.$setClassMetadata(EnumSet, 'java.util.EnumSet');

exports = EnumSet;

//# sourceMappingURL=EnumSet.js.map
