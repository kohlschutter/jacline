package elemental2.core;
import elemental2.core.JsIIterableResult;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Generator<VALUE, UNUSED_RETURN_T, UNUSED_NEXT_T> extends JsIteratorIterable<VALUE>{
JsIIterableResult<VALUE> next();
JsIIterableResult<VALUE> next(Object value);
@JsMethod(name = "return")
JsIIterableResult<VALUE> return_(VALUE value);
@JsMethod(name = "throw")
JsIIterableResult<VALUE> throw_(Object exception);
}
