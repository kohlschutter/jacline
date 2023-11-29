package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCDTMFToneChangeEventInit{
@JsOverlay
static RTCDTMFToneChangeEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getTone();
@JsProperty
void setTone(String tone);
}
