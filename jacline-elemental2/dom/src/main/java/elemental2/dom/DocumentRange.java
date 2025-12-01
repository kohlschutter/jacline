package elemental2.dom;
import java.lang.FunctionalInterface;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Range;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@FunctionalInterface
public interface DocumentRange{
@Nullable Range createRange();
}
