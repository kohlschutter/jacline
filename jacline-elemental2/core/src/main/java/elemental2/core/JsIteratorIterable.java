package elemental2.core;
import elemental2.core.JsIterator;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "IteratorIterable",namespace = JsPackage.GLOBAL)
public interface JsIteratorIterable<T extends @Nullable Object, TReturn extends @Nullable Object, TNext extends @Nullable Object> extends JsIterable<T, @Nullable Object, @Nullable Object>, JsIterator<T, @Nullable Object, @Nullable Object>{
}
