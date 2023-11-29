package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.StructuredSerializeOptions;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WindowPostMessageOptions extends StructuredSerializeOptions{
@JsOverlay
static WindowPostMessageOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getTargetOrigin();
@JsProperty
void setTargetOrigin(String targetOrigin);
}
