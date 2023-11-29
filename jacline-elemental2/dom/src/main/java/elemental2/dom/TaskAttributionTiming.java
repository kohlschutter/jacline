package elemental2.dom;
import elemental2.dom.PerformanceEntry;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TaskAttributionTiming extends PerformanceEntry{
public String containerId;
public String containerName;
public String containerSrc;
public String containerType;
}
