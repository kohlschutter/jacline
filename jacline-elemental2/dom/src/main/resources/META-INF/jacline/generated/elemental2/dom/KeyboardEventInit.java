package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.EventModifierInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface KeyboardEventInit extends EventModifierInit{
@JsOverlay
static KeyboardEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getChar();
@JsProperty
String getCode();
@JsProperty
String getKey();
@JsProperty
String getLocale();
@JsProperty
int getLocation();
@JsProperty
boolean isIsComposing();
@JsProperty
boolean isRepeat();
@JsProperty
void setChar(String char_);
@JsProperty
void setCode(String code);
@JsProperty
void setIsComposing(boolean isComposing);
@JsProperty
void setKey(String key);
@JsProperty
void setLocale(String locale);
@JsProperty
void setLocation(int location);
@JsProperty
void setRepeat(boolean repeat);
}
