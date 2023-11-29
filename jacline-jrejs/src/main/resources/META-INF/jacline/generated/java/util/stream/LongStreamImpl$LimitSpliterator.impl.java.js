goog.module('java.util.stream.LongStreamImpl.LimitSpliterator$impl');

const AbstractLongSpliterator = goog.require('java.util.Spliterators.AbstractLongSpliterator$impl');
const $Long = goog.require('nativebootstrap.Long$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Long = goog.forwardDeclare('java.lang.Long$impl');
let Math = goog.forwardDeclare('java.lang.Math$impl');
let Comparator = goog.forwardDeclare('java.util.Comparator$impl');
let Spliterator = goog.forwardDeclare('java.util.Spliterator$impl');
let OfLong = goog.forwardDeclare('java.util.Spliterator.OfLong$impl');
let LongConsumer = goog.forwardDeclare('java.util.function.LongConsumer$impl');
let $Casts = goog.forwardDeclare('vmbootstrap.Casts$impl');
let $LongUtils = goog.forwardDeclare('vmbootstrap.LongUtils$impl');
let $Primitives = goog.forwardDeclare('vmbootstrap.Primitives$impl');

/**
 * @final
 */
class LimitSpliterator extends AbstractLongSpliterator {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {!$Long} @nodts*/
  this.f_limit__java_util_stream_LongStreamImpl_LimitSpliterator_ = $Long.fromInt(0);
  /**@type {OfLong} @nodts*/
  this.f_original__java_util_stream_LongStreamImpl_LimitSpliterator_;
  /**@type {number} @nodts*/
  this.f_position__java_util_stream_LongStreamImpl_LimitSpliterator_ = 0;
 }
 /** @nodts @return {!LimitSpliterator} */
 static $create__long__java_util_Spliterator_OfLong(/** !$Long */ limit, /** OfLong */ original) {
  LimitSpliterator.$clinit();
  let $instance = new LimitSpliterator();
  $instance.$ctor__java_util_stream_LongStreamImpl_LimitSpliterator__long__java_util_Spliterator_OfLong__void(limit, original);
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_stream_LongStreamImpl_LimitSpliterator__long__java_util_Spliterator_OfLong__void(/** !$Long */ limit, /** OfLong */ original) {
  this.$ctor__java_util_Spliterators_AbstractLongSpliterator__long__int__void(original.m_hasCharacteristics__int__boolean(Spliterator.f_SIZED__java_util_Spliterator) ? Math.m_min__long__long__long(original.m_estimateSize__long(), limit) : Long.f_MAX_VALUE__java_lang_Long, original.m_characteristics__int());
  this.$init__void_$p_java_util_stream_LongStreamImpl_LimitSpliterator();
  this.f_limit__java_util_stream_LongStreamImpl_LimitSpliterator_ = limit;
  this.f_original__java_util_stream_LongStreamImpl_LimitSpliterator_ = original;
 }
 /** @override @nodts @return {Comparator<?>} */
 m_getComparator__java_util_Comparator() {
  return this.f_original__java_util_stream_LongStreamImpl_LimitSpliterator_.m_getComparator__java_util_Comparator();
 }
 /** @nodts @return {boolean} */
 m_tryAdvance__java_util_function_LongConsumer__boolean(/** LongConsumer */ action) {
  if ($LongUtils.greaterEquals($Primitives.widenIntToLong(this.f_position__java_util_stream_LongStreamImpl_LimitSpliterator_), this.f_limit__java_util_stream_LongStreamImpl_LimitSpliterator_)) {
   return false;
  }
  let result = this.f_original__java_util_stream_LongStreamImpl_LimitSpliterator_.m_tryAdvance__java_lang_Object__boolean(action);
  this.f_position__java_util_stream_LongStreamImpl_LimitSpliterator_ = this.f_position__java_util_stream_LongStreamImpl_LimitSpliterator_ + 1 | 0;
  return result;
 }
 //Bridge method.
 /** @final @override @nodts @return {boolean} */
 m_tryAdvance__java_lang_Object__boolean(/** LongConsumer */ arg0) {
  return this.m_tryAdvance__java_util_function_LongConsumer__boolean(/**@type {LongConsumer}*/ ($Casts.$to(arg0, LongConsumer)));
 }
 /** @private @nodts */
 $init__void_$p_java_util_stream_LongStreamImpl_LimitSpliterator() {
  this.f_position__java_util_stream_LongStreamImpl_LimitSpliterator_ = 0;
 }
 /** @nodts */
 static $clinit() {
  LimitSpliterator.$clinit = () =>{};
  LimitSpliterator.$loadModules();
  AbstractLongSpliterator.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof LimitSpliterator;
 }
 
 /** @nodts */
 static $loadModules() {
  Long = goog.module.get('java.lang.Long$impl');
  Math = goog.module.get('java.lang.Math$impl');
  Spliterator = goog.module.get('java.util.Spliterator$impl');
  LongConsumer = goog.module.get('java.util.function.LongConsumer$impl');
  $Casts = goog.module.get('vmbootstrap.Casts$impl');
  $LongUtils = goog.module.get('vmbootstrap.LongUtils$impl');
  $Primitives = goog.module.get('vmbootstrap.Primitives$impl');
 }
}
$Util.$setClassMetadata(LimitSpliterator, 'java.util.stream.LongStreamImpl$LimitSpliterator');

exports = LimitSpliterator;

//# sourceMappingURL=LongStreamImpl$LimitSpliterator.js.map
