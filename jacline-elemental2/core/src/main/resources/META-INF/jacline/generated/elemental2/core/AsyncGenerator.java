package elemental2.core;
import elemental2.core.AsyncIteratorIterable;
import elemental2.core.JsIIterableResult;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AsyncGenerator<VALUE, UNUSED_RETURN_T, UNUSED_NEXT_T> extends AsyncIteratorIterable<VALUE>{
Promise<JsIIterableResult<VALUE>> next();
Promise<JsIIterableResult<VALUE>> next(Object value);
@JsMethod(name = "return")
Promise<JsIIterableResult<VALUE>> return_(VALUE value);
@JsMethod(name = "throw")
Promise<JsIIterableResult<VALUE>> throw_(Object exception);
}
