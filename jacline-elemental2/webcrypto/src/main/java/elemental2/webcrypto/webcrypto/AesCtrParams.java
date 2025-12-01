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
@JsType(isNative = true,name = "webCrypto.AesCtrParams",namespace = JsPackage.GLOBAL)
public interface AesCtrParams extends Algorithm{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetCounterUnionType{
@JsOverlay
static AesCtrParams.GetCounterUnionType of(Object o){
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
static AesCtrParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
AesCtrParams.GetCounterUnionType getCounter();
@JsProperty
double getLength();
@JsOverlay
default void setCounter(ArrayBuffer counter){
setCounter(Js.<AesCtrParams.GetCounterUnionType>uncheckedCast(counter));
}
@JsOverlay
default void setCounter(ArrayBufferView counter){
setCounter(Js.<AesCtrParams.GetCounterUnionType>uncheckedCast(counter));
}
@JsProperty
void setCounter(AesCtrParams.GetCounterUnionType counter);
@JsProperty
void setLength(double length);
}
