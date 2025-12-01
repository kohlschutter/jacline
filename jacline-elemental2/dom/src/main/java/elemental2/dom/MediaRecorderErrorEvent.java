package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMException;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaRecorderErrorEvent{
@JsProperty
@Nullable DOMException getError();
@JsProperty
void setError(@Nullable DOMException error);
}
