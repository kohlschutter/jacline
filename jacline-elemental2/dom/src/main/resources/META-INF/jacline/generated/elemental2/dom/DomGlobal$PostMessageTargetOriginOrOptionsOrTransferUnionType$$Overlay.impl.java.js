goog.module('elemental2.dom.DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType.$Overlay$impl');

let JsArray_$Overlay = goog.forwardDeclare('elemental2.core.JsArray.$Overlay$impl');
let j_l_String = goog.forwardDeclare('java.lang.String$impl');
let Js = goog.forwardDeclare('jsinterop.base.Js$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

/** @nodts */
class $Overlay {
 /** @nodts @return {?} */
 static m_of__java_lang_Object__elemental2_dom_DomGlobal_PostMessageTargetOriginOrOptionsOrTransferUnionType(/** * */ o) {
  $Overlay.$clinit();
  return /**@type {?}*/ (Js.m_cast__java_lang_Object__java_lang_Object(o));
 }
 /** @nodts @return {Array<Transferable>} */
 static m_asJsArray__$devirt__elemental2_dom_DomGlobal_PostMessageTargetOriginOrOptionsOrTransferUnionType__elemental2_core_JsArray(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {Array<Transferable>}*/ ($Casts.$to(Js.m_cast__java_lang_Object__java_lang_Object($thisArg), JsArray_$Overlay));
 }
 /** @nodts @return {?string} */
 static m_asString__$devirt__elemental2_dom_DomGlobal_PostMessageTargetOriginOrOptionsOrTransferUnionType__java_lang_String(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Js.m_asString__java_lang_Object__java_lang_String($thisArg);
 }
 /** @nodts @return {StructuredSerializeOptions} */
 static m_asStructuredSerializeOptions__$devirt__elemental2_dom_DomGlobal_PostMessageTargetOriginOrOptionsOrTransferUnionType__elemental2_dom_StructuredSerializeOptions(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {StructuredSerializeOptions}*/ (Js.m_cast__java_lang_Object__java_lang_Object($thisArg));
 }
 /** @nodts @return {boolean} */
 static m_isJsArray__$devirt__elemental2_dom_DomGlobal_PostMessageTargetOriginOrOptionsOrTransferUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return JsArray_$Overlay.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isString__$devirt__elemental2_dom_DomGlobal_PostMessageTargetOriginOrOptionsOrTransferUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return j_l_String.$isInstance($thisArg);
 }
 /** @nodts */
 static $clinit() {
  $Overlay.$clinit = () =>{};
  $Overlay.$loadModules();
 }
 
 /** @nodts */
 static $loadModules() {
  JsArray_$Overlay = goog.module.get('elemental2.core.JsArray.$Overlay$impl');
  j_l_String = goog.module.get('java.lang.String$impl');
  Js = goog.module.get('jsinterop.base.Js$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}

exports = $Overlay;

//# sourceMappingURL=DomGlobal$PostMessageTargetOriginOrOptionsOrTransferUnionType$$Overlay.js.map