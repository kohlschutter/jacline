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
public interface MediaEncryptedEventInit extends EventInit{
@JsOverlay
static MediaEncryptedEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ArrayBuffer getInitData();
@JsProperty
String getInitDataType();
@JsProperty
void setInitData(ArrayBuffer initData);
@JsProperty
void setInitDataType(String initDataType);
}
