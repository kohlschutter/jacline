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
@JsType(isNative = true,name = "webCrypto.AesGcmParams",namespace = JsPackage.GLOBAL)
public interface AesGcmParams extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAdditionalDataUnionType{
@JsOverlay
static AesGcmParams.GetAdditionalDataUnionType of(Object o){
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
public interface GetIvUnionType{
@JsOverlay
static AesGcmParams.GetIvUnionType of(Object o){
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
static AesGcmParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
AesGcmParams.GetAdditionalDataUnionType getAdditionalData();
@JsProperty
AesGcmParams.GetIvUnionType getIv();
@JsProperty
double getTagLength();
@JsOverlay
default void setAdditionalData(ArrayBuffer additionalData){
setAdditionalData(Js.<AesGcmParams.GetAdditionalDataUnionType>uncheckedCast(additionalData));
}
@JsOverlay
default void setAdditionalData(ArrayBufferView additionalData){
setAdditionalData(Js.<AesGcmParams.GetAdditionalDataUnionType>uncheckedCast(additionalData));
}
@JsProperty
void setAdditionalData(AesGcmParams.GetAdditionalDataUnionType additionalData);
@JsOverlay
default void setIv(ArrayBuffer iv){
setIv(Js.<AesGcmParams.GetIvUnionType>uncheckedCast(iv));
}
@JsOverlay
default void setIv(ArrayBufferView iv){
setIv(Js.<AesGcmParams.GetIvUnionType>uncheckedCast(iv));
}
@JsProperty
void setIv(AesGcmParams.GetIvUnionType iv);
@JsProperty
void setTagLength(double tagLength);
}
