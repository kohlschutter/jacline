goog.module('javaemul.internal.PrimitiveLists.Byte.$Overlay$impl');

const $Util = goog.require('nativebootstrap.Util$impl');

let JsUtils = goog.forwardDeclare('javaemul.internal.JsUtils$impl');

/** @nodts */
class $Overlay {
 /** @final @nodts @return {Array<number>} */
 static m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Byte__arrayOf_byte(/** !Array */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {Array<number>}*/ (JsUtils.uncheckedCast($thisArg));
 }
 /** @final @nodts @return {Array<number>} */
 static m_toArray__$devirt__javaemul_internal_PrimitiveLists_Byte__arrayOf_byte(/** !Array */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {Array<number>}*/ (JsUtils.uncheckedCast($thisArg));
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

//# sourceMappingURL=PrimitiveLists$Byte$$Overlay.js.map
