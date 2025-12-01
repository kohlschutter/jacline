package elemental2.dom;
import jsinterop.base.Js;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DocumentType extends Node{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AfterNodesUnionType{
@JsOverlay
static DocumentType.AfterNodesUnionType of(Object o){
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
public interface BeforeNodesUnionType{
@JsOverlay
static DocumentType.BeforeNodesUnionType of(Object o){
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
public interface ReplaceWithNodesUnionType{
@JsOverlay
static DocumentType.ReplaceWithNodesUnionType of(Object o){
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
public String name;
public String publicId;
public String systemId;
public native void after();
public native void after(DocumentType.AfterNodesUnionType... nodes);
@JsOverlay
public final void after(Node... nodes){
after(Js.<DocumentType.AfterNodesUnionType[]>uncheckedCast(nodes));
}
@JsOverlay
public final void after(String... nodes){
after(Js.<DocumentType.AfterNodesUnionType[]>uncheckedCast(nodes));
}
public native void before();
public native void before(DocumentType.BeforeNodesUnionType... nodes);
@JsOverlay
public final void before(Node... nodes){
before(Js.<DocumentType.BeforeNodesUnionType[]>uncheckedCast(nodes));
}
@JsOverlay
public final void before(String... nodes){
before(Js.<DocumentType.BeforeNodesUnionType[]>uncheckedCast(nodes));
}
public native void remove();
public native void replaceWith();
@JsOverlay
public final void replaceWith(Node... nodes){
replaceWith(Js.<DocumentType.ReplaceWithNodesUnionType[]>uncheckedCast(nodes));
}
public native void replaceWith(DocumentType.ReplaceWithNodesUnionType... nodes);
@JsOverlay
public final void replaceWith(String... nodes){
replaceWith(Js.<DocumentType.ReplaceWithNodesUnionType[]>uncheckedCast(nodes));
}
}
