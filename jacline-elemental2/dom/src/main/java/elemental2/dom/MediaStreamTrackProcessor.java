package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.ReadableStream;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaStreamTrackProcessor<T extends @Nullable Object>{
@JsOverlay
static <T extends @Nullable Object> MediaStreamTrackProcessor<T> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ReadableStream<T> getReadable();
}
