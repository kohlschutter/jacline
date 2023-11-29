package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.DOMException;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaRecorderErrorEvent{
@JsProperty
DOMException getError();
@JsProperty
void setError(DOMException error);
}
