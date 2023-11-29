goog.module('elemental2.dom.DocumentRange.$LambdaAdaptor$impl');

const j_l_Object = goog.require('java.lang.Object$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

/**
 * @implements {DocumentRange}
 */
class $LambdaAdaptor extends j_l_Object {
 /** @nodts */
 constructor(/** ?function():Range */ fn) {
  $LambdaAdaptor.$clinit();
  super();
  /**@type {?function():Range} @nodts*/
  this.f_fn__elemental2_dom_DocumentRange_$LambdaAdaptor;
  this.$ctor__elemental2_dom_DocumentRange_$LambdaAdaptor__elemental2_dom_DocumentRange_$JsFunction__void(fn);
 }
 /** @nodts */
 $ctor__elemental2_dom_DocumentRange_$LambdaAdaptor__elemental2_dom_DocumentRange_$JsFunction__void(/** ?function():Range */ fn) {
  this.$ctor__java_lang_Object__void();
  this.f_fn__elemental2_dom_DocumentRange_$LambdaAdaptor = fn;
 }
 /** @override @return {Range} */
 createRange() {
  let /** ?function():Range */ $function;
  return ($function = this.f_fn__elemental2_dom_DocumentRange_$LambdaAdaptor, $function());
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
$Util.$setClassMetadata($LambdaAdaptor, 'elemental2.dom.DocumentRange$$LambdaAdaptor');

exports = $LambdaAdaptor;

//# sourceMappingURL=DocumentRange$$LambdaAdaptor.js.map
