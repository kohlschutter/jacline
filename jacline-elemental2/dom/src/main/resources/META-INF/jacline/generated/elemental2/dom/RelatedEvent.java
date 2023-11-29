package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RelatedEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RelatedEventEventInitDictType{
@JsOverlay
static RelatedEvent.RelatedEventEventInitDictType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
EventTarget getRelatedTarget();
@JsProperty
void setRelatedTarget(EventTarget relatedTarget);
}
public EventTarget relatedTarget;
public RelatedEvent(String type,RelatedEvent.RelatedEventEventInitDictType eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public RelatedEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
