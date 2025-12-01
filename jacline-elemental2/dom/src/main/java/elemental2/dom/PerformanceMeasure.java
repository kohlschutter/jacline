package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.PerformanceEntry;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceMeasure extends PerformanceEntry{
public @Nullable JsObject detail;
}
