package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.dom.Touch;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TouchEventInit extends UIEventInit{
@JsOverlay
static TouchEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<Touch> getChangedTouches();
@JsProperty
EventTarget getRelatedTarget();
@JsProperty
JsArray<Touch> getTargetTouches();
@JsProperty
JsArray<Touch> getTouches();
@JsProperty
void setChangedTouches(JsArray<Touch> changedTouches);
@JsOverlay
default void setChangedTouches(Touch[] changedTouches){
setChangedTouches(Js.<JsArray<Touch>>uncheckedCast(changedTouches));
}
@JsProperty
void setRelatedTarget(EventTarget relatedTarget);
@JsProperty
void setTargetTouches(JsArray<Touch> targetTouches);
@JsOverlay
default void setTargetTouches(Touch[] targetTouches){
setTargetTouches(Js.<JsArray<Touch>>uncheckedCast(targetTouches));
}
@JsProperty
void setTouches(JsArray<Touch> touches);
@JsOverlay
default void setTouches(Touch[] touches){
setTouches(Js.<JsArray<Touch>>uncheckedCast(touches));
}
}
