package elemental2.webcrypto.webcrypto;
import org.jspecify.annotations.Nullable;
import elemental2.core.Uint32Array;
import elemental2.core.BigUint64Array;
import elemental2.core.Int16Array;
import elemental2.core.BigInt64Array;
import elemental2.webcrypto.webcrypto.SubtleCrypto;
import jsinterop.annotations.JsProperty;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.core.Uint16Array;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.core.Int32Array;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.core.Int8Array;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "webCrypto.Crypto",namespace = JsPackage.GLOBAL)
public interface Crypto{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetRandomValuesTypedArrayUnionType{
@JsOverlay
static Crypto.GetRandomValuesTypedArrayUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default BigInt64Array asBigInt64Array(){
return Js.cast(this);
}
@JsOverlay
default BigUint64Array asBigUint64Array(){
return Js.cast(this);
}
@JsOverlay
default Int16Array asInt16Array(){
return Js.cast(this);
}
@JsOverlay
default Int32Array asInt32Array(){
return Js.cast(this);
}
@JsOverlay
default Int8Array asInt8Array(){
return Js.cast(this);
}
@JsOverlay
default Uint16Array asUint16Array(){
return Js.cast(this);
}
@JsOverlay
default Uint32Array asUint32Array(){
return Js.cast(this);
}
@JsOverlay
default Uint8Array asUint8Array(){
return Js.cast(this);
}
@JsOverlay
default Uint8ClampedArray asUint8ClampedArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isBigInt64Array(){
return (Object)this instanceof BigInt64Array;
}
@JsOverlay
default boolean isBigUint64Array(){
return (Object)this instanceof BigUint64Array;
}
@JsOverlay
default boolean isInt16Array(){
return (Object)this instanceof Int16Array;
}
@JsOverlay
default boolean isInt32Array(){
return (Object)this instanceof Int32Array;
}
@JsOverlay
default boolean isInt8Array(){
return (Object)this instanceof Int8Array;
}
@JsOverlay
default boolean isUint16Array(){
return (Object)this instanceof Uint16Array;
}
@JsOverlay
default boolean isUint32Array(){
return (Object)this instanceof Uint32Array;
}
@JsOverlay
default boolean isUint8Array(){
return (Object)this instanceof Uint8Array;
}
@JsOverlay
default boolean isUint8ClampedArray(){
return (Object)this instanceof Uint8ClampedArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetRandomValuesUnionType{
@JsOverlay
static Crypto.GetRandomValuesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default BigInt64Array asBigInt64Array(){
return Js.cast(this);
}
@JsOverlay
default BigUint64Array asBigUint64Array(){
return Js.cast(this);
}
@JsOverlay
default Int16Array asInt16Array(){
return Js.cast(this);
}
@JsOverlay
default Int32Array asInt32Array(){
return Js.cast(this);
}
@JsOverlay
default Int8Array asInt8Array(){
return Js.cast(this);
}
@JsOverlay
default Uint16Array asUint16Array(){
return Js.cast(this);
}
@JsOverlay
default Uint32Array asUint32Array(){
return Js.cast(this);
}
@JsOverlay
default Uint8Array asUint8Array(){
return Js.cast(this);
}
@JsOverlay
default Uint8ClampedArray asUint8ClampedArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isBigInt64Array(){
return (Object)this instanceof BigInt64Array;
}
@JsOverlay
default boolean isBigUint64Array(){
return (Object)this instanceof BigUint64Array;
}
@JsOverlay
default boolean isInt16Array(){
return (Object)this instanceof Int16Array;
}
@JsOverlay
default boolean isInt32Array(){
return (Object)this instanceof Int32Array;
}
@JsOverlay
default boolean isInt8Array(){
return (Object)this instanceof Int8Array;
}
@JsOverlay
default boolean isUint16Array(){
return (Object)this instanceof Uint16Array;
}
@JsOverlay
default boolean isUint32Array(){
return (Object)this instanceof Uint32Array;
}
@JsOverlay
default boolean isUint8Array(){
return (Object)this instanceof Uint8Array;
}
@JsOverlay
default boolean isUint8ClampedArray(){
return (Object)this instanceof Uint8ClampedArray;
}
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(BigInt64Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(BigUint64Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
Crypto.GetRandomValuesUnionType getRandomValues(Crypto.GetRandomValuesTypedArrayUnionType typedArray);
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(Int16Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(Int32Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(Int8Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(Uint16Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(Uint32Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(Uint8Array typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsOverlay
default Crypto.GetRandomValuesUnionType getRandomValues(Uint8ClampedArray typedArray){
return getRandomValues(Js.<Crypto.GetRandomValuesTypedArrayUnionType>uncheckedCast(typedArray));
}
@JsProperty
@Nullable SubtleCrypto getSubtle();
String randomUUID();
@JsProperty
void setSubtle(@Nullable SubtleCrypto subtle);
}
