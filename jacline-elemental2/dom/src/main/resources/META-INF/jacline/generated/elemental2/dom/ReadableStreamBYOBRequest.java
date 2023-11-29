package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableStreamBYOBRequest{
@JsProperty
ArrayBufferView getView();
void respond(double bytesWritten);
void respondWithNewView(ArrayBufferView view);
@JsProperty
void setView(ArrayBufferView view);
}
