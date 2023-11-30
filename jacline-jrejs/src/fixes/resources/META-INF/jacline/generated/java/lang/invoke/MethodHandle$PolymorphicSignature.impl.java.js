goog.module('java.lang.invoke.MethodHandle.PolymorphicSignature$impl');

const Annotation = goog.require('java.lang.annotation.Annotation$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

/**
 * @interface
 * @extends {Annotation}
 */
class PolymorphicSignature {
 /** @nodts */
 static $clinit() {
  PolymorphicSignature.$clinit = () =>{};
  PolymorphicSignature.$loadModules();
 }
 
 static $markImplementor(/** Function */ ctor) {
  Annotation.$markImplementor(ctor);
  ctor.prototype.$implements__java_lang_invoke_MethodHandle_PolymorphicSignature = true;
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance != null && !!instance.$implements__java_lang_invoke_MethodHandle_PolymorphicSignature;
 }
 
 /** @nodts */
 static $loadModules() {}
}
PolymorphicSignature.$markImplementor(/**@type {Function}*/ (PolymorphicSignature));
$Util.$setClassMetadataForInterface(PolymorphicSignature, 'java.lang.invoke.MethodHandle$PolymorphicSignature');

exports = PolymorphicSignature;

//# sourceMappingURL=MethodHandle$PolymorphicSignature.js.map
