package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PopStateEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PopStateEventEventInitDictType{
@JsOverlay
static PopStateEvent.PopStateEventEventInitDictType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Object getState();
@JsProperty
void setState(Object state);
}
public Object state;
public PopStateEvent(String type,PopStateEvent.PopStateEventEventInitDictType eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public PopStateEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public native void initPopStateEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,Object stateArg);
}
