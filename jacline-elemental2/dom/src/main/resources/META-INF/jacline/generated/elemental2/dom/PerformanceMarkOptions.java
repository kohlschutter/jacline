package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PerformanceMarkOptions{
@JsOverlay
static PerformanceMarkOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsObject getDetail();
@JsProperty
double getStartTime();
@JsProperty
void setDetail(JsObject detail);
@JsOverlay
default void setDetail(Object detail){
setDetail(Js.<JsObject>uncheckedCast(detail));
}
@JsProperty
void setStartTime(double startTime);
}
