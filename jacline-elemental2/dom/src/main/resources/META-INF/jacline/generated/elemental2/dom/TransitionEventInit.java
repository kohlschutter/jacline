package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TransitionEventInit extends EventInit{
@JsOverlay
static TransitionEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getElapsedTime();
@JsProperty
String getPropertyName();
@JsProperty
String getPseudoElement();
@JsProperty
void setElapsedTime(double elapsedTime);
@JsProperty
void setPropertyName(String propertyName);
@JsProperty
void setPseudoElement(String pseudoElement);
}
