package elemental2.dom;
import jsinterop.annotations.JsFunction;
import elemental2.dom.PerformanceObserverEntryList;
import elemental2.dom.PerformanceObserver;
@JsFunction
public interface PerformanceObserverCallback{
void onInvoke(PerformanceObserverEntryList p0,PerformanceObserver p1);
}
