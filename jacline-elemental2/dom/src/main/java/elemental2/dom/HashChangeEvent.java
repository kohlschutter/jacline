package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HashChangeEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface HashChangeEventEventInitDictType{
@JsOverlay
static HashChangeEvent.HashChangeEventEventInitDictType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getNewURL();
@JsProperty
String getOldURL();
@JsProperty
void setNewURL(String newURL);
@JsProperty
void setOldURL(String oldURL);
}
public String newURL;
public String oldURL;
public HashChangeEvent(String type,HashChangeEvent.HashChangeEventEventInitDictType eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public HashChangeEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public native void initHashChangeEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,String oldURLArg,String newURLArg);
}
