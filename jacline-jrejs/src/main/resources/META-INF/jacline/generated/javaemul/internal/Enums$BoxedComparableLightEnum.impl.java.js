goog.module('vmbootstrap.Enums.BoxedComparableLightEnum$impl');

const Comparable = goog.require('java.lang.Comparable$impl');
const $Util = goog.require('nativebootstrap.Util$impl');
const $Enums_BoxedLightEnum = goog.require('vmbootstrap.Enums.BoxedLightEnum$impl');

let ClassCastException = goog.forwardDeclare('java.lang.ClassCastException$impl');
let Constructor = goog.forwardDeclare('javaemul.internal.Constructor');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');
let $Enums = goog.forwardDeclare('vmbootstrap.Enums$impl');
let $Exceptions = goog.forwardDeclare('vmbootstrap.Exceptions$impl');

/**
 * @template T
 * @extends {$Enums_BoxedLightEnum<T>}
 * @implements {Comparable<$Enums_BoxedComparableLightEnum<T>>}
 */
class $Enums_BoxedComparableLightEnum extends $Enums_BoxedLightEnum {
 
 constructor(/** T */ value, /** Constructor */ ctor) {
  $Enums_BoxedComparableLightEnum.$clinit();
  super(value, ctor);
  this.$ctor__javaemul_internal_Enums_BoxedComparableLightEnum__java_lang_Object__javaemul_internal_Constructor__void(value, ctor);
 }
 /** @nodts */
 $ctor__javaemul_internal_Enums_BoxedComparableLightEnum__java_lang_Object__javaemul_internal_Constructor__void(/** T */ value, /** Constructor */ ctor) {}
 /** @nodts @return {number} */
 m_compareTo__javaemul_internal_Enums_BoxedComparableLightEnum__int(/** $Enums_BoxedComparableLightEnum<T> */ o) {
  if (!$Equality.$same(this.constructor, o.constructor)) {
   throw $Exceptions.toJs(ClassCastException.$create__());
  }
  return $Enums.compareTo(this.f_value__javaemul_internal_Enums_BoxedLightEnum, o.f_value__javaemul_internal_Enums_BoxedLightEnum);
 }
 //Bridge method.
 /** @final @override @nodts @return {number} */
 m_compareTo__java_lang_Object__int(/** $Enums_BoxedComparableLightEnum<T> */ arg0) {
  return this.m_compareTo__javaemul_internal_Enums_BoxedComparableLightEnum__int(/**@type {$Enums_BoxedComparableLightEnum<T>}*/ ($Casts.$to(arg0, $Enums_BoxedComparableLightEnum)));
 }
 /** @nodts */
 static $clinit() {
  $Enums_BoxedComparableLightEnum.$clinit = () =>{};
  $Enums_BoxedComparableLightEnum.$loadModules();
  $Enums_BoxedLightEnum.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof $Enums_BoxedComparableLightEnum;
 }
 
 /** @nodts */
 static $loadModules() {
  ClassCastException = goog.module.get('java.lang.ClassCastException$impl');
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
  $Enums = goog.module.get('vmbootstrap.Enums$impl');
  $Exceptions = goog.module.get('vmbootstrap.Exceptions$impl');
 }
}
Comparable.$markImplementor($Enums_BoxedComparableLightEnum);
$Util.$setClassMetadata($Enums_BoxedComparableLightEnum, 'javaemul.internal.Enums$BoxedComparableLightEnum');

exports = $Enums_BoxedComparableLightEnum;

//# sourceMappingURL=Enums$BoxedComparableLightEnum.js.map
