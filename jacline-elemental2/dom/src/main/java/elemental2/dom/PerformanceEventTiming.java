package elemental2.dom;
import elemental2.dom.PerformanceEntry;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceEventTiming extends PerformanceEntry{
public boolean cancelable;
public double processingEnd;
public double processingStart;
public Node target;
}
