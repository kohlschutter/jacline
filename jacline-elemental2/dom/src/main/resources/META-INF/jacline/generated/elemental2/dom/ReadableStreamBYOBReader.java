package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.Void;
import elemental2.core.JsIIterableResult;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableStreamBYOBReader{
Promise<Void> cancel(Object reason);
@JsProperty
Promise<Void> getClosed();
<BUFFER>Promise<JsIIterableResult<BUFFER>> read(BUFFER view);
void releaseLock();
@JsProperty
void setClosed(Promise<Void> closed);
}
