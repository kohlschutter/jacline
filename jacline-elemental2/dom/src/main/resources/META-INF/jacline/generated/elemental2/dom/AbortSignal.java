package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AbortSignal extends EventTarget{
@JsFunction
public interface OnabortFn{
Object onInvoke(Event p0);
}
@JsProperty
AbortSignal.OnabortFn getOnabort();
@JsProperty
Object getReason();
@JsProperty
boolean isAborted();
@JsProperty
void setAborted(boolean aborted);
@JsProperty
void setOnabort(AbortSignal.OnabortFn onabort);
@JsProperty
void setReason(Object reason);
void throwIfAborted();
}
