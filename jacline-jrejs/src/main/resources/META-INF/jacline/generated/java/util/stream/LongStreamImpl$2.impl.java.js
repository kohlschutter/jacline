goog.module('java.util.stream.LongStreamImpl.$2$impl');

const AbstractLongSpliterator = goog.require('java.util.Spliterators.AbstractLongSpliterator$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Arrays = goog.forwardDeclare('java.util.Arrays$impl');
let Comparator = goog.forwardDeclare('java.util.Comparator$impl');
let OfLong = goog.forwardDeclare('java.util.Spliterator.OfLong$impl');
let Spliterators = goog.forwardDeclare('java.util.Spliterators$impl');
let LongConsumer = goog.forwardDeclare('java.util.function.LongConsumer$impl');
let LongStreamImpl = goog.forwardDeclare('java.util.stream.LongStreamImpl$impl');
let PrimitiveLists = goog.forwardDeclare('javaemul.internal.PrimitiveLists$impl');
let $Overlay = goog.forwardDeclare('javaemul.internal.PrimitiveLists.Long.$Overlay$impl');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');
let $Long = goog.forwardDeclare('nativebootstrap.Long$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');

class $2 extends AbstractLongSpliterator {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {LongStreamImpl} @nodts*/
  this.$outer_this__java_util_stream_LongStreamImpl_2;
  /**@type {OfLong} @nodts*/
  this.f_ordered__java_util_stream_LongStreamImpl_2;
 }
 /** @nodts @return {!$2} */
 static $create__java_util_stream_LongStreamImpl__long__int(/** LongStreamImpl */ $outer_this, /** !$Long */ $_0, /** number */ $_1) {
  $2.$clinit();
  let $instance = new $2();
  $instance.$ctor__java_util_stream_LongStreamImpl_2__java_util_stream_LongStreamImpl__long__int__void($outer_this, $_0, $_1);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_stream_LongStreamImpl_2__java_util_stream_LongStreamImpl__long__int__void(/** LongStreamImpl */ $outer_this, /** !$Long */ $_0, /** number */ $_1) {
  this.$outer_this__java_util_stream_LongStreamImpl_2 = $outer_this;
  this.$ctor__java_util_Spliterators_AbstractLongSpliterator__long__int__void($_0, $_1);
  this.$init__void_$p_java_util_stream_LongStreamImpl_2();
 }
 /** @override @nodts @return {Comparator<?>} */
 m_getComparator__java_util_Comparator() {
  return null;
 }
 /** @nodts @return {boolean} */
 m_tryAdvance__java_util_function_LongConsumer__boolean(/** LongConsumer */ action) {
  if ($Equality.$same(this.f_ordered__java_util_stream_LongStreamImpl_2, null)) {
   let list = PrimitiveLists.m_createForLong__javaemul_internal_PrimitiveLists_Long();
   this.$outer_this__java_util_stream_LongStreamImpl_2.f_spliterator__java_util_stream_LongStreamImpl_.m_forEachRemaining__java_lang_Object__void(LongConsumer.$adapt((/** !$Long */ value) =>{
    list.push(value);
   }));
   Arrays.m_sort__arrayOf_long__int__int__void($Overlay.m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Long__arrayOf_long(list), 0, list.length);
   this.f_ordered__java_util_stream_LongStreamImpl_2 = Spliterators.m_spliterator__arrayOf_long__int__int__int__java_util_Spliterator_OfLong($Overlay.m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Long__arrayOf_long(list), 0, list.length, this.m_characteristics__int());
  }
  return this.f_ordered__java_util_stream_LongStreamImpl_2.m_tryAdvance__java_lang_Object__boolean(action);
 }
 //Bridge method.
 /** @final @override @nodts @return {boolean} */
 m_tryAdvance__java_lang_Object__boolean(/** LongConsumer */ arg0) {
  return this.m_tryAdvance__java_util_function_LongConsumer__boolean(/**@type {LongConsumer}*/ ($Casts.$to(arg0, LongConsumer)));
 }
 /** @private @nodts */
 $init__void_$p_java_util_stream_LongStreamImpl_2() {
  this.f_ordered__java_util_stream_LongStreamImpl_2 = null;
 }
 /** @nodts */
 static $clinit() {
  $2.$clinit = () =>{};
  $2.$loadModules();
  AbstractLongSpliterator.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof $2;
 }
 
 /** @nodts */
 static $loadModules() {
  Arrays = goog.module.get('java.util.Arrays$impl');
  Spliterators = goog.module.get('java.util.Spliterators$impl');
  LongConsumer = goog.module.get('java.util.function.LongConsumer$impl');
  PrimitiveLists = goog.module.get('javaemul.internal.PrimitiveLists$impl');
  $Overlay = goog.module.get('javaemul.internal.PrimitiveLists.Long.$Overlay$impl');
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
 }
}
$Util.$setClassMetadata($2, 'java.util.stream.LongStreamImpl$2');

exports = $2;

//# sourceMappingURL=LongStreamImpl$2.js.map
