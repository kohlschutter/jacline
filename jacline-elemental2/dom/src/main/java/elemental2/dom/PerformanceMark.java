package elemental2.dom;
import elemental2.dom.PerformanceEntry;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.PerformanceMarkOptions;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceMark extends PerformanceEntry{
public JsObject detail;
public PerformanceMark(String markName,PerformanceMarkOptions markOptions){}
public PerformanceMark(String markName){}
}
