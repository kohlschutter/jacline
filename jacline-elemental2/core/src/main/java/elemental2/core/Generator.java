package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIIterableResult;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Generator<T extends @Nullable Object, TReturn extends @Nullable Object, TNext extends @Nullable Object> extends JsIteratorIterable<T, @Nullable Object, @Nullable Object>{
JsIIterableResult<T> next();
JsIIterableResult<T> next(@Nullable Object value);
@JsMethod(name = "return")
JsIIterableResult<T> return_(T value);
@JsMethod(name = "throw")
JsIIterableResult<T> throw_(@Nullable Object exception);
}
