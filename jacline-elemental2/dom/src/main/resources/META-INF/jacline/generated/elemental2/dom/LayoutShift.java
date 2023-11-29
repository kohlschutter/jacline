package elemental2.dom;
import elemental2.dom.PerformanceEntry;
import elemental2.dom.LayoutShiftAttribution;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class LayoutShift extends PerformanceEntry{
public boolean hadRecentInput;
public double lastInputTime;
public JsArray<LayoutShiftAttribution> sources;
public double value;
}
