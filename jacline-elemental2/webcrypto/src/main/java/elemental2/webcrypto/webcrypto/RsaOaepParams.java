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
@JsType(isNative = true,name = "webCrypto.RsaOaepParams",namespace = JsPackage.GLOBAL)
public interface RsaOaepParams extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetLabelUnionType{
@JsOverlay
static RsaOaepParams.GetLabelUnionType of(Object o){
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
static RsaOaepParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
RsaOaepParams.GetLabelUnionType getLabel();
@JsOverlay
default void setLabel(ArrayBuffer label){
setLabel(Js.<RsaOaepParams.GetLabelUnionType>uncheckedCast(label));
}
@JsOverlay
default void setLabel(ArrayBufferView label){
setLabel(Js.<RsaOaepParams.GetLabelUnionType>uncheckedCast(label));
}
@JsProperty
void setLabel(RsaOaepParams.GetLabelUnionType label);
}
