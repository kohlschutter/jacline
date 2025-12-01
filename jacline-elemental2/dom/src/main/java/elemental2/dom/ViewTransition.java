package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.Void;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ViewTransition{
@JsProperty
Promise<Void> getFinished();
@JsProperty
Promise<Void> getReady();
@JsProperty
Promise<Void> getUpdateCallbackDone();
void skipTransition();
}
