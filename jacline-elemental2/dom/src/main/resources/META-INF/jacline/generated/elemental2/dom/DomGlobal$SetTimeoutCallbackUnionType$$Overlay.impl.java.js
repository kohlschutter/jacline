goog.module('elemental2.dom.DomGlobal.SetTimeoutCallbackUnionType.$Overlay$impl');

let TrustedScript_$Overlay = goog.forwardDeclare('elemental2.core.TrustedScript.$Overlay$impl');
let j_l_String = goog.forwardDeclare('java.lang.String$impl');
let Js = goog.forwardDeclare('jsinterop.base.Js$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');
let $JavaScriptFunction = goog.forwardDeclare('vmbootstrap.JavaScriptFunction$impl');

/** @nodts */
class $Overlay {
 /** @nodts @return {?} */
 static m_of__java_lang_Object__elemental2_dom_DomGlobal_SetTimeoutCallbackUnionType(/** * */ o) {
  $Overlay.$clinit();
  return /**@type {?}*/ (Js.m_cast__java_lang_Object__java_lang_Object(o));
 }
 /** @nodts @return {?function(...*):void} */
 static m_asSetTimeoutCallbackFn__$devirt__elemental2_dom_DomGlobal_SetTimeoutCallbackUnionType__elemental2_dom_DomGlobal_SetTimeoutCallbackFn(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {?function(...*):void}*/ ($Casts.$to(Js.m_cast__java_lang_Object__java_lang_Object($thisArg), $JavaScriptFunction));
 }
 /** @nodts @return {?string} */
 static m_asString__$devirt__elemental2_dom_DomGlobal_SetTimeoutCallbackUnionType__java_lang_String(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Js.m_asString__java_lang_Object__java_lang_String($thisArg);
 }
 /** @nodts @return {TrustedScript} */
 static m_asTrustedScript__$devirt__elemental2_dom_DomGlobal_SetTimeoutCallbackUnionType__elemental2_core_TrustedScript(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {TrustedScript}*/ ($Casts.$to(Js.m_cast__java_lang_Object__java_lang_Object($thisArg), TrustedScript_$Overlay));
 }
 /** @nodts @return {boolean} */
 static m_isSetTimeoutCallbackFn__$devirt__elemental2_dom_DomGlobal_SetTimeoutCallbackUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return $JavaScriptFunction.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isString__$devirt__elemental2_dom_DomGlobal_SetTimeoutCallbackUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return j_l_String.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isTrustedScript__$devirt__elemental2_dom_DomGlobal_SetTimeoutCallbackUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return TrustedScript_$Overlay.$isInstance($thisArg);
 }
 /** @nodts */
 static $clinit() {
  $Overlay.$clinit = () =>{};
  $Overlay.$loadModules();
 }
 
 /** @nodts */
 static $loadModules() {
  TrustedScript_$Overlay = goog.module.get('elemental2.core.TrustedScript.$Overlay$impl');
  j_l_String = goog.module.get('java.lang.String$impl');
  Js = goog.module.get('jsinterop.base.Js$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
  $JavaScriptFunction = goog.module.get('vmbootstrap.JavaScriptFunction$impl');
 }
}

exports = $Overlay;

//# sourceMappingURL=DomGlobal$SetTimeoutCallbackUnionType$$Overlay.js.map