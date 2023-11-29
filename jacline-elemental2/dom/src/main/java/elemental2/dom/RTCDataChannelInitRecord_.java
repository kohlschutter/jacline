package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCDataChannelInitRecord_{
@JsOverlay
static RTCDataChannelInitRecord_ create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isReliable();
@JsProperty
void setReliable(boolean reliable);
}
