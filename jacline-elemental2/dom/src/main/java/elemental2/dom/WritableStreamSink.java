package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.promise.IThenable;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import elemental2.dom.WritableStreamDefaultController;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WritableStreamSink<VALUE extends @Nullable Object>{
@JsFunction
public interface AbortFn{
IThenable<@Nullable Object> onInvoke(@Nullable Object p0);
}
@JsFunction
public interface CloseFn{
IThenable<@Nullable Object> onInvoke();
}
@JsFunction
public interface StartFn{
IThenable<@Nullable Object> onInvoke(WritableStreamDefaultController p0);
}
@JsFunction
public interface WriteFn<VALUE extends @Nullable Object>{
IThenable<@Nullable Object> onInvoke(VALUE p0,WritableStreamDefaultController p1);
}
@JsOverlay
static <VALUE extends @Nullable Object> WritableStreamSink<VALUE> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
WritableStreamSink.AbortFn getAbort();
@JsProperty
WritableStreamSink.CloseFn getClose();
@JsProperty
WritableStreamSink.StartFn getStart();
@JsProperty
WritableStreamSink.WriteFn<VALUE> getWrite();
@JsProperty
void setAbort(WritableStreamSink.AbortFn abort);
@JsProperty
void setClose(WritableStreamSink.CloseFn close);
@JsProperty
void setStart(WritableStreamSink.StartFn start);
@JsProperty
void setWrite(WritableStreamSink.WriteFn<? super VALUE> write);
}
