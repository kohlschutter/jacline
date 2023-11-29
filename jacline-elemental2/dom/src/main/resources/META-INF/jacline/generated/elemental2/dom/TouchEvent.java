package elemental2.dom;
import elemental2.dom.TouchEventInit;
import elemental2.dom.TouchList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.dom.UIEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TouchEvent extends UIEvent{
public boolean altKey;
public TouchList changedTouches;
public boolean ctrlKey;
public boolean metaKey;
public boolean shiftKey;
public TouchList targetTouches;
public TouchList touches;
public TouchEvent(String type,TouchEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
public TouchEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
}
