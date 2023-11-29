package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ScrollToOptions{
@JsOverlay
static ScrollToOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getBehavior();
@JsProperty
double getLeft();
@JsProperty
double getTop();
@JsProperty
void setBehavior(String behavior);
@JsProperty
void setLeft(double left);
@JsProperty
void setTop(double top);
}
