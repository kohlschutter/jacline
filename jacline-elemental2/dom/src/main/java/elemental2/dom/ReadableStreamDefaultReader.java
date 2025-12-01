package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import java.lang.Void;
import elemental2.core.JsIIterableResult;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableStreamDefaultReader<VALUE extends @Nullable Object>{
Promise<Void> cancel(@Nullable Object reason);
@JsProperty
Promise<Void> getClosed();
Promise<JsIIterableResult<VALUE>> read();
void releaseLock();
@JsProperty
void setClosed(Promise<Void> closed);
}
