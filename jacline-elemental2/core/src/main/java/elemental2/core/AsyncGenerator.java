package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.AsyncIteratorIterable;
import elemental2.core.JsIIterableResult;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AsyncGenerator<T extends @Nullable Object, TReturn extends @Nullable Object, TNext extends @Nullable Object> extends AsyncIteratorIterable<T, TReturn, TNext>{
Promise<JsIIterableResult<T>> next();
Promise<JsIIterableResult<T>> next(@Nullable Object value);
@JsMethod(name = "return")
Promise<JsIIterableResult<T>> return_(T value);
@JsMethod(name = "throw")
Promise<JsIIterableResult<T>> throw_(@Nullable Object exception);
}
