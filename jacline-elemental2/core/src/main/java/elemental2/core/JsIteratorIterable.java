package elemental2.core;
import elemental2.core.JsIterator;
import elemental2.core.JsIterable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "IteratorIterable",namespace = JsPackage.GLOBAL)
public interface JsIteratorIterable<T> extends JsIterable<T>, JsIterator<T, Object, Object>{
}
