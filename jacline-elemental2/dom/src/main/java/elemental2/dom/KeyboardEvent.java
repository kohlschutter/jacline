package elemental2.dom;
import elemental2.dom.KeyboardEventInit;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Window;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.dom.UIEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class KeyboardEvent extends UIEvent{
public static int DOM_KEY_LOCATION_LEFT;
public static int DOM_KEY_LOCATION_NUMPAD;
public static int DOM_KEY_LOCATION_RIGHT;
public static int DOM_KEY_LOCATION_STANDARD;
public boolean altKey;
@JsProperty(name = "char")
public String char_;
public String code;
public boolean ctrlKey;
public String key;
public String keyIdentifier;
public String locale;
public int location;
public boolean metaKey;
public boolean repeat;
public boolean shiftKey;
public KeyboardEvent(String type,@Nullable KeyboardEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable UIEventInit)null);
}
public KeyboardEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable UIEventInit)null);
}
public native boolean getModifierState(String keyIdentifierArg);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg,String keyArg,int locationArg,boolean ctrlKey,boolean altKey,boolean shiftKey,boolean metaKey);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg,String keyArg,int locationArg,boolean ctrlKey,boolean altKey,boolean shiftKey);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg,String keyArg,int locationArg,boolean ctrlKey,boolean altKey);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg,String keyArg,int locationArg,boolean ctrlKey);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg,String keyArg,int locationArg);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg,String keyArg);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Window viewArg);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg);
public native void initKeyboardEvent(String typeArg,boolean canBubbleArg);
public native void initKeyboardEvent(String typeArg);
}
