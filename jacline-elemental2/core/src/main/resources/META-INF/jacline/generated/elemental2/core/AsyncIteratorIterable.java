package elemental2.core;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.AsyncIterable;
import elemental2.core.AsyncIterator;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AsyncIteratorIterable<VALUE> extends AsyncIterable<VALUE>, AsyncIterator<VALUE, Object, Object>{
}
