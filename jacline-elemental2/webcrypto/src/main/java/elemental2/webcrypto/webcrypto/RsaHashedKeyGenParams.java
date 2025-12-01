package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.RsaKeyGenParams;
import java.lang.Object;
import elemental2.webcrypto.webcrypto.Algorithm;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.RsaHashedKeyGenParams",namespace = JsPackage.GLOBAL)
public interface RsaHashedKeyGenParams extends RsaKeyGenParams{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetHashUnionType{
@JsOverlay
static RsaHashedKeyGenParams.GetHashUnionType of(Object o){
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
@JsOverlay
static RsaHashedKeyGenParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
RsaHashedKeyGenParams.GetHashUnionType getHash();
@JsOverlay
default void setHash(Algorithm hash){
setHash(Js.<RsaHashedKeyGenParams.GetHashUnionType>uncheckedCast(hash));
}
@JsProperty
void setHash(RsaHashedKeyGenParams.GetHashUnionType hash);
@JsOverlay
default void setHash(String hash){
setHash(Js.<RsaHashedKeyGenParams.GetHashUnionType>uncheckedCast(hash));
}
}
