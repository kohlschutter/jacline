package elemental2.dom;
import elemental2.dom.Element;
import jsinterop.base.Js;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MouseEvent;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLDialogElement extends HTMLElement{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ShowAnchorUnionType{
@JsOverlay
static HTMLDialogElement.ShowAnchorUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Element asElement(){
return Js.cast(this);
}
@JsOverlay
default MouseEvent asMouseEvent(){
return Js.cast(this);
}
@JsOverlay
default boolean isElement(){
return (Object)this instanceof Element;
}
@JsOverlay
default boolean isMouseEvent(){
return (Object)this instanceof MouseEvent;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ShowModalAnchorUnionType{
@JsOverlay
static HTMLDialogElement.ShowModalAnchorUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Element asElement(){
return Js.cast(this);
}
@JsOverlay
default MouseEvent asMouseEvent(){
return Js.cast(this);
}
@JsOverlay
default boolean isElement(){
return (Object)this instanceof Element;
}
@JsOverlay
default boolean isMouseEvent(){
return (Object)this instanceof MouseEvent;
}
}
public boolean open;
public String returnValue;
public native void close();
public native void close(String returnValue);
public native void show();
@JsOverlay
public final void show(Element anchor){
show(Js.<HTMLDialogElement.ShowAnchorUnionType>uncheckedCast(anchor));
}
@JsOverlay
public final void show(MouseEvent anchor){
show(Js.<HTMLDialogElement.ShowAnchorUnionType>uncheckedCast(anchor));
}
public native void show(HTMLDialogElement.ShowAnchorUnionType anchor);
public native void showModal();
@JsOverlay
public final void showModal(Element anchor){
showModal(Js.<HTMLDialogElement.ShowModalAnchorUnionType>uncheckedCast(anchor));
}
@JsOverlay
public final void showModal(MouseEvent anchor){
showModal(Js.<HTMLDialogElement.ShowModalAnchorUnionType>uncheckedCast(anchor));
}
public native void showModal(HTMLDialogElement.ShowModalAnchorUnionType anchor);
}
