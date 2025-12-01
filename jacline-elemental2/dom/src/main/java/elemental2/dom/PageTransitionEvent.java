package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PageTransitionEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PageTransitionEventEventInitDictType{
@JsOverlay
static PageTransitionEvent.PageTransitionEventEventInitDictType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isPersisted();
@JsProperty
void setPersisted(boolean persisted);
}
public boolean persisted;
public PageTransitionEvent(String type,PageTransitionEvent.PageTransitionEventEventInitDictType eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public PageTransitionEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public native void initPageTransitionEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Object persistedArg);
}
