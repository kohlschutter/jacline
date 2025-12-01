package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.PerformanceEntry;
import elemental2.dom.PerformanceObserverCallback;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
import elemental2.dom.PerformanceObserverInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceObserver{
@JsOverlay
public static final JsArray<String> supportedEntryTypes=PerformanceObserver__Constants.supportedEntryTypes;
public PerformanceObserver(PerformanceObserverCallback callback){}
public native void disconnect();
public native @Nullable Object observe(PerformanceObserverInit options);
public native JsArray<PerformanceEntry> takeRecords();
}
