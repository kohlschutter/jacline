package elemental2.webassembly;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
@JsFunction
public interface TableFunction{
Object onInvoke(Object... parameters);
}
