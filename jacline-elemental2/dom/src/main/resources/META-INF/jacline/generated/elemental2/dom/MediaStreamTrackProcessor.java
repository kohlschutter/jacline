package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.ReadableStream;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaStreamTrackProcessor<T>{
@JsOverlay
static MediaStreamTrackProcessor create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ReadableStream<T> getReadable();
}
