goog.module('elemental2.dom.Element.SetAttributeNSValueUnionType.$Overlay$impl');

let Boolean = goog.forwardDeclare('java.lang.Boolean$impl');
let Double = goog.forwardDeclare('java.lang.Double$impl');
let j_l_String = goog.forwardDeclare('java.lang.String$impl');
let Js = goog.forwardDeclare('jsinterop.base.Js$impl');

/** @nodts */
class $Overlay {
 /** @nodts @return {?} */
 static m_of__java_lang_Object__elemental2_dom_Element_SetAttributeNSValueUnionType(/** * */ o) {
  $Overlay.$clinit();
  return /**@type {?}*/ (Js.m_cast__java_lang_Object__java_lang_Object(o));
 }
 /** @nodts @return {boolean} */
 static m_asBoolean__$devirt__elemental2_dom_Element_SetAttributeNSValueUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Js.m_asBoolean__java_lang_Object__boolean($thisArg);
 }
 /** @nodts @return {number} */
 static m_asDouble__$devirt__elemental2_dom_Element_SetAttributeNSValueUnionType__double(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Js.m_asDouble__java_lang_Object__double($thisArg);
 }
 /** @nodts @return {?string} */
 static m_asString__$devirt__elemental2_dom_Element_SetAttributeNSValueUnionType__java_lang_String(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Js.m_asString__java_lang_Object__java_lang_String($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isBoolean__$devirt__elemental2_dom_Element_SetAttributeNSValueUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Boolean.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isDouble__$devirt__elemental2_dom_Element_SetAttributeNSValueUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Double.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isString__$devirt__elemental2_dom_Element_SetAttributeNSValueUnionType__boolean(/** ? */ $thisArg) {
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
  Boolean = goog.module.get('java.lang.Boolean$impl');
  Double = goog.module.get('java.lang.Double$impl');
  j_l_String = goog.module.get('java.lang.String$impl');
  Js = goog.module.get('jsinterop.base.Js$impl');
 }
}

exports = $Overlay;

//# sourceMappingURL=Element$SetAttributeNSValueUnionType$$Overlay.js.map
