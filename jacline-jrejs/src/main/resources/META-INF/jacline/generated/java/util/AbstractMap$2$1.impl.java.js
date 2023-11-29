goog.module('java.util.AbstractMap.$2.$1$impl');

const j_l_Object = goog.require('java.lang.Object$impl');
const Iterator = goog.require('java.util.Iterator$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let $2 = goog.forwardDeclare('java.util.AbstractMap.$2$impl');
let Entry = goog.forwardDeclare('java.util.Map.Entry$impl');
let Consumer = goog.forwardDeclare('java.util.function.Consumer$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

/**
 * @template K, V
 * @implements {Iterator<V>}
 */
class $1 extends j_l_Object {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {$2<K, V>} @nodts*/
  this.$outer_this__java_util_AbstractMap_2_1;
  /**@type {Iterator<Entry<K, V>>} @nodts*/
  this.$captured_outerIter__java_util_AbstractMap_2_1;
 }
 /** @nodts @template K, V @return {!$1<K, V>} */
 static $create__java_util_AbstractMap_2__java_util_Iterator(/** $2<K, V> */ $outer_this, /** Iterator<Entry<K, V>> */ $captured_outerIter) {
  $1.$clinit();
  let $instance = new $1();
  $instance.$ctor__java_util_AbstractMap_2_1__java_util_AbstractMap_2__java_util_Iterator__void($outer_this, $captured_outerIter);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_AbstractMap_2_1__java_util_AbstractMap_2__java_util_Iterator__void(/** $2<K, V> */ $outer_this, /** Iterator<Entry<K, V>> */ $captured_outerIter) {
  this.$outer_this__java_util_AbstractMap_2_1 = $outer_this;
  this.$captured_outerIter__java_util_AbstractMap_2_1 = $captured_outerIter;
  this.$ctor__java_lang_Object__void();
 }
 /** @override @nodts @return {boolean} */
 m_hasNext__boolean() {
  return this.$captured_outerIter__java_util_AbstractMap_2_1.m_hasNext__boolean();
 }
 /** @override @nodts @return {V} */
 m_next__java_lang_Object() {
  let entry = /**@type {Entry<K, V>}*/ ($Casts.$to(this.$captured_outerIter__java_util_AbstractMap_2_1.m_next__java_lang_Object(), Entry));
  return entry.m_getValue__java_lang_Object();
 }
 /** @override @nodts */
 m_remove__void() {
  this.$captured_outerIter__java_util_AbstractMap_2_1.m_remove__void();
 }
 //Default method forwarding stub.
 /** @override @nodts */
 m_forEachRemaining__java_util_function_Consumer__void(/** Consumer<?> */ arg0) {
  Iterator.m_forEachRemaining__$default__java_util_Iterator__java_util_function_Consumer__void(this, arg0);
 }
 /** @nodts */
 static $clinit() {
  $1.$clinit = () =>{};
  $1.$loadModules();
  j_l_Object.$clinit();
  Iterator.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof $1;
 }
 
 /** @nodts */
 static $loadModules() {
  Entry = goog.module.get('java.util.Map.Entry$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}
Iterator.$markImplementor($1);
$Util.$setClassMetadata($1, 'java.util.AbstractMap$2$1');

exports = $1;

//# sourceMappingURL=AbstractMap$2$1.js.map
