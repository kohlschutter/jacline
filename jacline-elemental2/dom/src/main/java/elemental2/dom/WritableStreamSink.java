package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.promise.IThenable;
import elemental2.dom.WritableStreamDefaultController;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WritableStreamSink<VALUE>{
@JsFunction
public interface AbortFn{
IThenable<Object> onInvoke(Object p0);
}
@JsFunction
public interface CloseFn{
IThenable<Object> onInvoke();
}
@JsFunction
public interface StartFn{
IThenable<Object> onInvoke(WritableStreamDefaultController p0);
}
@JsFunction
public interface WriteFn<VALUE>{
IThenable<Object> onInvoke(VALUE p0,WritableStreamDefaultController p1);
}
@JsOverlay
static WritableStreamSink create(){
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
