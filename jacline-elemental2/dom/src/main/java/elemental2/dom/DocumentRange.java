package elemental2.dom;
import java.lang.FunctionalInterface;
import elemental2.dom.Range;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@FunctionalInterface
public interface DocumentRange{
Range createRange();
}
