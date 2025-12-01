package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.dom.MediaTrackConstraintSet;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaTrackConstraints extends MediaTrackConstraintSet{
@JsOverlay
static MediaTrackConstraints create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable JsArray<MediaTrackConstraintSet> getAdvanced();
@JsProperty
void setAdvanced(@Nullable JsArray<MediaTrackConstraintSet> advanced);
@JsOverlay
default void setAdvanced(MediaTrackConstraintSet@Nullable [] advanced){
setAdvanced(Js.<@Nullable JsArray<MediaTrackConstraintSet>>uncheckedCast(advanced));
}
}
