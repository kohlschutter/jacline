goog.module('java.util.stream.DoubleStream.$1$impl');

const j_l_Object = goog.require('java.lang.Object$impl');
const Builder = goog.require('java.util.stream.DoubleStream.Builder$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

let Arrays = goog.forwardDeclare('java.util.Arrays$impl');
let DoubleConsumer = goog.forwardDeclare('java.util.function.DoubleConsumer$impl');
let DoubleStream = goog.forwardDeclare('java.util.stream.DoubleStream$impl');
let InternalPreconditions = goog.forwardDeclare('javaemul.internal.InternalPreconditions$impl');
let PrimitiveLists = goog.forwardDeclare('javaemul.internal.PrimitiveLists$impl');
let $Overlay = goog.forwardDeclare('javaemul.internal.PrimitiveLists.Double.$Overlay$impl');
let $Equality = goog.forwardDeclare('nativebootstrap.Equality$impl');

/**
 * @implements {Builder}
 */
class $1 extends j_l_Object {
 /** @protected @nodts */
 constructor() {
  super();
  /**@type {Array} @nodts*/
  this.f_items__java_util_stream_DoubleStream_1_;
 }
 /** @nodts @return {!$1} */
 static $create__() {
  $1.$clinit();
  let $instance = new $1();
  $instance.$ctor__java_util_stream_DoubleStream_1__void();
  return $instance;
 }
 /** @nodts */
 $ctor__java_util_stream_DoubleStream_1__void() {
  this.$ctor__java_lang_Object__void();
  this.$init__void_$p_java_util_stream_DoubleStream_1();
 }
 /** @override @nodts */
 m_accept__double__void(/** number */ t) {
  InternalPreconditions.m_checkState__boolean__java_lang_Object__void(!$Equality.$same(this.f_items__java_util_stream_DoubleStream_1_, null), 'Builder already built');
  this.f_items__java_util_stream_DoubleStream_1_.push(t);
 }
 /** @override @nodts @return {DoubleStream} */
 m_build__java_util_stream_DoubleStream() {
  InternalPreconditions.m_checkState__boolean__java_lang_Object__void(!$Equality.$same(this.f_items__java_util_stream_DoubleStream_1_, null), 'Builder already built');
  let stream = Arrays.m_stream__arrayOf_double__int__int__java_util_stream_DoubleStream($Overlay.m_internalArray__$devirt__javaemul_internal_PrimitiveLists_Double__arrayOf_double(this.f_items__java_util_stream_DoubleStream_1_), 0, this.f_items__java_util_stream_DoubleStream_1_.length);
  this.f_items__java_util_stream_DoubleStream_1_ = null;
  return stream;
 }
 //Default method forwarding stub.
 /** @override @nodts @return {DoubleConsumer} */
 m_andThen__java_util_function_DoubleConsumer__java_util_function_DoubleConsumer(/** DoubleConsumer */ arg0) {
  return DoubleConsumer.m_andThen__$default__java_util_function_DoubleConsumer__java_util_function_DoubleConsumer__java_util_function_DoubleConsumer(this, arg0);
 }
 //Default method forwarding stub.
 /** @override @nodts @return {Builder} */
 m_add__double__java_util_stream_DoubleStream_Builder(/** number */ arg0) {
  return Builder.m_add__$default__java_util_stream_DoubleStream_Builder__double__java_util_stream_DoubleStream_Builder(this, arg0);
 }
 /** @private @nodts */
 $init__void_$p_java_util_stream_DoubleStream_1() {
  this.f_items__java_util_stream_DoubleStream_1_ = PrimitiveLists.m_createForDouble__javaemul_internal_PrimitiveLists_Double();
 }
 /** @nodts */
 static $clinit() {
  $1.$clinit = () =>{};
  $1.$loadModules();
  j_l_Object.$clinit();
  Builder.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof $1;
 }
 
 /** @nodts */
 static $loadModules() {
  Arrays = goog.module.get('java.util.Arrays$impl');
  DoubleConsumer = goog.module.get('java.util.function.DoubleConsumer$impl');
  InternalPreconditions = goog.module.get('javaemul.internal.InternalPreconditions$impl');
  PrimitiveLists = goog.module.get('javaemul.internal.PrimitiveLists$impl');
  $Overlay = goog.module.get('javaemul.internal.PrimitiveLists.Double.$Overlay$impl');
  $Equality = goog.module.get('nativebootstrap.Equality$impl');
 }
}
Builder.$markImplementor($1);
$Util.$setClassMetadata($1, 'java.util.stream.DoubleStream$1');

exports = $1;

//# sourceMappingURL=DoubleStream$1.js.map
