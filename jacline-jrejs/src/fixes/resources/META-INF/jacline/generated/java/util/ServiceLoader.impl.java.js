goog.module('java.util.ServiceLoader$impl');

const Iterable = goog.require('java.lang.Iterable$impl');
const j_l_Object = goog.require('java.lang.Object$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Class = goog.forwardDeclare('java.lang.Class$impl');
let j_l_String = goog.forwardDeclare('java.lang.String$impl');
let Collections = goog.forwardDeclare('java.util.Collections$impl');
let HashMap = goog.forwardDeclare('java.util.HashMap$impl');
let Iterator = goog.forwardDeclare('java.util.Iterator$impl');
let LinkedHashMap = goog.forwardDeclare('java.util.LinkedHashMap$impl');
let Map = goog.forwardDeclare('java.util.Map$impl');
let Optional = goog.forwardDeclare('java.util.Optional$impl');
let $1 = goog.forwardDeclare('java.util.ServiceLoader.$1$impl');
let Spliterator = goog.forwardDeclare('java.util.Spliterator$impl');
let Consumer = goog.forwardDeclare('java.util.function.Consumer$impl');
let j_u_function_Function = goog.forwardDeclare('java.util.function.Function$impl');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

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
  /**@type {Map<?function():S, S>} @nodts*/
  this.f_implementations__java_util_ServiceLoader_;
 }
 /** @nodts @template S @return {!ServiceLoader<S>} */
 static $create__java_lang_Class__java_util_Map(/** Class<S> */ service, /** Map<?function():S, S> */ implementations) {
  let $instance = new ServiceLoader();
  $instance.$ctor__java_util_ServiceLoader__java_lang_Class__java_util_Map__void(service, implementations);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_ServiceLoader__java_lang_Class__java_util_Map__void(/** Class<S> */ service, /** Map<?function():S, S> */ implementations) {
  this.$ctor__java_lang_Object__void();
  this.f_service__java_util_ServiceLoader_ = service;
  this.f_implementations__java_util_ServiceLoader_ = implementations;
 }
 /** @override @nodts @return {Iterator<S>} */
 m_iterator__java_util_Iterator() {
  if ($Equality.$same(this.f_implementations__java_util_ServiceLoader_, null)) {
   return /**@type {Iterator<S>}*/ (Collections.m_emptyIterator__java_util_Iterator());
  } else {
   let it = this.f_implementations__java_util_ServiceLoader_.m_entrySet__java_util_Set().m_iterator__java_util_Iterator();
   return /**@type {!$1<S>}*/ ($1.$create__java_util_ServiceLoader__java_util_Iterator(this, it));
  }
 }
 /** @nodts @template S_1 */
 static m_jaclineRegisterService__java_lang_Class__java_util_ServiceLoader_ServiceProvider__void(/** Class<S_1> */ service, /** ?function():S_1 */ implementation) {
  ServiceLoader.$clinit();
  /**@type {Map<?function():?, *>}*/ ($Casts.$to(ServiceLoader.f_JS_SERVICE_PROVIDERS__java_util_ServiceLoader_.m_computeIfAbsent__java_lang_Object__java_util_function_Function__java_lang_Object(service.toString(), j_u_function_Function.$adapt((k) =>{
   let k_1 = /**@type {?string}*/ ($Casts.$to(k, j_l_String));
   return /**@type {!LinkedHashMap<?function():?, *>}*/ (LinkedHashMap.$create__());
  })), Map)).put(implementation, null);
 }
 /** @nodts @template S_1 @return {ServiceLoader<S_1>} */
 static m_load__java_lang_Class__java_util_ServiceLoader(/** Class<S_1> */ service) {
  ServiceLoader.$clinit();
  return /**@type {!ServiceLoader<S_1>}*/ (ServiceLoader.$create__java_lang_Class__java_util_Map(service, /**@type {Map<?function():S_1, S_1>}*/ ($Casts.$to(ServiceLoader.f_JS_SERVICE_PROVIDERS__java_util_ServiceLoader_.get(service.toString()), Map))));
 }
 /** @nodts @return {Optional<S>} */
 m_findFirst__java_util_Optional() {
  if ($Equality.$same(this.f_implementations__java_util_ServiceLoader_, null) || this.f_implementations__java_util_ServiceLoader_.isEmpty()) {
   return /**@type {Optional<S>}*/ (Optional.m_empty__java_util_Optional());
  } else {
   return /**@type {Optional<S>}*/ (Optional.m_of__java_lang_Object__java_util_Optional(this.m_iterator__java_util_Iterator().m_next__java_lang_Object()));
  }
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
  ServiceLoader.f_JS_SERVICE_PROVIDERS__java_util_ServiceLoader_ = /**@type {!HashMap<?string, Map<?function():?, ?>>}*/ (HashMap.$create__());
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof ServiceLoader;
 }
 
 /** @nodts */
 static $loadModules() {
  j_l_String = goog.module.get('java.lang.String$impl');
  Collections = goog.module.get('java.util.Collections$impl');
  HashMap = goog.module.get('java.util.HashMap$impl');
  LinkedHashMap = goog.module.get('java.util.LinkedHashMap$impl');
  Map = goog.module.get('java.util.Map$impl');
  Optional = goog.module.get('java.util.Optional$impl');
  $1 = goog.module.get('java.util.ServiceLoader.$1$impl');
  j_u_function_Function = goog.module.get('java.util.function.Function$impl');
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}
/**@type {Map<?string, Map<?function():?, ?>>} @nodts*/
ServiceLoader.f_JS_SERVICE_PROVIDERS__java_util_ServiceLoader_;
Iterable.$markImplementor(ServiceLoader);
$Util.$setClassMetadata(ServiceLoader, 'java.util.ServiceLoader');

exports = ServiceLoader;

//# sourceMappingURL=ServiceLoader.js.map
