package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
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
@Nullable JsObject getDetail();
@JsProperty
double getStartTime();
@JsProperty
void setDetail(@Nullable JsObject detail);
@JsOverlay
default void setDetail(@Nullable Object detail){
setDetail(Js.<@Nullable JsObject>uncheckedCast(detail));
}
@JsProperty
void setStartTime(double startTime);
}
