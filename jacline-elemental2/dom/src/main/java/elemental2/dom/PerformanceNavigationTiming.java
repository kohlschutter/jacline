package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.PerformanceResourceTiming;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceNavigationTiming extends PerformanceResourceTiming{
public double activationStart;
public double domComplete;
public double domContentLoadedEventEnd;
public double domContentLoadedEventStart;
public double domInteractive;
public double loadEventEnd;
public double loadEventStart;
public double redirectCount;
public String type;
public double unloadEventEnd;
public double unloadEventStart;
}
