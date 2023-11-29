package elemental2.dom;
import elemental2.dom.PerformanceMeasure;
import elemental2.dom.Event;
import elemental2.core.JsArray;
import elemental2.dom.PerformanceTiming;
import elemental2.dom.PerformanceMeasureOptions;
import elemental2.dom.PerformanceNavigation;
import jsinterop.base.Js;
import elemental2.dom.PerformanceMark;
import elemental2.dom.PerformanceEntry;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.PerformanceMarkOptions;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Performance{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface MeasureStartOrMeasureOptionsUnionType{
@JsOverlay
static Performance.MeasureStartOrMeasureOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default PerformanceMeasureOptions asPerformanceMeasureOptions(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsFunction
public interface OnresourcetimingbufferfullFn{
Object onInvoke(Event p0);
}
public PerformanceNavigation navigation;
public Performance.OnresourcetimingbufferfullFn onresourcetimingbufferfull;
public double timeOrigin;
public PerformanceTiming timing;
public native void clearMarks();
public native void clearMarks(String markName);
public native void clearMeasures();
public native void clearMeasures(String measureName);
public native void clearResourceTimings();
public native JsArray<PerformanceEntry> getEntries();
public native JsArray<PerformanceEntry> getEntriesByName(String name,String entryType);
public native JsArray<PerformanceEntry> getEntriesByName(String name);
public native JsArray<PerformanceEntry> getEntriesByType(String entryType);
public native PerformanceMark mark(String markName,PerformanceMarkOptions markOptions);
public native PerformanceMark mark(String markName);
public native PerformanceMeasure measure(String measureName,Performance.MeasureStartOrMeasureOptionsUnionType startOrMeasureOptions,String endMark);
public native PerformanceMeasure measure(String measureName,Performance.MeasureStartOrMeasureOptionsUnionType startOrMeasureOptions);
@JsOverlay
public final PerformanceMeasure measure(String measureName,PerformanceMeasureOptions startOrMeasureOptions,String endMark){
return measure(measureName,Js.<Performance.MeasureStartOrMeasureOptionsUnionType>uncheckedCast(startOrMeasureOptions),endMark);
}
@JsOverlay
public final PerformanceMeasure measure(String measureName,PerformanceMeasureOptions startOrMeasureOptions){
return measure(measureName,Js.<Performance.MeasureStartOrMeasureOptionsUnionType>uncheckedCast(startOrMeasureOptions));
}
@JsOverlay
public final PerformanceMeasure measure(String measureName,String startOrMeasureOptions,String endMark){
return measure(measureName,Js.<Performance.MeasureStartOrMeasureOptionsUnionType>uncheckedCast(startOrMeasureOptions),endMark);
}
@JsOverlay
public final PerformanceMeasure measure(String measureName,String startOrMeasureOptions){
return measure(measureName,Js.<Performance.MeasureStartOrMeasureOptionsUnionType>uncheckedCast(startOrMeasureOptions));
}
public native PerformanceMeasure measure(String measureName);
public native double now();
public native void setResourceTimingBufferSize(int maxSize);
}
