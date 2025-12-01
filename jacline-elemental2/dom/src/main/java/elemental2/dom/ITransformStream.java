package elemental2.dom;
import elemental2.dom.WritableStream;
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
public interface ITransformStream<IN_VALUE extends @Nullable Object, OUT_VALUE extends @Nullable Object>{
@JsOverlay
static <IN_VALUE extends @Nullable Object, OUT_VALUE extends @Nullable Object> ITransformStream<IN_VALUE, OUT_VALUE> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ReadableStream<OUT_VALUE> getReadable();
@JsProperty
WritableStream<IN_VALUE> getWritable();
@JsProperty
void setReadable(ReadableStream<OUT_VALUE> readable);
@JsProperty
void setWritable(WritableStream<IN_VALUE> writable);
}
