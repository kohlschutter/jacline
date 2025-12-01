package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsFunction;
import elemental2.core.TypedArray;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.SharedArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Int32Array extends TypedArray{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorLengthUnionType{
@JsOverlay
static Int32Array.@Nullable ConstructorLengthUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default @Nullable ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default @Nullable JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable SharedArrayBuffer asSharedArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isSharedArrayBuffer(){
return (Object)this instanceof SharedArrayBuffer;
}
}
@JsFunction
public interface FromMapFn{
double onInvoke(@Nullable Object element,int index);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FromSourceUnionType{
@JsOverlay
static Int32Array.FromSourceUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArrayLike<Double> asJsArrayLike(){
return Js.cast(this);
}
@JsOverlay
default JsIterable<Double, @Nullable Object, @Nullable Object> asJsIterable(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsOverlay
public static final int BYTES_PER_ELEMENT=Int32Array__Constants.BYTES_PER_ELEMENT;
public static native <S extends @Nullable Object> Int32Array from(Int32Array.FromSourceUnionType source,Int32Array.FromMapFn mapFn,S thisArg);
public static native Int32Array from(Int32Array.FromSourceUnionType source,Int32Array.FromMapFn mapFn);
public static native Int32Array from(Int32Array.FromSourceUnionType source);
@JsOverlay
public static final <S extends @Nullable Object> Int32Array from(JsArrayLike<Double> source,Int32Array.FromMapFn mapFn,S thisArg){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final Int32Array from(JsArrayLike<Double> source,Int32Array.FromMapFn mapFn){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final Int32Array from(JsArrayLike<Double> source){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source));
}
@JsOverlay
public static final <S extends @Nullable Object> Int32Array from(JsIterable<Double, @Nullable Object, @Nullable Object> source,Int32Array.FromMapFn mapFn,S thisArg){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final Int32Array from(JsIterable<Double, @Nullable Object, @Nullable Object> source,Int32Array.FromMapFn mapFn){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final Int32Array from(JsIterable<Double, @Nullable Object, @Nullable Object> source){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source));
}
@JsOverlay
public static final <S extends @Nullable Object> Int32Array from(String source,Int32Array.FromMapFn mapFn,S thisArg){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final Int32Array from(String source,Int32Array.FromMapFn mapFn){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final Int32Array from(String source){
return from(Js.<Int32Array.FromSourceUnionType>uncheckedCast(source));
}
@JsOverlay
public static final <S extends @Nullable Object> Int32Array from(double[] source,Int32Array.FromMapFn mapFn,S thisArg){
return from(Js.<JsArrayLike<Double>>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final Int32Array from(double[] source,Int32Array.FromMapFn mapFn){
return from(Js.<JsArrayLike<Double>>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final Int32Array from(double[] source){
return from(Js.<JsArrayLike<Double>>uncheckedCast(source));
}
public static native Int32Array of(double... var_args);
public Int32Array(ArrayBuffer length,int byteOffset,int length0){}
public Int32Array(ArrayBuffer length,int byteOffset){}
public Int32Array(ArrayBuffer length){}
public Int32Array(ArrayBufferView length,int byteOffset,int length0){}
public Int32Array(ArrayBufferView length,int byteOffset){}
public Int32Array(ArrayBufferView length){}
public Int32Array(Int32Array.@Nullable ConstructorLengthUnionType length,int byteOffset,int length0){}
public Int32Array(Int32Array.@Nullable ConstructorLengthUnionType length,int byteOffset){}
public Int32Array(Int32Array.@Nullable ConstructorLengthUnionType length){}
public Int32Array(JsArray<Double> length,int byteOffset,int length0){}
public Int32Array(JsArray<Double> length,int byteOffset){}
public Int32Array(JsArray<Double> length){}
public Int32Array(SharedArrayBuffer length,int byteOffset,int length0){}
public Int32Array(SharedArrayBuffer length,int byteOffset){}
public Int32Array(SharedArrayBuffer length){}
public Int32Array(double[] length,int byteOffset,int length0){}
public Int32Array(double[] length,int byteOffset){}
public Int32Array(double[] length){}
public Int32Array(int length,int byteOffset,int length0){}
public Int32Array(int length,int byteOffset){}
public Int32Array(int length){}
}
