goog.module('java.util.stream.IntStreamImpl.$2$impl');

const AbstractIntSpliterator = goog.require('java.util.Spliterators.AbstractIntSpliterator$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Arrays = goog.forwardDeclare('java.util.Arrays$impl');
let Comparator = goog.forwardDeclare('java.util.Comparator$impl');
let OfInt = goog.forwardDeclare('java.util.Spliterator.OfInt$impl');
let Spliterators = goog.forwardDeclare('java.util.Spliterators$impl');
let IntConsumer = goog.forwardDeclare('java.util.function.IntConsumer$impl');
let IntStreamImpl = goog.forwardDeclare('java.util.stream.IntStreamImpl$impl');
let PrimitiveLists = goog.forwardDeclare('javaemul.internal.PrimitiveLists$impl');
let $Overlay = goog.forwardDeclare('javaemul.internal.PrimitiveLists.Int.$Overlay$impl');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');
let $Long = goog.forwardDeclare('nativebootstrap.Long$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

class $2 extends AbstractIntSpliterator {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {IntStreamImpl} @nodts*/
  this.$outer_this__java_util_stream_IntStreamImpl_2;
  /**@type {OfInt} @nodts*/
  this.f_ordered__java_util_stream_IntStreamImpl_2;
 }
 /** @nodts @return {!$2} */
 static $create__java_util_stream_IntStreamImpl__long__int(/** IntStreamImpl */ $outer_this, /** !$Long */ $_0, /** number */ $_1) {
  $2.$clinit();
  let $instance = new $2();
  $instance.$ctor__java_util_stream_IntStreamImpl_2__java_util_stream_IntStreamImpl__long__int__void($outer_this, $_0, $_1);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_stream_IntStreamImpl_2__java_util_stream_IntStreamImpl__long__int__void(/** IntStreamImpl */ $outer_this, /** !$Long */ $_0, /** number */ $_1) {
  this.$outer_this__java_util_stream_IntStreamImpl_2 = $outer_this;
  this.$ctor__java_util_Spliterators_AbstractIntSpliterator__long__int__void($_0, $_1);
  this.$init__void_$p_java_util_stream_IntStreamImpl_2();
 }
 /** @override @nodts @return {Comparator<?>} */
 m_getComparator__java_util_Comparator() {
  return null;
 }
 /** @nodts @return {boolean} */
 m_tryAdvance__java_util_function_IntConsumer__boolean(/** IntConsumer */ action) {
  if ($Equality.$same(this.f_ordered__java_util_stream_IntStreamImpl_2, null)) {
   let list = PrimitiveLists.m_createForInt__javaemul_internal_PrimitiveLists_Int();
   this.$outer_this__java_util_stream_IntStreamImpl_2.f_spliterator__java_util_stream_IntStreamImpl_.m_forEachRemaining__java_lang_Object__void(IntConsumer.$adapt((/** number */ value) =>{
    list.push(value);
   }));
   Arrays.m_sort__arrayOf_int__int__int__void($Overlay.m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Int__arrayOf_int(list), 0, list.length);
   this.f_ordered__java_util_stream_IntStreamImpl_2 = Spliterators.m_spliterator__arrayOf_int__int__int__int__java_util_Spliterator_OfInt($Overlay.m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Int__arrayOf_int(list), 0, list.length, this.m_characteristics__int());
  }
  return this.f_ordered__java_util_stream_IntStreamImpl_2.m_tryAdvance__java_lang_Object__boolean(action);
 }
 //Bridge method.
 /** @final @override @nodts @return {boolean} */
 m_tryAdvance__java_lang_Object__boolean(/** IntConsumer */ arg0) {
  return this.m_tryAdvance__java_util_function_IntConsumer__boolean(/**@type {IntConsumer}*/ ($Casts.$to(arg0, IntConsumer)));
 }
 /** @private @nodts */
 $init__void_$p_java_util_stream_IntStreamImpl_2() {
  this.f_ordered__java_util_stream_IntStreamImpl_2 = null;
 }
 /** @nodts */
 static $clinit() {
  $2.$clinit = () =>{};
  $2.$loadModules();
  AbstractIntSpliterator.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof $2;
 }
 
 /** @nodts */
 static $loadModules() {
  Arrays = goog.module.get('java.util.Arrays$impl');
  Spliterators = goog.module.get('java.util.Spliterators$impl');
  IntConsumer = goog.module.get('java.util.function.IntConsumer$impl');
  PrimitiveLists = goog.module.get('javaemul.internal.PrimitiveLists$impl');
  $Overlay = goog.module.get('javaemul.internal.PrimitiveLists.Int.$Overlay$impl');
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}
$Util.$setClassMetadata($2, 'java.util.stream.IntStreamImpl$2');

exports = $2;

//# sourceMappingURL=IntStreamImpl$2.js.map
