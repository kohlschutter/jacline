package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.webcrypto.webcrypto.Algorithm;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.RsaHashedImportParams",namespace = JsPackage.GLOBAL)
public interface RsaHashedImportParams extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetHashUnionType{
@JsOverlay
static RsaHashedImportParams.GetHashUnionType of(Object o){
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
static RsaHashedImportParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
RsaHashedImportParams.GetHashUnionType getHash();
@JsOverlay
default void setHash(Algorithm hash){
setHash(Js.<RsaHashedImportParams.GetHashUnionType>uncheckedCast(hash));
}
@JsProperty
void setHash(RsaHashedImportParams.GetHashUnionType hash);
@JsOverlay
default void setHash(String hash){
setHash(Js.<RsaHashedImportParams.GetHashUnionType>uncheckedCast(hash));
}
}
