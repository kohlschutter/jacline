package elemental2.core;
import elemental2.core.JsIIterableResult;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "Iterator",namespace = JsPackage.GLOBAL)
public interface JsIterator<VALUE, UNUSED_RETURN_T, UNUSED_NEXT_T>{
JsIIterableResult<VALUE> next();
JsIIterableResult<VALUE> next(Object value);
}
