package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIIterableResult;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AsyncIterator<T extends @Nullable Object, TReturn extends @Nullable Object, TNext extends @Nullable Object>{
Promise<JsIIterableResult<T>> next();
Promise<JsIIterableResult<T>> next(@Nullable Object p0);
}
