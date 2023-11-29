package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PerformanceObserverInit{
@JsOverlay
static PerformanceObserverInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<String> getEntryTypes();
@JsProperty
String getType();
@JsProperty
boolean isBuffered();
@JsProperty
void setBuffered(boolean buffered);
@JsProperty
void setEntryTypes(JsArray<String> entryTypes);
@JsOverlay
default void setEntryTypes(String[] entryTypes){
setEntryTypes(Js.<JsArray<String>>uncheckedCast(entryTypes));
}
@JsProperty
void setType(String type);
}
