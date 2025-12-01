package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Touch;
import elemental2.dom.UIEventInit;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TouchEventInit extends UIEventInit{
@JsOverlay
static TouchEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<@Nullable Touch> getChangedTouches();
@JsProperty
@Nullable EventTarget getRelatedTarget();
@JsProperty
JsArray<@Nullable Touch> getTargetTouches();
@JsProperty
JsArray<@Nullable Touch> getTouches();
@JsProperty
void setChangedTouches(JsArray<@Nullable Touch> changedTouches);
@JsOverlay
default void setChangedTouches(@Nullable Touch[] changedTouches){
setChangedTouches(Js.<JsArray<@Nullable Touch>>uncheckedCast(changedTouches));
}
@JsProperty
void setRelatedTarget(@Nullable EventTarget relatedTarget);
@JsProperty
void setTargetTouches(JsArray<@Nullable Touch> targetTouches);
@JsOverlay
default void setTargetTouches(@Nullable Touch[] targetTouches){
setTargetTouches(Js.<JsArray<@Nullable Touch>>uncheckedCast(targetTouches));
}
@JsProperty
void setTouches(JsArray<@Nullable Touch> touches);
@JsOverlay
default void setTouches(@Nullable Touch[] touches){
setTouches(Js.<JsArray<@Nullable Touch>>uncheckedCast(touches));
}
}
