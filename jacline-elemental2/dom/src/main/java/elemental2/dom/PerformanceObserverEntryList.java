package elemental2.dom;
import elemental2.dom.PerformanceEntry;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceObserverEntryList{
public native JsArray<PerformanceEntry> getEntries();
public native JsArray<PerformanceEntry> getEntriesByName(String type);
public native JsArray<PerformanceEntry> getEntriesByType(String name,String type);
public native JsArray<PerformanceEntry> getEntriesByType(String name);
}
