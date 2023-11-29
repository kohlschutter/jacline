package elemental2.dom;
import elemental2.dom.MouseEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.dom.DataTransfer;
import elemental2.dom.UIEvent;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MouseEvent extends UIEvent{
public boolean altKey;
public int button;
public int buttons;
public double clientX;
public double clientY;
public boolean ctrlKey;
public DataTransfer dataTransfer;
public boolean metaKey;
public double offsetX;
public double offsetY;
public double pageX;
public double pageY;
public EventTarget relatedTarget;
public double screenX;
public double screenY;
public boolean shiftKey;
public double x;
public double y;
public MouseEvent(String type,MouseEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
public MouseEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
public native boolean getModifierState(String keyIdentifierArg);
}
