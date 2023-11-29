package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AnimationEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AnimationEventAnimationEventInitDictType{
@JsOverlay
static AnimationEvent.AnimationEventAnimationEventInitDictType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getAnimationName();
@JsProperty
double getElapsedTime();
@JsProperty
String getPseudoElement();
@JsProperty
void setAnimationName(String animationName);
@JsProperty
void setElapsedTime(double elapsedTime);
@JsProperty
void setPseudoElement(String pseudoElement);
}
public String animationName;
public double elapsedTime;
public String pseudoElement;
public AnimationEvent(String type,AnimationEvent.AnimationEventAnimationEventInitDictType animationEventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public AnimationEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
