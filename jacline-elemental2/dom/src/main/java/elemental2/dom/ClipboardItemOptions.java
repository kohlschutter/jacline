package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ClipboardItemOptions{
@JsOverlay
static ClipboardItemOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getPresentationStyle();
@JsProperty
void setPresentationStyle(String presentationStyle);
}
