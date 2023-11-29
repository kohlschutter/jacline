package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.dom.DataTransfer;
import elemental2.dom.InputEventInit;
import elemental2.dom.UIEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class InputEvent extends UIEvent{
public String data;
public DataTransfer dataTransfer;
public String inputType;
public boolean isComposed;
public InputEvent(String type,InputEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
public InputEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
}
