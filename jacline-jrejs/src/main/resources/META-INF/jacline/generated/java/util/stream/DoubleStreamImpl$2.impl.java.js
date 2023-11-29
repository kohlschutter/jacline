goog.module('java.util.stream.DoubleStreamImpl.$2$impl');

const AbstractDoubleSpliterator = goog.require('java.util.Spliterators.AbstractDoubleSpliterator$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Arrays = goog.forwardDeclare('java.util.Arrays$impl');
let Comparator = goog.forwardDeclare('java.util.Comparator$impl');
let OfDouble = goog.forwardDeclare('java.util.Spliterator.OfDouble$impl');
let Spliterators = goog.forwardDeclare('java.util.Spliterators$impl');
let DoubleConsumer = goog.forwardDeclare('java.util.function.DoubleConsumer$impl');
let DoubleStreamImpl = goog.forwardDeclare('java.util.stream.DoubleStreamImpl$impl');
let PrimitiveLists = goog.forwardDeclare('javaemul.internal.PrimitiveLists$impl');
let $Overlay = goog.forwardDeclare('javaemul.internal.PrimitiveLists.Double.$Overlay$impl');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');
let $Long = goog.forwardDeclare('nativebootstrap.Long$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

class $2 extends AbstractDoubleSpliterator {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {DoubleStreamImpl} @nodts*/
  this.$outer_this__java_util_stream_DoubleStreamImpl_2;
  /**@type {OfDouble} @nodts*/
  this.f_ordered__java_util_stream_DoubleStreamImpl_2;
 }
 /** @nodts @return {!$2} */
 static $create__java_util_stream_DoubleStreamImpl__long__int(/** DoubleStreamImpl */ $outer_this, /** !$Long */ $_0, /** number */ $_1) {
  $2.$clinit();
  let $instance = new $2();
  $instance.$ctor__java_util_stream_DoubleStreamImpl_2__java_util_stream_DoubleStreamImpl__long__int__void($outer_this, $_0, $_1);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_stream_DoubleStreamImpl_2__java_util_stream_DoubleStreamImpl__long__int__void(/** DoubleStreamImpl */ $outer_this, /** !$Long */ $_0, /** number */ $_1) {
  this.$outer_this__java_util_stream_DoubleStreamImpl_2 = $outer_this;
  this.$ctor__java_util_Spliterators_AbstractDoubleSpliterator__long__int__void($_0, $_1);
  this.$init__void_$p_java_util_stream_DoubleStreamImpl_2();
 }
 /** @override @nodts @return {Comparator<?>} */
 m_getComparator__java_util_Comparator() {
  return null;
 }
 /** @nodts @return {boolean} */
 m_tryAdvance__java_util_function_DoubleConsumer__boolean(/** DoubleConsumer */ action) {
  if ($Equality.$same(this.f_ordered__java_util_stream_DoubleStreamImpl_2, null)) {
   let list = PrimitiveLists.m_createForDouble__javaemul_internal_PrimitiveLists_Double();
   this.$outer_this__java_util_stream_DoubleStreamImpl_2.f_spliterator__java_util_stream_DoubleStreamImpl_.m_forEachRemaining__java_lang_Object__void(DoubleConsumer.$adapt((/** number */ value) =>{
    list.push(value);
   }));
   Arrays.m_sort__arrayOf_double__int__int__void($Overlay.m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Double__arrayOf_double(list), 0, list.length);
   this.f_ordered__java_util_stream_DoubleStreamImpl_2 = Spliterators.m_spliterator__arrayOf_double__int__int__int__java_util_Spliterator_OfDouble($Overlay.m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Double__arrayOf_double(list), 0, list.length, this.m_characteristics__int());
  }
  return this.f_ordered__java_util_stream_DoubleStreamImpl_2.m_tryAdvance__java_lang_Object__boolean(action);
 }
 //Bridge method.
 /** @final @override @nodts @return {boolean} */
 m_tryAdvance__java_lang_Object__boolean(/** DoubleConsumer */ arg0) {
  return this.m_tryAdvance__java_util_function_DoubleConsumer__boolean(/**@type {DoubleConsumer}*/ ($Casts.$to(arg0, DoubleConsumer)));
 }
 /** @private @nodts */
 $init__void_$p_java_util_stream_DoubleStreamImpl_2() {
  this.f_ordered__java_util_stream_DoubleStreamImpl_2 = null;
 }
 /** @nodts */
 static $clinit() {
  $2.$clinit = () =>{};
  $2.$loadModules();
  AbstractDoubleSpliterator.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof $2;
 }
 
 /** @nodts */
 static $loadModules() {
  Arrays = goog.module.get('java.util.Arrays$impl');
  Spliterators = goog.module.get('java.util.Spliterators$impl');
  DoubleConsumer = goog.module.get('java.util.function.DoubleConsumer$impl');
  PrimitiveLists = goog.module.get('javaemul.internal.PrimitiveLists$impl');
  $Overlay = goog.module.get('javaemul.internal.PrimitiveLists.Double.$Overlay$impl');
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}
$Util.$setClassMetadata($2, 'java.util.stream.DoubleStreamImpl$2');

exports = $2;

//# sourceMappingURL=DoubleStreamImpl$2.js.map
