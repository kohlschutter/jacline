package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceEntry{
public double duration;
public String entryType;
public String name;
public double startTime;
}
