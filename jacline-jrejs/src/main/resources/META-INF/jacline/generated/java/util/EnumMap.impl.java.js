goog.module('java.util.EnumMap$impl');

const Cloneable = goog.require('java.lang.Cloneable$impl');
const AbstractMap = goog.require('java.util.AbstractMap$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Class = goog.forwardDeclare('java.lang.Class$impl');
let Enum = goog.forwardDeclare('java.lang.Enum$impl');
let Map = goog.forwardDeclare('java.util.Map$impl');
let Entry = goog.forwardDeclare('java.util.Map.Entry$impl');
let Set = goog.forwardDeclare('java.util.Set$impl');
let TreeMap = goog.forwardDeclare('java.util.TreeMap$impl');
let InternalPreconditions = goog.forwardDeclare('javaemul.internal.InternalPreconditions$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

/**
 * @template K, V
 * @extends {AbstractMap<K, V>}
 * @implements {Cloneable}
 */
class EnumMap extends AbstractMap {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {TreeMap<K, V>} @nodts*/
  this.f_map__java_util_EnumMap_;
 }
 //Factory method corresponding to constructor 'EnumMap()'.
 /** @nodts @template K, V @return {!EnumMap<K, V>} */
 static $create__() {
  EnumMap.$clinit();
  let $instance = new EnumMap();
  $instance.$ctor__java_util_EnumMap__void();
  return $instance;
 }
 //Initialization from constructor 'EnumMap()'.
 /** @nodts */
 $ctor__java_util_EnumMap__void() {
  this.$ctor__java_util_AbstractMap__void();
  this.$init__void_$p_java_util_EnumMap();
 }
 //Factory method corresponding to constructor 'EnumMap(Class)'.
 /** @nodts @template K, V @return {!EnumMap<K, V>} */
 static $create__java_lang_Class(/** Class<K> */ type) {
  EnumMap.$clinit();
  let $instance = new EnumMap();
  $instance.$ctor__java_util_EnumMap__java_lang_Class__void(type);
  return $instance;
 }
 //Initialization from constructor 'EnumMap(Class)'.
 /** @nodts */
 $ctor__java_util_EnumMap__java_lang_Class__void(/** Class<K> */ type) {
  this.$ctor__java_util_AbstractMap__void();
  this.$init__void_$p_java_util_EnumMap();
 }
 //Factory method corresponding to constructor 'EnumMap(Map)'.
 /** @nodts @template K, V @return {!EnumMap<K, V>} */
 static $create__java_util_Map(/** Map<K, ?> */ m) {
  EnumMap.$clinit();
  let $instance = new EnumMap();
  $instance.$ctor__java_util_EnumMap__java_util_Map__void(m);
  return $instance;
 }
 //Initialization from constructor 'EnumMap(Map)'.
 /** @nodts */
 $ctor__java_util_EnumMap__java_util_Map__void(/** Map<K, ?> */ m) {
  this.$ctor__java_util_AbstractMap__void();
  this.$init__void_$p_java_util_EnumMap();
  this.putAll(m);
  InternalPreconditions.m_checkArgument__boolean__void(EnumMap.$isInstance(m) || !this.isEmpty());
 }
 /** @override */
 clear() {
  this.f_map__java_util_EnumMap_.clear();
 }
 /** @nodts @return {EnumMap<K, V>} */
 m_clone__java_util_EnumMap() {
  return /**@type {!EnumMap<K, V>}*/ (EnumMap.$create__java_util_Map(this));
 }
 /** @override @return {boolean} */
 containsKey(/** * */ key) {
  return this.f_map__java_util_EnumMap_.containsKey(key);
 }
 /** @override @return {boolean} */
 containsValue(/** * */ value) {
  return this.f_map__java_util_EnumMap_.containsValue(value);
 }
 /** @override @return {Set<K>} */
 keySet() {
  return this.f_map__java_util_EnumMap_.keySet();
 }
 /** @override @nodts @return {Set<Entry<K, V>>} */
 m_entrySet__java_util_Set() {
  return this.f_map__java_util_EnumMap_.m_entrySet__java_util_Set();
 }
 /** @override @return {V} */
 get(/** * */ k) {
  return this.f_map__java_util_EnumMap_.get(k);
 }
 /** @nodts @return {V} */
 m_put__java_lang_Enum__java_lang_Object__java_lang_Object(/** K */ key, /** V */ value) {
  return this.f_map__java_util_EnumMap_.put(key, value);
 }
 /** @override @return {V} */
 remove(/** * */ key) {
  return this.f_map__java_util_EnumMap_.remove(key);
 }
 /** @override @return {number} */
 size() {
  return this.f_map__java_util_EnumMap_.size();
 }
 //Bridge method.
 /** @final @override @return {V} */
 put(/** K */ arg0, /** V */ arg1) {
  return this.m_put__java_lang_Enum__java_lang_Object__java_lang_Object(/**@type {K}*/ ($Casts.$to(arg0, Enum)), arg1);
 }
 /** @private @nodts */
 $init__void_$p_java_util_EnumMap() {
  this.f_map__java_util_EnumMap_ = /**@type {!TreeMap<K, V>}*/ (TreeMap.$create__());
 }
 /** @nodts */
 static $clinit() {
  EnumMap.$clinit = () =>{};
  EnumMap.$loadModules();
  AbstractMap.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof EnumMap;
 }
 
 /** @nodts */
 static $loadModules() {
  Enum = goog.module.get('java.lang.Enum$impl');
  TreeMap = goog.module.get('java.util.TreeMap$impl');
  InternalPreconditions = goog.module.get('javaemul.internal.InternalPreconditions$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}
Cloneable.$markImplementor(EnumMap);
$Util.$setClassMetadata(EnumMap, 'java.util.EnumMap');

exports = EnumMap;

//# sourceMappingURL=EnumMap.js.map
