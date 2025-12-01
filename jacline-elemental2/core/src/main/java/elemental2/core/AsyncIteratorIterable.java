package elemental2.core;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.AsyncIterable;
import elemental2.core.AsyncIterator;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AsyncIteratorIterable<T extends @Nullable Object, TReturn extends @Nullable Object, TNext extends @Nullable Object> extends AsyncIterable<T, @Nullable Object, @Nullable Object>, AsyncIterator<T, @Nullable Object, @Nullable Object>{
}
