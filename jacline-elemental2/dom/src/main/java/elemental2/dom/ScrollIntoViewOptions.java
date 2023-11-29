package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ScrollIntoViewOptions{
@JsOverlay
static ScrollIntoViewOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getBehavior();
@JsProperty
String getBlock();
@JsProperty
String getInline();
@JsProperty
void setBehavior(String behavior);
@JsProperty
void setBlock(String block);
@JsProperty
void setInline(String inline);
}
