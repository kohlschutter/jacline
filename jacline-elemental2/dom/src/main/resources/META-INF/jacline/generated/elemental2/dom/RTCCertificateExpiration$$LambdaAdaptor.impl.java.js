goog.module('elemental2.dom.RTCCertificateExpiration.$LambdaAdaptor$impl');

const j_l_Object = goog.require('java.lang.Object$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

/**
 * @implements {RTCCertificateExpiration}
 */
class $LambdaAdaptor extends j_l_Object {
 /** @nodts */
 constructor(/** ?function():number */ fn) {
  $LambdaAdaptor.$clinit();
  super();
  /**@type {?function():number} @nodts*/
  this.f_fn__elemental2_dom_RTCCertificateExpiration_$LambdaAdaptor;
  this.$ctor__elemental2_dom_RTCCertificateExpiration_$LambdaAdaptor__elemental2_dom_RTCCertificateExpiration_$JsFunction__void(fn);
 }
 /** @nodts */
 $ctor__elemental2_dom_RTCCertificateExpiration_$LambdaAdaptor__elemental2_dom_RTCCertificateExpiration_$JsFunction__void(/** ?function():number */ fn) {
  this.$ctor__java_lang_Object__void();
  this.f_fn__elemental2_dom_RTCCertificateExpiration_$LambdaAdaptor = fn;
 }
 /** @override @return {number} */
 get expires() {
  let /** ?function():number */ $function;
  return ($function = this.f_fn__elemental2_dom_RTCCertificateExpiration_$LambdaAdaptor, $function());
 }
 /** @nodts */
 static $clinit() {
  $LambdaAdaptor.$clinit = () =>{};
  $LambdaAdaptor.$loadModules();
  j_l_Object.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof $LambdaAdaptor;
 }
 
 /** @nodts */
 static $loadModules() {}
}
$Util.$setClassMetadata($LambdaAdaptor, 'elemental2.dom.RTCCertificateExpiration$$LambdaAdaptor');

exports = $LambdaAdaptor;

//# sourceMappingURL=RTCCertificateExpiration$$LambdaAdaptor.js.map
