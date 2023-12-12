package elemental2.media;
import jsinterop.base.Js;
import java.lang.Double;
import java.lang.Deprecated;
import elemental2.media.AudioGain;
import jsinterop.annotations.JsOverlay;
import elemental2.media.AudioNode;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@Deprecated
public class AudioPannerNode extends AudioNode{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DistanceModelUnionType{
@JsOverlay
static AudioPannerNode.DistanceModelUnionType of(Object o){
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
public interface PanningModelUnionType{
@JsOverlay
static AudioPannerNode.PanningModelUnionType of(Object o){
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
@Deprecated
public double EQUALPOWER;
@Deprecated
public double EXPONENTIAL_DISTANCE;
@Deprecated
public double HRTF;
@Deprecated
public double INVERSE_DISTANCE;
@Deprecated
public double LINEAR_DISTANCE;
@Deprecated
public double SOUNDFIELD;
@Deprecated
public AudioGain coneGain;
@Deprecated
public double coneInnerAngle;
@Deprecated
public double coneOuterAngle;
@Deprecated
public double coneOuterGain;
@Deprecated
public AudioGain distanceGain;
@Deprecated
public AudioPannerNode.DistanceModelUnionType distanceModel;
@Deprecated
public double maxDistance;
@Deprecated
public AudioPannerNode.PanningModelUnionType panningModel;
@Deprecated
public double refDistance;
@Deprecated
public double rolloffFactor;
@Deprecated
public native void setOrientation(double x,double y,double z);
@Deprecated
public native void setPosition(double x,double y,double z);
@Deprecated
public native void setVelocity(double x,double y,double z);
}
