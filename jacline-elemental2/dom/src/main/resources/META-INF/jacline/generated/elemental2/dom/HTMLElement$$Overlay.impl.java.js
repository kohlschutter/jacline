goog.module('elemental2.dom.HTMLElement.$Overlay$impl');

const $Util = goog.require('nativebootstrap.Util$impl');

let Js = goog.forwardDeclare('jsinterop.base.Js$impl');

/** @nodts */
class $Overlay {
 /** @final @nodts @return {*} */
 static m_formStateRestoreCallback__$devirt__elemental2_dom_HTMLElement__elemental2_dom_File__java_lang_String__java_lang_Object(/** !HTMLElement */ $thisArg, /** File */ state, /** ?string */ reason) {
  $Overlay.$clinit();
  return $thisArg.formStateRestoreCallback(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(state)), reason);
 }
 /** @final @nodts @return {*} */
 static m_formStateRestoreCallback__$devirt__elemental2_dom_HTMLElement__arrayOf_arrayOf_elemental2_dom_HTMLElement_FormStateRestoreCallbackStateArrayArrayUnionType__java_lang_String__java_lang_Object(/** !HTMLElement */ $thisArg, /** Array<Array<?>> */ state, /** ?string */ reason) {
  $Overlay.$clinit();
  return $Overlay.m_formStateRestoreCallback__$devirt__elemental2_dom_HTMLElement__elemental2_core_JsArray__java_lang_String__java_lang_Object($thisArg, /**@type {Array<Array<?>>}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(state)), reason);
 }
 /** @final @nodts @return {*} */
 static m_formStateRestoreCallback__$devirt__elemental2_dom_HTMLElement__elemental2_core_JsArray__java_lang_String__java_lang_Object(/** !HTMLElement */ $thisArg, /** Array<Array<?>> */ state, /** ?string */ reason) {
  $Overlay.$clinit();
  return $thisArg.formStateRestoreCallback(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(state)), reason);
 }
 /** @final @nodts @return {*} */
 static m_formStateRestoreCallback__$devirt__elemental2_dom_HTMLElement__java_lang_String__java_lang_String__java_lang_Object(/** !HTMLElement */ $thisArg, /** ?string */ state, /** ?string */ reason) {
  $Overlay.$clinit();
  return $thisArg.formStateRestoreCallback(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(state)), reason);
 }
 /** @nodts */
 static $clinit() {
  $Overlay.$clinit = () =>{};
  $Overlay.$loadModules();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof HTMLElement;
 }
 
 /** @nodts */
 static $loadModules() {
  Js = goog.module.get('jsinterop.base.Js$impl');
 }
}
$Util.$setClassMetadata($Overlay, 'HTMLElement');

exports = $Overlay;

//# sourceMappingURL=HTMLElement$$Overlay.js.map
