package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import elemental2.dom.EventListenerOptions;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import elemental2.dom.AddEventListenerOptions;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface EventTarget{
@JsFunction
public interface AddEventListenerListenerFn{
@Nullable Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddEventListenerOptionsUnionType{
@JsOverlay
static EventTarget.AddEventListenerOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default AddEventListenerOptions asAddEventListenerOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
}
@JsFunction
public interface RemoveEventListenerListenerFn{
@Nullable Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RemoveEventListenerOptionsUnionType{
@JsOverlay
static EventTarget.RemoveEventListenerOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default EventListenerOptions asEventListenerOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
}
@JsOverlay
default void addEventListener(String type,EventListener listener,AddEventListenerOptions options){
addEventListener(type,listener,Js.<EventTarget.AddEventListenerOptionsUnionType>uncheckedCast(options));
}
void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
@JsOverlay
default void addEventListener(String type,EventListener listener,boolean options){
addEventListener(type,listener,Js.<EventTarget.AddEventListenerOptionsUnionType>uncheckedCast(options));
}
void addEventListener(String type,EventListener listener);
boolean dispatchEvent(Event evt);
@JsOverlay
default void removeEventListener(String type,EventListener listener,EventListenerOptions options){
removeEventListener(type,listener,Js.<EventTarget.RemoveEventListenerOptionsUnionType>uncheckedCast(options));
}
void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
@JsOverlay
default void removeEventListener(String type,EventListener listener,boolean options){
removeEventListener(type,listener,Js.<EventTarget.RemoveEventListenerOptionsUnionType>uncheckedCast(options));
}
void removeEventListener(String type,EventListener listener);
}
