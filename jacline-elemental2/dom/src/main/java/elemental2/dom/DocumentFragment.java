package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DocumentFragment extends Node{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AppendNodesUnionType{
@JsOverlay
static DocumentFragment.AppendNodesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Node asNode(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isNode(){
return (Object)this instanceof Node;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PrependNodesUnionType{
@JsOverlay
static DocumentFragment.PrependNodesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Node asNode(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isNode(){
return (Object)this instanceof Node;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ReplaceChildrenNodesUnionType{
@JsOverlay
static DocumentFragment.ReplaceChildrenNodesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Node asNode(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isNode(){
return (Object)this instanceof Node;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public int childElementCount;
public @Nullable Element firstElementChild;
public @Nullable Element lastElementChild;
public native void append();
public native void append(DocumentFragment.AppendNodesUnionType... nodes);
@JsOverlay
public final void append(Node... nodes){
append(Js.<DocumentFragment.AppendNodesUnionType[]>uncheckedCast(nodes));
}
@JsOverlay
public final void append(String... nodes){
append(Js.<DocumentFragment.AppendNodesUnionType[]>uncheckedCast(nodes));
}
public native void prepend();
@JsOverlay
public final void prepend(Node... nodes){
prepend(Js.<DocumentFragment.PrependNodesUnionType[]>uncheckedCast(nodes));
}
public native void prepend(DocumentFragment.PrependNodesUnionType... nodes);
@JsOverlay
public final void prepend(String... nodes){
prepend(Js.<DocumentFragment.PrependNodesUnionType[]>uncheckedCast(nodes));
}
public native void replaceChildren();
@JsOverlay
public final void replaceChildren(Node... nodes){
replaceChildren(Js.<DocumentFragment.ReplaceChildrenNodesUnionType[]>uncheckedCast(nodes));
}
public native void replaceChildren(DocumentFragment.ReplaceChildrenNodesUnionType... nodes);
@JsOverlay
public final void replaceChildren(String... nodes){
replaceChildren(Js.<DocumentFragment.ReplaceChildrenNodesUnionType[]>uncheckedCast(nodes));
}
}
