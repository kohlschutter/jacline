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
@JsType(isNative = true,name = "webCrypto.HmacImportParams",namespace = JsPackage.GLOBAL)
public interface HmacImportParams extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetHashUnionType{
@JsOverlay
static HmacImportParams.GetHashUnionType of(Object o){
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
static HmacImportParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
HmacImportParams.GetHashUnionType getHash();
@JsProperty
double getLength();
@JsOverlay
default void setHash(Algorithm hash){
setHash(Js.<HmacImportParams.GetHashUnionType>uncheckedCast(hash));
}
@JsProperty
void setHash(HmacImportParams.GetHashUnionType hash);
@JsOverlay
default void setHash(String hash){
setHash(Js.<HmacImportParams.GetHashUnionType>uncheckedCast(hash));
}
@JsProperty
void setLength(double length);
}
