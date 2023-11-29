goog.module('javaemul.internal.PrimitiveLists.Long.$Overlay$impl');

const $Util = goog.require('nativebootstrap.Util$impl');

let JsUtils = goog.forwardDeclare('javaemul.internal.JsUtils$impl');
let $Long = goog.forwardDeclare('nativebootstrap.Long$impl');

/** @nodts */
class $Overlay {
 /** @final @nodts @return {Array<!$Long>} */
 static m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Long__arrayOf_long(/** !Array */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {Array<!$Long>}*/ (JsUtils.uncheckedCast($thisArg));
 }
 /** @final @nodts @return {Array<!$Long>} */
 static m_toArray__$devirt__javaemul_internal_PrimitiveLists_Long__arrayOf_long(/** !Array */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {Array<!$Long>}*/ (JsUtils.uncheckedCast($thisArg));
 }
 /** @nodts */
 static $clinit() {
  $Overlay.$clinit = () =>{};
  $Overlay.$loadModules();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof Array;
 }
 
 /** @nodts */
 static $loadModules() {
  JsUtils = goog.module.get('javaemul.internal.JsUtils$impl');
 }
}
$Util.$setClassMetadata($Overlay, 'Array');

exports = $Overlay;

//# sourceMappingURL=PrimitiveLists$Long$$Overlay.js.map
