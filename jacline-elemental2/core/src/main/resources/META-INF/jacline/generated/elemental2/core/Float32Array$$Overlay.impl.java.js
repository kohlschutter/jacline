goog.module('elemental2.core.Float32Array.$Overlay$impl');

const $Util = goog.require('nativebootstrap.Util$impl');

let Js = goog.forwardDeclare('jsinterop.base.Js$impl');

/** @nodts */
class $Overlay {
 /** @final @nodts @template S @return {Float32Array} */
 static m_from__jsinterop_base_JsArrayLike__elemental2_core_Float32Array_FromMapFn__java_lang_Object__elemental2_core_Float32Array(/** IArrayLike<?number> */ source, /** ?function(*, number):number */ mapFn, /** S */ thisArg) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn, thisArg);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__jsinterop_base_JsArrayLike__elemental2_core_Float32Array_FromMapFn__elemental2_core_Float32Array(/** IArrayLike<?number> */ source, /** ?function(*, number):number */ mapFn) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__jsinterop_base_JsArrayLike__elemental2_core_Float32Array(/** IArrayLike<?number> */ source) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)));
 }
 /** @final @nodts @template S @return {Float32Array} */
 static m_from__elemental2_core_JsIterable__elemental2_core_Float32Array_FromMapFn__java_lang_Object__elemental2_core_Float32Array(/** Iterable<?number> */ source, /** ?function(*, number):number */ mapFn, /** S */ thisArg) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn, thisArg);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__elemental2_core_JsIterable__elemental2_core_Float32Array_FromMapFn__elemental2_core_Float32Array(/** Iterable<?number> */ source, /** ?function(*, number):number */ mapFn) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__elemental2_core_JsIterable__elemental2_core_Float32Array(/** Iterable<?number> */ source) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)));
 }
 /** @final @nodts @template S @return {Float32Array} */
 static m_from__java_lang_String__elemental2_core_Float32Array_FromMapFn__java_lang_Object__elemental2_core_Float32Array(/** ?string */ source, /** ?function(*, number):number */ mapFn, /** S */ thisArg) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn, thisArg);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__java_lang_String__elemental2_core_Float32Array_FromMapFn__elemental2_core_Float32Array(/** ?string */ source, /** ?function(*, number):number */ mapFn) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__java_lang_String__elemental2_core_Float32Array(/** ?string */ source) {
  $Overlay.$clinit();
  return Float32Array.from(/**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)));
 }
 /** @final @nodts @template S @return {Float32Array} */
 static m_from__arrayOf_double__elemental2_core_Float32Array_FromMapFn__java_lang_Object__elemental2_core_Float32Array(/** Array<number> */ source, /** ?function(*, number):number */ mapFn, /** S */ thisArg) {
  $Overlay.$clinit();
  return $Overlay.m_from__jsinterop_base_JsArrayLike__elemental2_core_Float32Array_FromMapFn__java_lang_Object__elemental2_core_Float32Array(/**@type {IArrayLike<?number>}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn, thisArg);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__arrayOf_double__elemental2_core_Float32Array_FromMapFn__elemental2_core_Float32Array(/** Array<number> */ source, /** ?function(*, number):number */ mapFn) {
  $Overlay.$clinit();
  return $Overlay.m_from__jsinterop_base_JsArrayLike__elemental2_core_Float32Array_FromMapFn__elemental2_core_Float32Array(/**@type {IArrayLike<?number>}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)), mapFn);
 }
 /** @final @nodts @return {Float32Array} */
 static m_from__arrayOf_double__elemental2_core_Float32Array(/** Array<number> */ source) {
  $Overlay.$clinit();
  return $Overlay.m_from__jsinterop_base_JsArrayLike__elemental2_core_Float32Array(/**@type {IArrayLike<?number>}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source)));
 }
 /** @nodts @return {number} */
 static get f_BYTES_PER_ELEMENT__elemental2_core_Float32Array_$Overlay() {
  return ($Overlay.$clinit(), $Overlay.$static_BYTES_PER_ELEMENT__elemental2_core_Float32Array_$Overlay);
 }
 /** @nodts */
 static $clinit() {
  $Overlay.$clinit = () =>{};
  $Overlay.$loadModules();
  $Overlay.$static_BYTES_PER_ELEMENT__elemental2_core_Float32Array_$Overlay = Float32Array.BYTES_PER_ELEMENT;
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof Float32Array;
 }
 
 /** @nodts */
 static $loadModules() {
  Js = goog.module.get('jsinterop.base.Js$impl');
 }
}
/**@private {number} @nodts*/
$Overlay.$static_BYTES_PER_ELEMENT__elemental2_core_Float32Array_$Overlay = 0;
$Util.$setClassMetadata($Overlay, 'Float32Array');

exports = $Overlay;

//# sourceMappingURL=Float32Array$$Overlay.js.map