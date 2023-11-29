package elemental2.dom;
import jsinterop.base.Js;
import elemental2.dom.TextTrackCue;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.VTTRegion;
import elemental2.dom.DocumentFragment;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class VTTCue extends TextTrackCue{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface LineUnionType{
@JsOverlay
static VTTCue.LineUnionType of(Object o){
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
public interface PositionUnionType{
@JsOverlay
static VTTCue.PositionUnionType of(Object o){
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
public String align;
public VTTCue.LineUnionType line;
public String lineAlign;
public VTTCue.PositionUnionType position;
public String positionAlign;
public VTTRegion region;
public int size;
public boolean snapToLines;
public String text;
public String vertical;
public VTTCue(double startTime,double endTime,String text){
// This super call is here only for the code to compile; it is never executed.
super(0,0,(String)null);
}
public native DocumentFragment getCueAsHTML();
}
