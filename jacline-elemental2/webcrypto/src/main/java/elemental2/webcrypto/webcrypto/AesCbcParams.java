package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.webcrypto.webcrypto.Algorithm;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.AesCbcParams",namespace = JsPackage.GLOBAL)
public interface AesCbcParams extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetIvUnionType{
@JsOverlay
static AesCbcParams.GetIvUnionType of(Object o){
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
static AesCbcParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
AesCbcParams.GetIvUnionType getIv();
@JsOverlay
default void setIv(ArrayBuffer iv){
setIv(Js.<AesCbcParams.GetIvUnionType>uncheckedCast(iv));
}
@JsOverlay
default void setIv(ArrayBufferView iv){
setIv(Js.<AesCbcParams.GetIvUnionType>uncheckedCast(iv));
}
@JsProperty
void setIv(AesCbcParams.GetIvUnionType iv);
}
