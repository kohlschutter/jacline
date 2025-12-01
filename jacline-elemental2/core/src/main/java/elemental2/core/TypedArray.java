package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import jsinterop.annotations.JsMethod;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TypedArray extends ArrayBufferView implements JsIterable<Double, @Nullable Object, @Nullable Object>, JsArrayLike<Double>{
@JsFunction
public interface EveryCallbackFn{
@Nullable Object onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface FilterCallbackFn{
@Nullable Object onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface FindCallbackFn{
@Nullable Object onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface FindIndexCallbackFn{
@Nullable Object onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface FindLastCallbackFn{
boolean onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface FindLastIndexCallbackFn{
boolean onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface ForEachCallbackFn{
@Nullable Object onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface MapCallbackFn{
double onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface ReduceCallbackFn<INIT extends @Nullable Object, RET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P0UnionType<INIT extends @Nullable Object, RET extends @Nullable Object>{
@JsOverlay
static <INIT extends @Nullable Object, RET extends @Nullable Object> TypedArray.ReduceCallbackFn.P0UnionType<INIT, RET> of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default INIT asINIT(){
return Js.cast(this);
}
@JsOverlay
default RET asRET(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
RET onInvoke(TypedArray.ReduceCallbackFn.P0UnionType<INIT, RET> p0,double p1,double p2,TypedArray p3);
}
@JsFunction
public interface ReduceRightCallbackFn<INIT extends @Nullable Object, RET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P0UnionType<INIT extends @Nullable Object, RET extends @Nullable Object>{
@JsOverlay
static <INIT extends @Nullable Object, RET extends @Nullable Object> TypedArray.ReduceRightCallbackFn.P0UnionType<INIT, RET> of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default INIT asINIT(){
return Js.cast(this);
}
@JsOverlay
default RET asRET(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
RET onInvoke(TypedArray.ReduceRightCallbackFn.P0UnionType<INIT, RET> p0,double p1,double p2,TypedArray p3);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetArrayUnionType{
@JsOverlay
static TypedArray.SetArrayUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsFunction
public interface SomeCallbackFn{
@Nullable Object onInvoke(double p0,double p1,TypedArray p2);
}
@JsFunction
public interface SortCompareFunctionFn{
double onInvoke(double p0,double p1);
}
public int BYTES_PER_ELEMENT;
public int length;
public native double at(int index);
public native TypedArray copyWithin(int target,int start,int end);
public native TypedArray copyWithin(int target,int start);
public native JsIteratorIterable<JsArray<Double>, @Nullable Object, @Nullable Object> entries();
public native <S extends @Nullable Object> boolean every(TypedArray.EveryCallbackFn callback,S thisArg);
public native boolean every(TypedArray.EveryCallbackFn callback);
public native TypedArray fill(double value,int begin,int end);
public native TypedArray fill(double value,int begin);
public native TypedArray fill(double value);
public native <S extends @Nullable Object> TypedArray filter(TypedArray.FilterCallbackFn callback,S thisArg);
public native TypedArray filter(TypedArray.FilterCallbackFn callback);
public native <S extends @Nullable Object> double find(TypedArray.FindCallbackFn callback,S thisArg);
public native double find(TypedArray.FindCallbackFn callback);
public native <S extends @Nullable Object> int findIndex(TypedArray.FindIndexCallbackFn callback,S thisArg);
public native int findIndex(TypedArray.FindIndexCallbackFn callback);
public native <S extends @Nullable Object> double findLast(TypedArray.FindLastCallbackFn callback,S thisArg);
public native double findLast(TypedArray.FindLastCallbackFn callback);
public native <S extends @Nullable Object> int findLastIndex(TypedArray.FindLastIndexCallbackFn callback,S thisArg);
public native int findLastIndex(TypedArray.FindLastIndexCallbackFn callback);
public native <S extends @Nullable Object> void forEach(TypedArray.ForEachCallbackFn callback,S thisArg);
public native void forEach(TypedArray.ForEachCallbackFn callback);
public native boolean includes(double searchElement,int fromIndex);
public native boolean includes(double searchElement);
public native int indexOf(double searchElement,int fromIndex);
public native int indexOf(double searchElement);
public native String join();
public native String join(String separator);
public native JsIteratorIterable<Double, @Nullable Object, @Nullable Object> keys();
public native int lastIndexOf(double searchElement,int fromIndex);
public native int lastIndexOf(double searchElement);
public native <S extends @Nullable Object> TypedArray map(TypedArray.MapCallbackFn callback,S thisArg);
public native TypedArray map(TypedArray.MapCallbackFn callback);
public native <INIT extends @Nullable Object, RET extends @Nullable Object> RET reduce(TypedArray.ReduceCallbackFn<? super INIT, RET> callback,INIT initialValue);
public native <INIT extends @Nullable Object, RET extends @Nullable Object> RET reduce(TypedArray.ReduceCallbackFn<? super INIT, RET> callback);
public native <INIT extends @Nullable Object, RET extends @Nullable Object> RET reduceRight(TypedArray.ReduceRightCallbackFn<? super INIT, RET> callback,INIT initialValue);
public native <INIT extends @Nullable Object, RET extends @Nullable Object> RET reduceRight(TypedArray.ReduceRightCallbackFn<? super INIT, RET> callback);
public native TypedArray reverse();
@JsOverlay
public final void set(ArrayBufferView array,int offset){
set(Js.<TypedArray.SetArrayUnionType>uncheckedCast(array),offset);
}
@JsOverlay
public final void set(ArrayBufferView array){
set(Js.<TypedArray.SetArrayUnionType>uncheckedCast(array));
}
@JsOverlay
public final void set(JsArray<Double> array,int offset){
set(Js.<TypedArray.SetArrayUnionType>uncheckedCast(array),offset);
}
@JsOverlay
public final void set(JsArray<Double> array){
set(Js.<TypedArray.SetArrayUnionType>uncheckedCast(array));
}
public native void set(TypedArray.SetArrayUnionType array,int offset);
public native void set(TypedArray.SetArrayUnionType array);
@JsOverlay
public final void set(double[] array,int offset){
set(Js.<JsArray<Double>>uncheckedCast(array),offset);
}
@JsOverlay
public final void set(double[] array){
set(Js.<JsArray<Double>>uncheckedCast(array));
}
public native TypedArray slice();
public native TypedArray slice(int begin,int end);
public native TypedArray slice(int begin);
public native <S extends @Nullable Object> boolean some(TypedArray.SomeCallbackFn callback,S thisArg);
public native boolean some(TypedArray.SomeCallbackFn callback);
public native TypedArray sort();
public native TypedArray sort(TypedArray.SortCompareFunctionFn compareFunction);
public native TypedArray subarray(int begin,int end);
public native TypedArray subarray(int begin);
public native String toLocaleString();
@JsMethod(name = "toString")
public native String toString_();
public native JsIteratorIterable<Double, @Nullable Object, @Nullable Object> values();
}
