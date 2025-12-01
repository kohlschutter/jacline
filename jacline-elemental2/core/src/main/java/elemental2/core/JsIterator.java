package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIIterableResult;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "Iterator",namespace = JsPackage.GLOBAL)
public interface JsIterator<T extends @Nullable Object, TReturn extends @Nullable Object, TNext extends @Nullable Object>{
JsIIterableResult<T> next();
JsIIterableResult<T> next(@Nullable Object value);
}
