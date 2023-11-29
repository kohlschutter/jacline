package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpHeaderExtensionParameters{
@JsOverlay
static RTCRtpHeaderExtensionParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getId();
@JsProperty
String getUri();
@JsProperty
boolean isEncrypted();
@JsProperty
void setEncrypted(boolean encrypted);
@JsProperty
void setId(double id);
@JsProperty
void setUri(String uri);
}
