package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtcpParameters{
@JsOverlay
static RTCRtcpParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getCname();
@JsProperty
boolean isReducedSize();
@JsProperty
void setCname(String cname);
@JsProperty
void setReducedSize(boolean reducedSize);
}
