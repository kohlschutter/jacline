package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.InputDeviceCapabilities;
import elemental2.dom.Window;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.dom.UIEventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class UIEvent extends Event{
public int detail;
public @Nullable InputDeviceCapabilities sourceCapabilities;
public UIEvent(String type,@Nullable UIEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public UIEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public native void initUIEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg,int detailArg);
}
