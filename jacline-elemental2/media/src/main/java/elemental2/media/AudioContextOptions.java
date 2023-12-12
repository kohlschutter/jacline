package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AudioContextOptions{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetLatencyHintUnionType{
@JsOverlay
static AudioContextOptions.GetLatencyHintUnionType of(Object o){
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
static AudioContextOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
AudioContextOptions.GetLatencyHintUnionType getLatencyHint();
@JsProperty
double getSampleRate();
@JsProperty
void setLatencyHint(AudioContextOptions.GetLatencyHintUnionType latencyHint);
@JsOverlay
default void setLatencyHint(String latencyHint){
setLatencyHint(Js.<AudioContextOptions.GetLatencyHintUnionType>uncheckedCast(latencyHint));
}
@JsOverlay
default void setLatencyHint(double latencyHint){
setLatencyHint(Js.<AudioContextOptions.GetLatencyHintUnionType>uncheckedCast(latencyHint));
}
@JsProperty
void setSampleRate(double sampleRate);
}
