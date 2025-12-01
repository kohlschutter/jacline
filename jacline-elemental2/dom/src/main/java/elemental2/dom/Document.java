package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMImplementation;
import java.lang.Double;
import elemental2.dom.HTMLCollection;
import elemental2.promise.Promise;
import elemental2.dom.FontFaceSet;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.CaretPosition;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import elemental2.dom.HTMLHeadElement;
import jsinterop.base.Js;
import elemental2.dom.ProcessingInstruction;
import jsinterop.base.JsArrayLike;
import elemental2.dom.NodeFilter;
import elemental2.dom.Text;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Selection;
import elemental2.dom.NodeList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Attr;
import elemental2.dom.Comment;
import elemental2.dom.HTMLScriptElement;
import java.lang.Void;
import elemental2.dom.DocumentType;
import java.lang.Deprecated;
import elemental2.dom.Window;
import elemental2.dom.NodeIterator;
import elemental2.dom.TrustedHTML;
import jsinterop.base.JsConstructorFn;
import elemental2.dom.Touch;
import elemental2.core.JsArray;
import elemental2.dom.CDATASection;
import elemental2.dom.TreeWalker;
import elemental2.dom.TouchList;
import elemental2.dom.Node;
import elemental2.dom.HTMLHtmlElement;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.DocumentFragment;
import java.lang.Object;
import elemental2.dom.ViewTransition;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Document extends Node{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AppendNodesUnionType{
@JsOverlay
static Document.AppendNodesUnionType of(Object o){
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
public interface CreateElementTypeExtensionType{
@JsOverlay
static Document.CreateElementTypeExtensionType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getIs();
@JsProperty
void setIs(String is);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CreateElementTypeExtensionUnionType{
@JsOverlay
static Document.CreateElementTypeExtensionUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Document.CreateElementTypeExtensionType asCreateElementTypeExtensionType(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CreateTextNodeDataUnionType{
@JsOverlay
static Document.CreateTextNodeDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PrependNodesUnionType{
@JsOverlay
static Document.PrependNodesUnionType of(Object o){
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
public interface RegisterElementOptionsType{
@JsOverlay
static Document.RegisterElementOptionsType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getExtends();
@JsProperty
void setExtends(String extends_);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RegisterOptionsType{
@JsOverlay
static Document.RegisterOptionsType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getExtends();
@JsProperty
void setExtends(String extends_);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ReplaceChildrenNodesUnionType{
@JsOverlay
static Document.ReplaceChildrenNodesUnionType of(Object o){
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
@JsFunction
public interface StartViewTransitionUpdateCallbackFn{
Promise<Void> onInvoke();
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface WriteTextUnionType{
@JsOverlay
static Document.WriteTextUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedHTML asTrustedHTML(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedHTML(){
return (Object)this instanceof TrustedHTML;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface WritelnTextUnionType{
@JsOverlay
static Document.WritelnTextUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedHTML asTrustedHTML(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedHTML(){
return (Object)this instanceof TrustedHTML;
}
}
public @Nullable Element activeElement;
public String characterSet;
public int childElementCount;
public HTMLCollection children;
public String compatMode;
public String contentType;
public @Nullable HTMLScriptElement currentScript;
public @Nullable Window defaultView;
public String designMode;
public @Nullable DocumentType doctype;
public HTMLHtmlElement documentElement;
public String documentURI;
public @Nullable Element firstElementChild;
public FontFaceSet fonts;
public @Nullable Element fullscreenElement;
public boolean fullscreenEnabled;
public @Nullable HTMLHeadElement head;
public boolean hidden;
public @Nullable DOMImplementation implementation;
public String inputEncoding;
public @Nullable Element lastElementChild;
public boolean mozFullScreen;
public @Nullable Element mozFullScreenElement;
public boolean mozFullScreenEnabled;
public boolean mozHidden;
public String mozVisibilityState;
public @Nullable Element msFullscreenElement;
public boolean msFullscreenEnabled;
public boolean msHidden;
public String msVisibilityState;
public @Nullable Object open;
public @Nullable Element pointerLockElement;
public boolean prerendering;
public String readyState;
public @Nullable Element scrollingElement;
public String visibilityState;
public @Nullable Element webkitCurrentFullScreenElement;
public boolean webkitFullScreenKeyboardInputAllowed;
public @Nullable Element webkitFullscreenElement;
public boolean webkitFullscreenEnabled;
public boolean webkitHidden;
public boolean webkitIsFullScreen;
public String webkitVisibilityState;
public String xmlEncoding;
public boolean xmlStandalone;
public String xmlVersion;
public native @Nullable Node adoptNode(@Nullable Node externalNode);
public native void append();
public native void append(Document.AppendNodesUnionType... nodes);
@JsOverlay
public final void append(Node... nodes){
append(Js.<Document.AppendNodesUnionType[]>uncheckedCast(nodes));
}
@JsOverlay
public final void append(String... nodes){
append(Js.<Document.AppendNodesUnionType[]>uncheckedCast(nodes));
}
public native @Nullable CaretPosition caretPositionFromPoint(int x,int y);
public native void close();
public native Attr createAttribute(String name);
public native Attr createAttributeNS(@Nullable String namespaceURI,String qualifiedName);
public native CDATASection createCDATASection(String data);
public native Comment createComment(String data);
public native DocumentFragment createDocumentFragment();
@JsOverlay
public final Element createElement(String tagName,Document.CreateElementTypeExtensionType typeExtension){
return createElement(tagName,Js.<Document.CreateElementTypeExtensionUnionType>uncheckedCast(typeExtension));
}
public native Element createElement(String tagName,Document.CreateElementTypeExtensionUnionType typeExtension);
@JsOverlay
public final Element createElement(String tagName,String typeExtension){
return createElement(tagName,Js.<Document.CreateElementTypeExtensionUnionType>uncheckedCast(typeExtension));
}
public native Element createElement(String tagName);
public native Element createElementNS(@Nullable String namespaceURI,String qualifiedName,String typeExtension);
public native Element createElementNS(@Nullable String namespaceURI,String qualifiedName);
public native NodeIterator createNodeIterator(@Nullable Node root,double whatToShow,@Nullable NodeFilter filter,boolean entityReferenceExpansion);
public native NodeIterator createNodeIterator(@Nullable Node root,double whatToShow,@Nullable NodeFilter filter);
public native NodeIterator createNodeIterator(@Nullable Node root,double whatToShow);
public native NodeIterator createNodeIterator(@Nullable Node root);
public native ProcessingInstruction createProcessingInstruction(String target,String data);
public native Text createTextNode(Document.CreateTextNodeDataUnionType data);
@JsOverlay
public final Text createTextNode(String data){
return createTextNode(Js.<Document.CreateTextNodeDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Text createTextNode(double data){
return createTextNode(Js.<Document.CreateTextNodeDataUnionType>uncheckedCast(data));
}
public native @Nullable Touch createTouch(@Nullable Window view,@Nullable EventTarget target,int identifier,double pageX,double pageY,double screenX,double screenY);
public native @Nullable TouchList createTouchList(@Nullable JsArray<@Nullable Touch> touches);
@JsOverlay
public final @Nullable TouchList createTouchList(@Nullable Touch@Nullable [] touches){
return createTouchList(Js.<@Nullable JsArray<@Nullable Touch>>uncheckedCast(touches));
}
public native TreeWalker createTreeWalker(@Nullable Node root,double whatToShow,@Nullable NodeFilter filter,boolean entityReferenceExpansion);
public native TreeWalker createTreeWalker(@Nullable Node root,double whatToShow,@Nullable NodeFilter filter);
public native TreeWalker createTreeWalker(@Nullable Node root,double whatToShow);
public native TreeWalker createTreeWalker(@Nullable Node root);
public native @Nullable Element elementFromPoint(double x,double y);
public native JsArrayLike<Element> elementsFromPoint(double x,double y);
public native void exitFullscreen();
public native void exitPointerLock();
public native @Nullable Element getElementById(String s);
public native HTMLCollection<Element> getElementsByClassName(String name);
public native NodeList<Element> getElementsByTagName(String tagname);
public native NodeList<Element> getElementsByTagNameNS(String namespace,String name);
public native @Nullable Selection getSelection();
public native boolean hasFocus();
public native Node importNode(Node externalNode,boolean deep);
public native Node importNode(Node externalNode);
public native @Nullable Object mozCancelFullScreen();
public native void msExitFullscreen();
public native @Nullable Object postMessage(String message);
public native void prepend();
@JsOverlay
public final void prepend(Node... nodes){
prepend(Js.<Document.PrependNodesUnionType[]>uncheckedCast(nodes));
}
public native void prepend(Document.PrependNodesUnionType... nodes);
@JsOverlay
public final void prepend(String... nodes){
prepend(Js.<Document.PrependNodesUnionType[]>uncheckedCast(nodes));
}
public native @Nullable Element querySelector(String selectors);
public native NodeList<Element> querySelectorAll(String selectors);
@Deprecated
public native @Nullable Object register(String type,Document.RegisterOptionsType options);
@Deprecated
public native JsConstructorFn<? extends Element> registerElement(String type,Document.RegisterElementOptionsType options);
@Deprecated
public native JsConstructorFn<? extends Element> registerElement(String type);
public native void replaceChildren();
@JsOverlay
public final void replaceChildren(Node... nodes){
replaceChildren(Js.<Document.ReplaceChildrenNodesUnionType[]>uncheckedCast(nodes));
}
public native void replaceChildren(Document.ReplaceChildrenNodesUnionType... nodes);
@JsOverlay
public final void replaceChildren(String... nodes){
replaceChildren(Js.<Document.ReplaceChildrenNodesUnionType[]>uncheckedCast(nodes));
}
public native ViewTransition startViewTransition(Document.StartViewTransitionUpdateCallbackFn updateCallback);
public native @Nullable Object webkitCancelFullScreen();
@JsOverlay
public final void write(String text){
write(Js.<Document.WriteTextUnionType>uncheckedCast(text));
}
@JsOverlay
public final void write(TrustedHTML text){
write(Js.<Document.WriteTextUnionType>uncheckedCast(text));
}
public native void write(Document.WriteTextUnionType text);
@JsOverlay
public final void writeln(String text){
writeln(Js.<Document.WritelnTextUnionType>uncheckedCast(text));
}
@JsOverlay
public final void writeln(TrustedHTML text){
writeln(Js.<Document.WritelnTextUnionType>uncheckedCast(text));
}
public native void writeln(Document.WritelnTextUnionType text);
}
