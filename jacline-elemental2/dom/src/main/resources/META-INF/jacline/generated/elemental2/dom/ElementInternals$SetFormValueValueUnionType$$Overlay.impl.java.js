goog.module('elemental2.dom.ElementInternals.SetFormValueValueUnionType.$Overlay$impl');

let File_$Overlay = goog.forwardDeclare('elemental2.dom.File.$Overlay$impl');
let FormData_$Overlay = goog.forwardDeclare('elemental2.dom.FormData.$Overlay$impl');
let j_l_String = goog.forwardDeclare('java.lang.String$impl');
let Js = goog.forwardDeclare('jsinterop.base.Js$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

/** @nodts */
class $Overlay {
 /** @nodts @return {?} */
 static m_of__java_lang_Object__elemental2_dom_ElementInternals_SetFormValueValueUnionType(/** * */ o) {
  $Overlay.$clinit();
  return /**@type {?}*/ (Js.m_cast__java_lang_Object__java_lang_Object(o));
 }
 /** @nodts @return {File} */
 static m_asFile__$devirt__elemental2_dom_ElementInternals_SetFormValueValueUnionType__elemental2_dom_File(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {File}*/ ($Casts.$to(Js.m_cast__java_lang_Object__java_lang_Object($thisArg), File_$Overlay));
 }
 /** @nodts @return {FormData} */
 static m_asFormData__$devirt__elemental2_dom_ElementInternals_SetFormValueValueUnionType__elemental2_dom_FormData(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {FormData}*/ ($Casts.$to(Js.m_cast__java_lang_Object__java_lang_Object($thisArg), FormData_$Overlay));
 }
 /** @nodts @return {?string} */
 static m_asString__$devirt__elemental2_dom_ElementInternals_SetFormValueValueUnionType__java_lang_String(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Js.m_asString__java_lang_Object__java_lang_String($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isFile__$devirt__elemental2_dom_ElementInternals_SetFormValueValueUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return File_$Overlay.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isFormData__$devirt__elemental2_dom_ElementInternals_SetFormValueValueUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return FormData_$Overlay.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isString__$devirt__elemental2_dom_ElementInternals_SetFormValueValueUnionType__boolean(/** ? */ $thisArg) {
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
  File_$Overlay = goog.module.get('elemental2.dom.File.$Overlay$impl');
  FormData_$Overlay = goog.module.get('elemental2.dom.FormData.$Overlay$impl');
  j_l_String = goog.module.get('java.lang.String$impl');
  Js = goog.module.get('jsinterop.base.Js$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}

exports = $Overlay;

//# sourceMappingURL=ElementInternals$SetFormValueValueUnionType$$Overlay.js.map
