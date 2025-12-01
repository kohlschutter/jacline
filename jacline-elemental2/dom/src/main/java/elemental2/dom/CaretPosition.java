package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CaretPosition{
public double offset;
public @Nullable Node offsetNode;
}
