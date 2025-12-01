package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import java.lang.Deprecated;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.RTCStats;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCStatsReport extends JsIterable<JsArray<RTCStatsReport.JsIterableTypeParameterArrayUnionType>, @Nullable Object, @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesJsIteratorIterableTypeParameterArrayUnionType{
@JsOverlay
static RTCStatsReport.EntriesJsIteratorIterableTypeParameterArrayUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default RTCStats asRTCStats(){
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
public interface ForEachCallbackFn{
@Nullable Object onInvoke(RTCStats p0,String p1,RTCStatsReport p2);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetTimestampUnionType{
@JsOverlay
static RTCStatsReport.@Nullable GetTimestampUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface JsIterableTypeParameterArrayUnionType{
@JsOverlay
static RTCStatsReport.JsIterableTypeParameterArrayUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default RTCStats asRTCStats(){
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
JsIteratorIterable<JsArray<RTCStatsReport.EntriesJsIteratorIterableTypeParameterArrayUnionType>, @Nullable Object, @Nullable Object> entries(String key);
<SCOPE extends @Nullable Object> @Nullable Object forEach(RTCStatsReport.ForEachCallbackFn callback,SCOPE thisObj);
@Nullable Object forEach(RTCStatsReport.ForEachCallbackFn callback);
RTCStats get(String key);
@JsProperty
String getId();
@Deprecated
@JsProperty
@Nullable RTCStatsReport getLocal();
@Deprecated
@JsProperty
@Nullable RTCStatsReport getRemote();
@JsProperty
double getSize();
@JsProperty
RTCStatsReport.@Nullable GetTimestampUnionType getTimestamp();
@JsProperty
String getType();
boolean has(String key);
JsIteratorIterable<String, @Nullable Object, @Nullable Object> keys();
JsArray<String> names();
String stat(String name);
JsIteratorIterable<RTCStats, @Nullable Object, @Nullable Object> values();
}
