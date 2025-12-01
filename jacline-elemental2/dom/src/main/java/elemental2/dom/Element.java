package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.TouchEvent;
import elemental2.dom.DOMTokenList;
import java.lang.Double;
import elemental2.dom.HTMLCollection;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.PointerLockOptions;
import elemental2.dom.Event;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.dom.ClientRectList;
import java.lang.Boolean;
import elemental2.dom.NodeList;
import java.lang.String;
import elemental2.dom.DOMRect;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ScrollToOptions;
import elemental2.dom.GetHTMLOptions;
import elemental2.dom.Attr;
import elemental2.dom.ScrollIntoViewOptions;
import java.lang.Void;
import elemental2.dom.TrustedHTML;
import elemental2.core.TrustedScript;
import elemental2.core.JsArray;
import elemental2.dom.StylePropertyMapReadOnly;
import elemental2.dom.CheckVisibilityOptions;
import elemental2.dom.FullscreenOptions;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.dom.NamedNodeMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Element extends Node{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AfterNodesUnionType{
@JsOverlay
static Element.AfterNodesUnionType of(Object o){
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
public interface AppendNodesUnionType{
@JsOverlay
static Element.AppendNodesUnionType of(Object o){
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
static Element.BeforeNodesUnionType of(Object o){
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
public interface FocusOptionsType{
@JsOverlay
static Element.FocusOptionsType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isPreventScroll();
@JsProperty
void setPreventScroll(boolean preventScroll);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface MatchesSelectorRefNodesUnionType{
@JsOverlay
static Element.@Nullable MatchesSelectorRefNodesUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable Node asNode(){
return Js.cast(this);
}
@JsOverlay
default @Nullable NodeList<@Nullable Object> asNodeList(){
return Js.cast(this);
}
@JsOverlay
default boolean isNode(){
return (Object)this instanceof Node;
}
@JsOverlay
default boolean isNodeList(){
return (Object)this instanceof NodeList;
}
}
@JsFunction
public interface OnabortFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnbeforeinputFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnbeforeunloadFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnblurFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnchangeFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnclickFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncompositionendFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncompositionstartFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncompositionupdateFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncontextlostFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OncontextmenuFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncontextrestoredFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OncopyFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncutFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OndblclickFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnerrorFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnfocusFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnfocusinFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnfocusoutFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OninputFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnkeydownFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnkeypressFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnkeyupFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnloadFn{
void onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmousedownFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmousemoveFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmouseoutFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmouseoverFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmouseupFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmousewheelFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnpasteFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnresetFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnresizeFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnscrollFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnselectFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnselectionchangeFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnselectstartFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnsubmitFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OntextinputFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OntouchcancelFn{
@Nullable Object onInvoke(TouchEvent p0);
}
@JsFunction
public interface OntouchendFn{
@Nullable Object onInvoke(TouchEvent p0);
}
@JsFunction
public interface OntouchmoveFn{
@Nullable Object onInvoke(TouchEvent p0);
}
@JsFunction
public interface OntouchstartFn{
@Nullable Object onInvoke(TouchEvent p0);
}
@JsFunction
public interface OnunloadFn{
void onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnwheelFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PrependNodesUnionType{
@JsOverlay
static Element.PrependNodesUnionType of(Object o){
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
static Element.ReplaceChildrenNodesUnionType of(Object o){
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
static Element.ReplaceWithNodesUnionType of(Object o){
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
public interface ScrollIntoViewTopUnionType{
@JsOverlay
static Element.@Nullable ScrollIntoViewTopUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default @Nullable ScrollIntoViewOptions asScrollIntoViewOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ScrollToScrollToOptionsOrXUnionType{
@JsOverlay
static Element.ScrollToScrollToOptionsOrXUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default ScrollToOptions asScrollToOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetAttributeNSValueUnionType{
@JsOverlay
static Element.SetAttributeNSValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
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
default boolean isBoolean(){
return (Object)this instanceof Boolean;
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
public interface SetAttributeValueUnionType{
@JsOverlay
static Element.SetAttributeValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
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
default TrustedHTML asTrustedHTML(){
return Js.cast(this);
}
@JsOverlay
default TrustedScript asTrustedScript(){
return Js.cast(this);
}
@JsOverlay
default TrustedScriptURL asTrustedScriptURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedHTML(){
return (Object)this instanceof TrustedHTML;
}
@JsOverlay
default boolean isTrustedScript(){
return (Object)this instanceof TrustedScript;
}
@JsOverlay
default boolean isTrustedScriptURL(){
return (Object)this instanceof TrustedScriptURL;
}
}
@JsOverlay
public static final int ALLOW_KEYBOARD_INPUT=Element__Constants.ALLOW_KEYBOARD_INPUT;
public NamedNodeMap<Attr> attributes;
public int childElementCount;
public DOMTokenList classList;
public @Nullable Object className;
public int clientHeight;
public int clientLeft;
public int clientTop;
public int clientWidth;
public @Nullable Element firstElementChild;
public String id;
public String innerHTML;
public @Nullable Element lastElementChild;
public @Nullable Element nextElementSibling;
public Element.@Nullable OnabortFn onabort;
public Element.@Nullable OnbeforeinputFn onbeforeinput;
public Element.@Nullable OnbeforeunloadFn onbeforeunload;
public Element.@Nullable OnblurFn onblur;
public Element.@Nullable OnchangeFn onchange;
public Element.@Nullable OnclickFn onclick;
public Element.@Nullable OncompositionendFn oncompositionend;
public Element.@Nullable OncompositionstartFn oncompositionstart;
public Element.@Nullable OncompositionupdateFn oncompositionupdate;
public Element.@Nullable OncontextlostFn oncontextlost;
public Element.@Nullable OncontextmenuFn oncontextmenu;
public Element.@Nullable OncontextrestoredFn oncontextrestored;
public Element.@Nullable OncopyFn oncopy;
public Element.@Nullable OncutFn oncut;
public Element.@Nullable OndblclickFn ondblclick;
public Element.@Nullable OnerrorFn onerror;
public Element.@Nullable OnfocusFn onfocus;
public Element.@Nullable OnfocusinFn onfocusin;
public Element.@Nullable OnfocusoutFn onfocusout;
public Element.@Nullable OninputFn oninput;
public Element.@Nullable OnkeydownFn onkeydown;
public Element.@Nullable OnkeypressFn onkeypress;
public Element.@Nullable OnkeyupFn onkeyup;
public Element.@Nullable OnloadFn onload;
public Element.@Nullable OnmousedownFn onmousedown;
public Element.@Nullable OnmousemoveFn onmousemove;
public Element.@Nullable OnmouseoutFn onmouseout;
public Element.@Nullable OnmouseoverFn onmouseover;
public Element.@Nullable OnmouseupFn onmouseup;
public Element.@Nullable OnmousewheelFn onmousewheel;
public Element.@Nullable OnpasteFn onpaste;
public Element.@Nullable OnresetFn onreset;
public Element.@Nullable OnresizeFn onresize;
public Element.@Nullable OnscrollFn onscroll;
public Element.@Nullable OnselectFn onselect;
public Element.@Nullable OnselectionchangeFn onselectionchange;
public Element.@Nullable OnselectstartFn onselectstart;
public Element.@Nullable OnsubmitFn onsubmit;
public Element.@Nullable OntextinputFn ontextinput;
public Element.@Nullable OntouchcancelFn ontouchcancel;
public Element.@Nullable OntouchendFn ontouchend;
public Element.@Nullable OntouchmoveFn ontouchmove;
public Element.@Nullable OntouchstartFn ontouchstart;
public Element.@Nullable OnunloadFn onunload;
public Element.@Nullable OnwheelFn onwheel;
public String outerHTML;
public DOMTokenList part;
public @Nullable Element previousElementSibling;
public int scrollHeight;
public double scrollLeft;
public String scrollPadding;
public String scrollPaddingBlock;
public String scrollPaddingBlockEnd;
public String scrollPaddingBlockStart;
public String scrollPaddingBottom;
public String scrollPaddingInline;
public String scrollPaddingInlineEnd;
public String scrollPaddingInlineStart;
public String scrollPaddingLeft;
public String scrollPaddingRight;
public String scrollPaddingTop;
public double scrollTop;
public int scrollWidth;
public String slot;
public String tagName;
public native void after();
public native void after(Element.AfterNodesUnionType... nodes);
@JsOverlay
public final void after(Node... nodes){
after(Js.<Element.AfterNodesUnionType[]>uncheckedCast(nodes));
}
@JsOverlay
public final void after(String... nodes){
after(Js.<Element.AfterNodesUnionType[]>uncheckedCast(nodes));
}
public native void append();
public native void append(Element.AppendNodesUnionType... nodes);
@JsOverlay
public final void append(Node... nodes){
append(Js.<Element.AppendNodesUnionType[]>uncheckedCast(nodes));
}
@JsOverlay
public final void append(String... nodes){
append(Js.<Element.AppendNodesUnionType[]>uncheckedCast(nodes));
}
public native void before();
public native void before(Element.BeforeNodesUnionType... nodes);
@JsOverlay
public final void before(Node... nodes){
before(Js.<Element.BeforeNodesUnionType[]>uncheckedCast(nodes));
}
@JsOverlay
public final void before(String... nodes){
before(Js.<Element.BeforeNodesUnionType[]>uncheckedCast(nodes));
}
public native void blur();
public native boolean checkVisibility();
public native boolean checkVisibility(@Nullable CheckVisibilityOptions options);
public native @Nullable Element closest(String selectors);
public native StylePropertyMapReadOnly computedStyleMap();
public native void focus();
public native void focus(Element.FocusOptionsType options);
public native String getAttribute(String name,@Nullable Double flags);
public native String getAttribute(String name);
public native String getAttributeNS(@Nullable String namespaceURI,String localName);
public native JsArray<String> getAttributeNames();
public native @Nullable Attr getAttributeNode(String name);
public native @Nullable Attr getAttributeNodeNS(@Nullable String namespaceURI,String localName);
public native DOMRect getBoundingClientRect();
public native ClientRectList getClientRects();
public native HTMLCollection<Element> getElementsByClassName(String classNames);
public native NodeList<Element> getElementsByTagName(String tagname);
public native NodeList<Element> getElementsByTagNameNS(@Nullable String namespaceURI,String localName);
public native String getHTML();
public native String getHTML(GetHTMLOptions options);
public native boolean hasAttribute(String name);
public native boolean hasAttributeNS(@Nullable String namespaceURI,String localName);
public native boolean hasPointerCapture(int pointerId);
public native Element insertAdjacentElement(String where,@Nullable Element element);
public native void insertAdjacentText(String where,String data);
public native boolean matches(String selectors);
public native boolean matchesSelector(String selectors,Element.@Nullable MatchesSelectorRefNodesUnionType refNodes);
@JsOverlay
public final boolean matchesSelector(String selectors,Node refNodes){
return matchesSelector(selectors,Js.<Element.@Nullable MatchesSelectorRefNodesUnionType>uncheckedCast(refNodes));
}
@JsOverlay
public final boolean matchesSelector(String selectors,NodeList<@Nullable Object> refNodes){
return matchesSelector(selectors,Js.<Element.@Nullable MatchesSelectorRefNodesUnionType>uncheckedCast(refNodes));
}
public native boolean matchesSelector(String selectors);
public native boolean mozMatchesSelector(String selectors);
public native @Nullable Object mozRequestFullScreen();
public native @Nullable Object mozRequestFullScreenWithKeys();
public native boolean msMatchesSelector(String selectors);
public native void msRequestFullscreen();
public native boolean oMatchesSelector(String selectors);
public native void prepend();
@JsOverlay
public final void prepend(Node... nodes){
prepend(Js.<Element.PrependNodesUnionType[]>uncheckedCast(nodes));
}
public native void prepend(Element.PrependNodesUnionType... nodes);
@JsOverlay
public final void prepend(String... nodes){
prepend(Js.<Element.PrependNodesUnionType[]>uncheckedCast(nodes));
}
public native @Nullable Element querySelector(String selectors);
public native NodeList<Element> querySelectorAll(String selectors);
public native @Nullable Object releasePointerCapture(int pointerId);
public native void remove();
public native void removeAttribute(String name);
public native void removeAttributeNS(@Nullable String namespaceURI,String localName);
public native @Nullable Attr removeAttributeNode(@Nullable Attr oldAttr);
public native void replaceChildren();
@JsOverlay
public final void replaceChildren(Node... nodes){
replaceChildren(Js.<Element.ReplaceChildrenNodesUnionType[]>uncheckedCast(nodes));
}
public native void replaceChildren(Element.ReplaceChildrenNodesUnionType... nodes);
@JsOverlay
public final void replaceChildren(String... nodes){
replaceChildren(Js.<Element.ReplaceChildrenNodesUnionType[]>uncheckedCast(nodes));
}
public native void replaceWith();
@JsOverlay
public final void replaceWith(Node... nodes){
replaceWith(Js.<Element.ReplaceWithNodesUnionType[]>uncheckedCast(nodes));
}
public native void replaceWith(Element.ReplaceWithNodesUnionType... nodes);
@JsOverlay
public final void replaceWith(String... nodes){
replaceWith(Js.<Element.ReplaceWithNodesUnionType[]>uncheckedCast(nodes));
}
public native Promise<Void> requestFullscreen();
public native Promise<Void> requestFullscreen(FullscreenOptions options);
public native Promise<Void> requestPointerLock();
public native Promise<Void> requestPointerLock(PointerLockOptions options);
public native void scrollIntoView();
@JsOverlay
public final void scrollIntoView(ScrollIntoViewOptions top){
scrollIntoView(Js.<Element.@Nullable ScrollIntoViewTopUnionType>uncheckedCast(top));
}
public native void scrollIntoView(Element.@Nullable ScrollIntoViewTopUnionType top);
@JsOverlay
public final void scrollIntoView(boolean top){
scrollIntoView(Js.<Element.@Nullable ScrollIntoViewTopUnionType>uncheckedCast(top));
}
@JsOverlay
public final void scrollTo(ScrollToOptions scrollToOptionsOrX,double y){
scrollTo(Js.<Element.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scrollTo(ScrollToOptions scrollToOptionsOrX){
scrollTo(Js.<Element.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
public native void scrollTo(Element.ScrollToScrollToOptionsOrXUnionType scrollToOptionsOrX,double y);
public native void scrollTo(Element.ScrollToScrollToOptionsOrXUnionType scrollToOptionsOrX);
@JsOverlay
public final void scrollTo(double scrollToOptionsOrX,double y){
scrollTo(Js.<Element.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scrollTo(double scrollToOptionsOrX){
scrollTo(Js.<Element.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
public native void setAttribute(String name,Element.SetAttributeValueUnionType value);
@JsOverlay
public final void setAttribute(String name,String value){
setAttribute(name,Js.<Element.SetAttributeValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void setAttribute(String name,TrustedHTML value){
setAttribute(name,Js.<Element.SetAttributeValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void setAttribute(String name,TrustedScript value){
setAttribute(name,Js.<Element.SetAttributeValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void setAttribute(String name,TrustedScriptURL value){
setAttribute(name,Js.<Element.SetAttributeValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void setAttribute(String name,boolean value){
setAttribute(name,Js.<Element.SetAttributeValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void setAttribute(String name,double value){
setAttribute(name,Js.<Element.SetAttributeValueUnionType>uncheckedCast(value));
}
public native void setAttributeNS(@Nullable String namespaceURI,String qualifiedName,Element.SetAttributeNSValueUnionType value);
@JsOverlay
public final void setAttributeNS(@Nullable String namespaceURI,String qualifiedName,String value){
setAttributeNS(namespaceURI,qualifiedName,Js.<Element.SetAttributeNSValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void setAttributeNS(@Nullable String namespaceURI,String qualifiedName,boolean value){
setAttributeNS(namespaceURI,qualifiedName,Js.<Element.SetAttributeNSValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void setAttributeNS(@Nullable String namespaceURI,String qualifiedName,double value){
setAttributeNS(namespaceURI,qualifiedName,Js.<Element.SetAttributeNSValueUnionType>uncheckedCast(value));
}
public native @Nullable Attr setAttributeNode(@Nullable Attr newAttr);
public native @Nullable Attr setAttributeNodeNS(@Nullable Attr newAttr);
public native @Nullable Object setPointerCapture(int pointerId);
public native boolean toggleAttribute(String name,boolean force);
public native boolean toggleAttribute(String name);
public native boolean webkitMatchesSelector(String selectors);
public native void webkitRequestFullScreen();
public native void webkitRequestFullScreen(int allowKeyboardInput);
public native void webkitRequestFullscreen();
public native void webkitRequestFullscreen(int allowKeyboardInput);
}
