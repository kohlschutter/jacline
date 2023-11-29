package elemental2.dom;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MouseEventInit;
import elemental2.dom.WheelEventInit;
import elemental2.dom.MouseEvent;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WheelEvent extends MouseEvent{
@JsOverlay
public static final int DOM_DELTA_LINE=WheelEvent__Constants.DOM_DELTA_LINE;
@JsOverlay
public static final int DOM_DELTA_PAGE=WheelEvent__Constants.DOM_DELTA_PAGE;
@JsOverlay
public static final int DOM_DELTA_PIXEL=WheelEvent__Constants.DOM_DELTA_PIXEL;
public int deltaMode;
public double deltaX;
public double deltaY;
public double deltaZ;
public WheelEvent(String type,WheelEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(MouseEventInit)null);
}
public WheelEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(MouseEventInit)null);
}
}
