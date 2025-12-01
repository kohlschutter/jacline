package elemental2.webassembly;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
@JsFunction
public interface TableFunction{
@Nullable Object onInvoke(@Nullable Object... parameters);
}
