goog.module('javaemul.internal.PrimitiveLists$impl');

const j_l_Object = goog.require('java.lang.Object$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let JsUtils = goog.forwardDeclare('javaemul.internal.JsUtils$impl');
let $Long = goog.forwardDeclare('nativebootstrap.Long$impl');
let $Arrays = goog.forwardDeclare('vmbootstrap.Arrays$impl');
let $$byte = goog.forwardDeclare('vmbootstrap.primitives.$byte$impl');
let $$double = goog.forwardDeclare('vmbootstrap.primitives.$double$impl');
let $$int = goog.forwardDeclare('vmbootstrap.primitives.$int$impl');
let $$long = goog.forwardDeclare('vmbootstrap.primitives.$long$impl');

/**
 * @final
 */
class PrimitiveLists extends j_l_Object {
 /** @protected @nodts */
 constructor() {
  super();
 }
 /** @nodts @return {Array} */
 static m_createForByte__javaemul_internal_PrimitiveLists_Byte() {
  PrimitiveLists.$clinit();
  return /**@type {Array}*/ (JsUtils.uncheckedCast(/**@type {!Array<number>}*/ ($Arrays.$create([0], $$byte))));
 }
 /** @nodts @return {Array} */
 static m_createForInt__javaemul_internal_PrimitiveLists_Int() {
  PrimitiveLists.$clinit();
  return /**@type {Array}*/ (JsUtils.uncheckedCast(/**@type {!Array<number>}*/ ($Arrays.$create([0], $$int))));
 }
 /** @nodts @return {Array} */
 static m_createForLong__javaemul_internal_PrimitiveLists_Long() {
  PrimitiveLists.$clinit();
  return /**@type {Array}*/ (JsUtils.uncheckedCast(/**@type {!Array<!$Long>}*/ ($Arrays.$create([0], $$long))));
 }
 /** @nodts @return {Array} */
 static m_createForDouble__javaemul_internal_PrimitiveLists_Double() {
  PrimitiveLists.$clinit();
  return /**@type {Array}*/ (JsUtils.uncheckedCast(/**@type {!Array<number>}*/ ($Arrays.$create([0], $$double))));
 }
 /** @nodts @return {!PrimitiveLists} */
 static $create__() {
  let $instance = new PrimitiveLists();
  $instance.$ctor__javaemul_internal_PrimitiveLists__void();
  return $instance;
 }
 /** @nodts */
 $ctor__javaemul_internal_PrimitiveLists__void() {
  this.$ctor__java_lang_Object__void();
 }
 /** @nodts */
 static $clinit() {
  PrimitiveLists.$clinit = () =>{};
  PrimitiveLists.$loadModules();
  j_l_Object.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof PrimitiveLists;
 }
 
 /** @nodts */
 static $loadModules() {
  JsUtils = goog.module.get('javaemul.internal.JsUtils$impl');
  $Arrays = goog.module.get('vmbootstrap.Arrays$impl');
  $$byte = goog.module.get('vmbootstrap.primitives.$byte$impl');
  $$double = goog.module.get('vmbootstrap.primitives.$double$impl');
  $$int = goog.module.get('vmbootstrap.primitives.$int$impl');
  $$long = goog.module.get('vmbootstrap.primitives.$long$impl');
 }
}
$Util.$setClassMetadata(PrimitiveLists, 'javaemul.internal.PrimitiveLists');

exports = PrimitiveLists;

//# sourceMappingURL=PrimitiveLists.js.map
