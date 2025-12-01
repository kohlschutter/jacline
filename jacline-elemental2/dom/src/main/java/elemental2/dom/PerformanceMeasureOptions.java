package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PerformanceMeasureOptions{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetEndUnionType{
@JsOverlay
static PerformanceMeasureOptions.GetEndUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetStartUnionType{
@JsOverlay
static PerformanceMeasureOptions.GetStartUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsOverlay
static PerformanceMeasureOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable JsObject getDetail();
@JsProperty
double getDuration();
@JsProperty
PerformanceMeasureOptions.GetEndUnionType getEnd();
@JsProperty
PerformanceMeasureOptions.GetStartUnionType getStart();
@JsProperty
void setDetail(@Nullable JsObject detail);
@JsOverlay
default void setDetail(@Nullable Object detail){
setDetail(Js.<@Nullable JsObject>uncheckedCast(detail));
}
@JsProperty
void setDuration(double duration);
@JsProperty
void setEnd(PerformanceMeasureOptions.GetEndUnionType end);
@JsOverlay
default void setEnd(String end){
setEnd(Js.<PerformanceMeasureOptions.GetEndUnionType>uncheckedCast(end));
}
@JsOverlay
default void setEnd(double end){
setEnd(Js.<PerformanceMeasureOptions.GetEndUnionType>uncheckedCast(end));
}
@JsProperty
void setStart(PerformanceMeasureOptions.GetStartUnionType start);
@JsOverlay
default void setStart(String start){
setStart(Js.<PerformanceMeasureOptions.GetStartUnionType>uncheckedCast(start));
}
@JsOverlay
default void setStart(double start){
setStart(Js.<PerformanceMeasureOptions.GetStartUnionType>uncheckedCast(start));
}
}
