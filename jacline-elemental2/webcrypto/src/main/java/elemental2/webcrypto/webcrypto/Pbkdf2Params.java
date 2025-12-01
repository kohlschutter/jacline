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
@JsType(isNative = true,name = "webCrypto.Pbkdf2Params",namespace = JsPackage.GLOBAL)
public interface Pbkdf2Params extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetHashUnionType{
@JsOverlay
static Pbkdf2Params.GetHashUnionType of(Object o){
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
public interface GetSaltUnionType{
@JsOverlay
static Pbkdf2Params.GetSaltUnionType of(Object o){
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
static Pbkdf2Params create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Pbkdf2Params.GetHashUnionType getHash();
@JsProperty
double getIterations();
@JsProperty
Pbkdf2Params.GetSaltUnionType getSalt();
@JsOverlay
default void setHash(Algorithm hash){
setHash(Js.<Pbkdf2Params.GetHashUnionType>uncheckedCast(hash));
}
@JsProperty
void setHash(Pbkdf2Params.GetHashUnionType hash);
@JsOverlay
default void setHash(String hash){
setHash(Js.<Pbkdf2Params.GetHashUnionType>uncheckedCast(hash));
}
@JsProperty
void setIterations(double iterations);
@JsOverlay
default void setSalt(ArrayBuffer salt){
setSalt(Js.<Pbkdf2Params.GetSaltUnionType>uncheckedCast(salt));
}
@JsOverlay
default void setSalt(ArrayBufferView salt){
setSalt(Js.<Pbkdf2Params.GetSaltUnionType>uncheckedCast(salt));
}
@JsProperty
void setSalt(Pbkdf2Params.GetSaltUnionType salt);
}
