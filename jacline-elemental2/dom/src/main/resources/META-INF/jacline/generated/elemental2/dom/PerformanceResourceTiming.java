package elemental2.dom;
import elemental2.dom.PerformanceEntry;
import elemental2.dom.PerformanceServerTiming;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceResourceTiming extends PerformanceEntry{
public double connectEnd;
public double connectStart;
public int decodedBodySize;
public double domainLookupEnd;
public double domainLookupStart;
public int encodedBodySize;
public double fetchStart;
public String initiatorType;
public String nextHopProtocol;
public double redirectEnd;
public double redirectStart;
public double requestStart;
public double responseEnd;
public double responseStart;
public double secureConnectionStart;
public JsArray<PerformanceServerTiming> serverTiming;
public int transferSize;
public double workerStart;
}
