package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RelatedEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RelatedEventEventInitDictType{
@JsOverlay
static RelatedEvent.RelatedEventEventInitDictType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable EventTarget getRelatedTarget();
@JsProperty
void setRelatedTarget(@Nullable EventTarget relatedTarget);
}
public @Nullable EventTarget relatedTarget;
public RelatedEvent(String type,RelatedEvent.RelatedEventEventInitDictType eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public RelatedEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
