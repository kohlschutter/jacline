package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import jsinterop.base.JsBigint;
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
public class BigUint64Array extends TypedArray{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorLengthOrArrayOrBufferUnionType{
@JsOverlay
static BigUint64Array.@Nullable ConstructorLengthOrArrayOrBufferUnionType of(@Nullable Object o){
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
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable JsArray<JsBigint> asJsArray(){
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
default boolean isDouble(){
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
JsBigint onInvoke(@Nullable Object element,int index);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FromSourceUnionType{
@JsOverlay
static BigUint64Array.FromSourceUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArrayLike<JsBigint> asJsArrayLike(){
return Js.cast(this);
}
@JsOverlay
default JsIterable<JsBigint, @Nullable Object, @Nullable Object> asJsIterable(){
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
public static final double BYTES_PER_ELEMENT=BigUint64Array__Constants.BYTES_PER_ELEMENT;
public static native <S extends @Nullable Object> BigUint64Array from(BigUint64Array.FromSourceUnionType source,BigUint64Array.FromMapFn mapFn,S thisArg);
public static native BigUint64Array from(BigUint64Array.FromSourceUnionType source,BigUint64Array.FromMapFn mapFn);
public static native BigUint64Array from(BigUint64Array.FromSourceUnionType source);
@JsOverlay
public static final <S extends @Nullable Object> BigUint64Array from(JsArrayLike<JsBigint> source,BigUint64Array.FromMapFn mapFn,S thisArg){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final BigUint64Array from(JsArrayLike<JsBigint> source,BigUint64Array.FromMapFn mapFn){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final BigUint64Array from(JsArrayLike<JsBigint> source){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source));
}
@JsOverlay
public static final <S extends @Nullable Object> BigUint64Array from(JsBigint[] source,BigUint64Array.FromMapFn mapFn,S thisArg){
return from(Js.<JsArrayLike<JsBigint>>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final BigUint64Array from(JsBigint[] source,BigUint64Array.FromMapFn mapFn){
return from(Js.<JsArrayLike<JsBigint>>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final BigUint64Array from(JsBigint[] source){
return from(Js.<JsArrayLike<JsBigint>>uncheckedCast(source));
}
@JsOverlay
public static final <S extends @Nullable Object> BigUint64Array from(JsIterable<JsBigint, @Nullable Object, @Nullable Object> source,BigUint64Array.FromMapFn mapFn,S thisArg){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final BigUint64Array from(JsIterable<JsBigint, @Nullable Object, @Nullable Object> source,BigUint64Array.FromMapFn mapFn){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final BigUint64Array from(JsIterable<JsBigint, @Nullable Object, @Nullable Object> source){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source));
}
@JsOverlay
public static final <S extends @Nullable Object> BigUint64Array from(String source,BigUint64Array.FromMapFn mapFn,S thisArg){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source),mapFn,thisArg);
}
@JsOverlay
public static final BigUint64Array from(String source,BigUint64Array.FromMapFn mapFn){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source),mapFn);
}
@JsOverlay
public static final BigUint64Array from(String source){
return from(Js.<BigUint64Array.FromSourceUnionType>uncheckedCast(source));
}
public static native BigUint64Array of(JsBigint... var_args);
public BigUint64Array(ArrayBuffer lengthOrArrayOrBuffer,double byteOffset,double bufferLength){}
public BigUint64Array(ArrayBuffer lengthOrArrayOrBuffer,double byteOffset){}
public BigUint64Array(ArrayBuffer lengthOrArrayOrBuffer){}
public BigUint64Array(ArrayBufferView lengthOrArrayOrBuffer,double byteOffset,double bufferLength){}
public BigUint64Array(ArrayBufferView lengthOrArrayOrBuffer,double byteOffset){}
public BigUint64Array(ArrayBufferView lengthOrArrayOrBuffer){}
public BigUint64Array(BigUint64Array.@Nullable ConstructorLengthOrArrayOrBufferUnionType lengthOrArrayOrBuffer,double byteOffset,double bufferLength){}
public BigUint64Array(BigUint64Array.@Nullable ConstructorLengthOrArrayOrBufferUnionType lengthOrArrayOrBuffer,double byteOffset){}
public BigUint64Array(BigUint64Array.@Nullable ConstructorLengthOrArrayOrBufferUnionType lengthOrArrayOrBuffer){}
public BigUint64Array(JsArray<JsBigint> lengthOrArrayOrBuffer,double byteOffset,double bufferLength){}
public BigUint64Array(JsArray<JsBigint> lengthOrArrayOrBuffer,double byteOffset){}
public BigUint64Array(JsArray<JsBigint> lengthOrArrayOrBuffer){}
public BigUint64Array(JsBigint[] lengthOrArrayOrBuffer,double byteOffset,double bufferLength){}
public BigUint64Array(JsBigint[] lengthOrArrayOrBuffer,double byteOffset){}
public BigUint64Array(JsBigint[] lengthOrArrayOrBuffer){}
public BigUint64Array(SharedArrayBuffer lengthOrArrayOrBuffer,double byteOffset,double bufferLength){}
public BigUint64Array(SharedArrayBuffer lengthOrArrayOrBuffer,double byteOffset){}
public BigUint64Array(SharedArrayBuffer lengthOrArrayOrBuffer){}
public BigUint64Array(double lengthOrArrayOrBuffer,double byteOffset,double bufferLength){}
public BigUint64Array(double lengthOrArrayOrBuffer,double byteOffset){}
public BigUint64Array(double lengthOrArrayOrBuffer){}
}
