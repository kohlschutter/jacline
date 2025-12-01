package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.MouseEventInit;
import elemental2.dom.PointerEventInit;
import elemental2.dom.MouseEvent;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PointerEvent extends MouseEvent{
public String MSPOINTER_TYPE_MOUSE;
public String MSPOINTER_TYPE_PEN;
public String MSPOINTER_TYPE_TOUCH;
public double height;
public boolean isPrimary;
public int pointerId;
public String pointerType;
public double pressure;
public int tiltX;
public int tiltY;
public double width;
public PointerEvent(String type,@Nullable PointerEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable MouseEventInit)null);
}
public PointerEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable MouseEventInit)null);
}
public native JsArray<PointerEvent> getCoalescedEvents();
}
