goog.module('elemental2.dom.BaseRenderingContext2D.ClipOptFillRuleOrPathUnionType.$Overlay$impl');

let Path2D_$Overlay = goog.forwardDeclare('elemental2.dom.Path2D.$Overlay$impl');
let j_l_String = goog.forwardDeclare('java.lang.String$impl');
let Js = goog.forwardDeclare('jsinterop.base.Js$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

/** @nodts */
class $Overlay {
 /** @nodts @return {?} */
 static m_of__java_lang_Object__elemental2_dom_BaseRenderingContext2D_ClipOptFillRuleOrPathUnionType(/** * */ o) {
  $Overlay.$clinit();
  return /**@type {?}*/ (Js.m_cast__java_lang_Object__java_lang_Object(o));
 }
 /** @nodts @return {Path2D} */
 static m_asPath2D__$devirt__elemental2_dom_BaseRenderingContext2D_ClipOptFillRuleOrPathUnionType__elemental2_dom_Path2D(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return /**@type {Path2D}*/ ($Casts.$to(Js.m_cast__java_lang_Object__java_lang_Object($thisArg), Path2D_$Overlay));
 }
 /** @nodts @return {?string} */
 static m_asString__$devirt__elemental2_dom_BaseRenderingContext2D_ClipOptFillRuleOrPathUnionType__java_lang_String(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Js.m_asString__java_lang_Object__java_lang_String($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isPath2D__$devirt__elemental2_dom_BaseRenderingContext2D_ClipOptFillRuleOrPathUnionType__boolean(/** ? */ $thisArg) {
  $Overlay.$clinit();
  return Path2D_$Overlay.$isInstance($thisArg);
 }
 /** @nodts @return {boolean} */
 static m_isString__$devirt__elemental2_dom_BaseRenderingContext2D_ClipOptFillRuleOrPathUnionType__boolean(/** ? */ $thisArg) {
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
  Path2D_$Overlay = goog.module.get('elemental2.dom.Path2D.$Overlay$impl');
  j_l_String = goog.module.get('java.lang.String$impl');
  Js = goog.module.get('jsinterop.base.Js$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}

exports = $Overlay;

//# sourceMappingURL=BaseRenderingContext2D$ClipOptFillRuleOrPathUnionType$$Overlay.js.map
