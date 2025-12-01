package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DragEventInit;
import elemental2.dom.MouseEventInit;
import elemental2.dom.MouseEvent;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DataTransfer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DragEvent extends MouseEvent{
public @Nullable DataTransfer dataTransfer;
public DragEvent(String type,@Nullable DragEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable MouseEventInit)null);
}
public DragEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable MouseEventInit)null);
}
}
