package elemental2.dom;
import jsinterop.annotations.JsProperty;
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
JsArray<MediaTrackConstraintSet> getAdvanced();
@JsProperty
void setAdvanced(JsArray<MediaTrackConstraintSet> advanced);
@JsOverlay
default void setAdvanced(MediaTrackConstraintSet[] advanced){
setAdvanced(Js.<JsArray<MediaTrackConstraintSet>>uncheckedCast(advanced));
}
}
