package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
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
@Nullable ArrayBuffer getInitData();
@JsProperty
String getInitDataType();
@JsProperty
void setInitData(@Nullable ArrayBuffer initData);
@JsProperty
void setInitDataType(String initDataType);
}
