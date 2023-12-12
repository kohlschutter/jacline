package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.ArrayBuffer;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaKeyMessageEventInit extends EventInit{
@JsOverlay
static MediaKeyMessageEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ArrayBuffer getMessage();
@JsProperty
String getMessageType();
@JsProperty
void setMessage(ArrayBuffer message);
@JsProperty
void setMessageType(String messageType);
}
