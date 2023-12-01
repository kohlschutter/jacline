goog.module('java.util.ServiceLoader.$1$impl');

const j_l_Object = goog.require('java.lang.Object$impl');
const Iterator = goog.require('java.util.Iterator$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Entry = goog.forwardDeclare('java.util.Map.Entry$impl');
let ServiceLoader = goog.forwardDeclare('java.util.ServiceLoader$impl');
let Consumer = goog.forwardDeclare('java.util.function.Consumer$impl');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');
let $JavaScriptFunction = goog.forwardDeclare('vmbootstrap.JavaScriptFunction$impl');

/**
 * @template S
 * @implements {Iterator<S>}
 */
class $1 extends j_l_Object {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {ServiceLoader<S>} @nodts*/
  this.$outer_this__java_util_ServiceLoader_1;
  /**@type {Iterator<Entry<?function():S, S>>} @nodts*/
  this.$captured_it__java_util_ServiceLoader_1;
 }
 /** @nodts @template S @return {!$1<S>} */
 static $create__java_util_ServiceLoader__java_util_Iterator(/** ServiceLoader<S> */ $outer_this, /** Iterator<Entry<?function():S, S>> */ $captured_it) {
  $1.$clinit();
  let $instance = new $1();
  $instance.$ctor__java_util_ServiceLoader_1__java_util_ServiceLoader__java_util_Iterator__void($outer_this, $captured_it);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_ServiceLoader_1__java_util_ServiceLoader__java_util_Iterator__void(/** ServiceLoader<S> */ $outer_this, /** Iterator<Entry<?function():S, S>> */ $captured_it) {
  this.$outer_this__java_util_ServiceLoader_1 = $outer_this;
  this.$captured_it__java_util_ServiceLoader_1 = $captured_it;
  this.$ctor__java_lang_Object__void();
 }
 /** @override @nodts @return {boolean} */
 m_hasNext__boolean() {
  return this.$captured_it__java_util_ServiceLoader_1.m_hasNext__boolean();
 }
 /** @override @nodts @return {S} */
 m_next__java_lang_Object() {
  let en = /**@type {Entry<?function():S, S>}*/ ($Casts.$to(this.$captured_it__java_util_ServiceLoader_1.m_next__java_lang_Object(), Entry));
  if ($Equality.$same(en.m_getValue__java_lang_Object(), null)) {
   en.m_setValue__java_lang_Object__java_lang_Object(/**@type {?function():S}*/ ($Casts.$to(en.m_getKey__java_lang_Object(), $JavaScriptFunction))());
  }
  return en.m_getValue__java_lang_Object();
 }
 //Default method forwarding stub.
 /** @override @nodts */
 m_forEachRemaining__java_util_function_Consumer__void(/** Consumer<?> */ arg0) {
  Iterator.m_forEachRemaining__$default__java_util_Iterator__java_util_function_Consumer__void(this, arg0);
 }
 //Default method forwarding stub.
 /** @override @nodts */
 m_remove__void() {
  Iterator.m_remove__$default__java_util_Iterator__void(this);
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
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
  $JavaScriptFunction = goog.module.get('vmbootstrap.JavaScriptFunction$impl');
 }
}
Iterator.$markImplementor($1);
$Util.$setClassMetadata($1, 'java.util.ServiceLoader$1');

exports = $1;

//# sourceMappingURL=ServiceLoader$1.js.map
