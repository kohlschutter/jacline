package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.UIEventInit;
import elemental2.dom.DataTransfer;
import elemental2.core.JsArray;
import elemental2.dom.InputEventInit;
import elemental2.dom.UIEvent;
import elemental2.dom.StaticRange;
import jsinterop.annotations.JsFunction;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class InputEvent extends UIEvent{
@JsFunction
public interface GetTargetRangesFn{
JsArray<StaticRange> onInvoke();
}
public String data;
public @Nullable DataTransfer dataTransfer;
public InputEvent.GetTargetRangesFn getTargetRanges;
public String inputType;
public boolean isComposed;
public InputEvent(String type,@Nullable InputEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable UIEventInit)null);
}
public InputEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable UIEventInit)null);
}
}
