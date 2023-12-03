goog.module('java.util.concurrent.CompletionException$impl');

const RuntimeException = goog.require('java.lang.RuntimeException$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Throwable = goog.forwardDeclare('java.lang.Throwable$impl');

class CompletionException extends RuntimeException {
 /** @protected @nodts */
 constructor() {
  super();
 }
 //Factory method corresponding to constructor 'CompletionException(String, Throwable)'.
 /** @nodts @return {!CompletionException} */
 static $create__java_lang_String__java_lang_Throwable(/** ?string */ message, /** Throwable */ cause) {
  CompletionException.$clinit();
  let $instance = new CompletionException();
  $instance.$ctor__java_util_concurrent_CompletionException__java_lang_String__java_lang_Throwable__void(message, cause);
  $instance.m_privateInitError__java_lang_Object__void_$pp_java_lang(new Error($instance));
  return $instance;
 }
 //Initialization from constructor 'CompletionException(String, Throwable)'.
 /** @nodts */
 $ctor__java_util_concurrent_CompletionException__java_lang_String__java_lang_Throwable__void(/** ?string */ message, /** Throwable */ cause) {
  this.$ctor__java_lang_RuntimeException__java_lang_String__java_lang_Throwable__void(message, cause);
 }
 //Factory method corresponding to constructor 'CompletionException(Throwable)'.
 /** @nodts @return {!CompletionException} */
 static $create__java_lang_Throwable(/** Throwable */ cause) {
  CompletionException.$clinit();
  let $instance = new CompletionException();
  $instance.$ctor__java_util_concurrent_CompletionException__java_lang_Throwable__void(cause);
  $instance.m_privateInitError__java_lang_Object__void_$pp_java_lang(new Error($instance));
  return $instance;
 }
 //Initialization from constructor 'CompletionException(Throwable)'.
 /** @nodts */
 $ctor__java_util_concurrent_CompletionException__java_lang_Throwable__void(/** Throwable */ cause) {
  this.$ctor__java_lang_RuntimeException__java_lang_Throwable__void(cause);
 }
 /** @nodts */
 static $clinit() {
  CompletionException.$clinit = () =>{};
  CompletionException.$loadModules();
  RuntimeException.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof CompletionException;
 }
 
 /** @nodts */
 static $loadModules() {}
}
$Util.$setClassMetadata(CompletionException, 'java.util.concurrent.CompletionException');

exports = CompletionException;

//# sourceMappingURL=CompletionException.js.map
