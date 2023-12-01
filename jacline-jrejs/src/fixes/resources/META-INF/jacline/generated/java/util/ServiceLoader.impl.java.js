goog.module('java.util.ServiceLoader$impl');

const Iterable = goog.require('java.lang.Iterable$impl');
const j_l_Object = goog.require('java.lang.Object$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Class = goog.forwardDeclare('java.lang.Class$impl');
let j_l_String = goog.forwardDeclare('java.lang.String$impl');
let Collections = goog.forwardDeclare('java.util.Collections$impl');
let Iterator = goog.forwardDeclare('java.util.Iterator$impl');
let Optional = goog.forwardDeclare('java.util.Optional$impl');
let Spliterator = goog.forwardDeclare('java.util.Spliterator$impl');
let Consumer = goog.forwardDeclare('java.util.function.Consumer$impl');

/**
 * @final
 * @template S
 * @implements {Iterable<S>}
 */
class ServiceLoader extends j_l_Object {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {Class<S>} @nodts*/
  this.f_service__java_util_ServiceLoader_;
 }
 /** @nodts @template S @return {!ServiceLoader<S>} */
 static $create__java_lang_Class(/** Class<S> */ service) {
  let $instance = new ServiceLoader();
  $instance.$ctor__java_util_ServiceLoader__java_lang_Class__void(service);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_ServiceLoader__java_lang_Class__void(/** Class<S> */ service) {
  this.$ctor__java_lang_Object__void();
  this.f_service__java_util_ServiceLoader_ = service;
 }
 /** @override @nodts @return {Iterator<S>} */
 m_iterator__java_util_Iterator() {
  return /**@type {Iterator<S>}*/ (Collections.m_emptyIterator__java_util_Iterator());
 }
 /** @nodts @template S_1 @return {ServiceLoader<S_1>} */
 static m_load__java_lang_Class__java_util_ServiceLoader(/** Class<S_1> */ service) {
  ServiceLoader.$clinit();
  return /**@type {!ServiceLoader<S_1>}*/ (ServiceLoader.$create__java_lang_Class(service));
 }
 /** @nodts @return {Optional<S>} */
 m_findFirst__java_util_Optional() {
  return /**@type {Optional<S>}*/ (Optional.m_empty__java_util_Optional());
 }
 /** @override @return {?string} */
 toString() {
  return 'java.util.ServiceLoader[' + j_l_String.m_valueOf__java_lang_Object__java_lang_String(this.f_service__java_util_ServiceLoader_.m_getName__java_lang_String()) + ']';
 }
 //Default method forwarding stub.
 /** @override @nodts */
 m_forEach__java_util_function_Consumer__void(/** Consumer<?> */ arg0) {
  Iterable.m_forEach__$default__java_lang_Iterable__java_util_function_Consumer__void(this, arg0);
 }
 //Default method forwarding stub.
 /** @override @nodts @return {Spliterator<S>} */
 m_spliterator__java_util_Spliterator() {
  return /**@type {Spliterator<S>}*/ (Iterable.m_spliterator__$default__java_lang_Iterable__java_util_Spliterator(this));
 }
 /** @nodts */
 static $clinit() {
  ServiceLoader.$clinit = () =>{};
  ServiceLoader.$loadModules();
  j_l_Object.$clinit();
  Iterable.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof ServiceLoader;
 }
 
 /** @nodts */
 static $loadModules() {
  j_l_String = goog.module.get('java.lang.String$impl');
  Collections = goog.module.get('java.util.Collections$impl');
  Optional = goog.module.get('java.util.Optional$impl');
 }
}
Iterable.$markImplementor(ServiceLoader);
$Util.$setClassMetadata(ServiceLoader, 'java.util.ServiceLoader');

exports = ServiceLoader;

//# sourceMappingURL=ServiceLoader.js.map
