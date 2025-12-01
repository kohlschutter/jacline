package elemental2.webcrypto.webcrypto;
import elemental2.core.ArrayBuffer;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.Algorithm;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "webCrypto.HkdfParams",namespace = JsPackage.GLOBAL)
public interface HkdfParams extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetHashUnionType{
@JsOverlay
static HkdfParams.GetHashUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetInfoUnionType{
@JsOverlay
static HkdfParams.GetInfoUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
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
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetSaltUnionType{
@JsOverlay
static HkdfParams.GetSaltUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
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
}
@JsOverlay
static HkdfParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
HkdfParams.GetHashUnionType getHash();
@JsProperty
HkdfParams.GetInfoUnionType getInfo();
@JsProperty
HkdfParams.GetSaltUnionType getSalt();
@JsOverlay
default void setHash(Algorithm hash){
setHash(Js.<HkdfParams.GetHashUnionType>uncheckedCast(hash));
}
@JsProperty
void setHash(HkdfParams.GetHashUnionType hash);
@JsOverlay
default void setHash(String hash){
setHash(Js.<HkdfParams.GetHashUnionType>uncheckedCast(hash));
}
@JsOverlay
default void setInfo(ArrayBuffer info){
setInfo(Js.<HkdfParams.GetInfoUnionType>uncheckedCast(info));
}
@JsOverlay
default void setInfo(ArrayBufferView info){
setInfo(Js.<HkdfParams.GetInfoUnionType>uncheckedCast(info));
}
@JsProperty
void setInfo(HkdfParams.GetInfoUnionType info);
@JsOverlay
default void setSalt(ArrayBuffer salt){
setSalt(Js.<HkdfParams.GetSaltUnionType>uncheckedCast(salt));
}
@JsOverlay
default void setSalt(ArrayBufferView salt){
setSalt(Js.<HkdfParams.GetSaltUnionType>uncheckedCast(salt));
}
@JsProperty
void setSalt(HkdfParams.GetSaltUnionType salt);
}
