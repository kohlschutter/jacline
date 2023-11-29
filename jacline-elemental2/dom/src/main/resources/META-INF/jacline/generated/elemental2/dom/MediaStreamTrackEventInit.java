package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaStreamTrack;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaStreamTrackEventInit{
@JsOverlay
static MediaStreamTrackEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
MediaStreamTrack getTrack();
@JsProperty
void setTrack(MediaStreamTrack track);
}
