goog.module('elemental2.dom.RTCCertificateExpiration.$Overlay$impl');

let $LambdaAdaptor = goog.forwardDeclare('elemental2.dom.RTCCertificateExpiration.$LambdaAdaptor$impl');

/** @nodts */
class $Overlay {
 /** @nodts @return {RTCCertificateExpiration} */
 static $adapt__elemental2_dom_RTCCertificateExpiration_$JsFunction__elemental2_dom_RTCCertificateExpiration(/** ?function():number */ fn) {
  $Overlay.$clinit();
  return new $LambdaAdaptor(fn);
 }
 /** @nodts */
 static $clinit() {
  $Overlay.$clinit = () =>{};
  $Overlay.$loadModules();
 }
 
 /** @nodts */
 static $loadModules() {
  $LambdaAdaptor = goog.module.get('elemental2.dom.RTCCertificateExpiration.$LambdaAdaptor$impl');
 }
}

exports = $Overlay;

//# sourceMappingURL=RTCCertificateExpiration$$Overlay.js.map
