package elemental2.dom;
import elemental2.dom.Element;
import elemental2.dom.HTMLFormElement;
import elemental2.dom.ElementInternals;
import elemental2.dom.ShadowRoot;
import elemental2.dom.File;
import elemental2.dom.Document;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import elemental2.dom.ShadowRootInit;
import jsinterop.annotations.JsFunction;
import elemental2.dom.CSSStyleDeclaration;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.NodeList;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLElement extends Element{
@JsFunction
public interface AttachedCallbackFn{
Object onInvoke();
}
@JsFunction
public interface ConnectedCallbackFn{
Object onInvoke();
}
@JsFunction
public interface CreatedCallbackFn{
Object onInvoke();
}
@JsFunction
public interface DetachedCallbackFn{
Object onInvoke();
}
@JsFunction
public interface DisconnectedCallbackFn{
Object onInvoke();
}
@JsFunction
public interface FormResetCallbackFn{
Object onInvoke();
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FormStateRestoreCallbackStateArrayArrayUnionType{
@JsOverlay
static HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default File asFile(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isFile(){
return (Object)this instanceof File;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FormStateRestoreCallbackStateUnionType{
@JsOverlay
static HTMLElement.FormStateRestoreCallbackStateUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default File asFile(){
return Js.cast(this);
}
@JsOverlay
default JsArray<JsArray<HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType>> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isFile(){
return (Object)this instanceof File;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public static boolean formAssociated;
public static JsArray<String> observedAttributes;
public HTMLElement.AttachedCallbackFn attachedCallback;
public String className;
public HTMLElement.ConnectedCallbackFn connectedCallback;
public Element contextMenu;
public HTMLElement.CreatedCallbackFn createdCallback;
public JsPropertyMap<String> dataset;
public HTMLElement.DetachedCallbackFn detachedCallback;
public String dir;
public HTMLElement.DisconnectedCallbackFn disconnectedCallback;
public boolean draggable;
public JsObject dropzone;
public HTMLElement.FormResetCallbackFn formResetCallback;
public boolean hidden;
public boolean inert;
public String lang;
public String nonce;
public int offsetHeight;
public int offsetLeft;
public Element offsetParent;
public int offsetTop;
public int offsetWidth;
public ShadowRoot shadowRoot;
public boolean spellcheck;
public CSSStyleDeclaration style;
public int tabIndex;
public String title;
public native Object adoptedCallback(Document oldDocument,Document newDocument);
public native ElementInternals attachInternals();
public native ShadowRoot attachShadow(ShadowRootInit options);
public native Object attributeChangedCallback(String attributeName,String oldValue,String newValue,String namespace);
public native void click();
public native ShadowRoot createShadowRoot();
public native Object formAssociatedCallback(HTMLFormElement form);
public native Object formDisabledCallback(boolean disabled);
@JsOverlay
public final Object formStateRestoreCallback(File state,String reason){
return formStateRestoreCallback(Js.<HTMLElement.FormStateRestoreCallbackStateUnionType>uncheckedCast(state),reason);
}
@JsOverlay
public final Object formStateRestoreCallback(HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType[][] state,String reason){
return formStateRestoreCallback(Js.<JsArray<JsArray<HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType>>>uncheckedCast(state),reason);
}
public native Object formStateRestoreCallback(HTMLElement.FormStateRestoreCallbackStateUnionType state,String reason);
@JsOverlay
public final Object formStateRestoreCallback(JsArray<JsArray<HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType>> state,String reason){
return formStateRestoreCallback(Js.<HTMLElement.FormStateRestoreCallbackStateUnionType>uncheckedCast(state),reason);
}
@JsOverlay
public final Object formStateRestoreCallback(String state,String reason){
return formStateRestoreCallback(Js.<HTMLElement.FormStateRestoreCallbackStateUnionType>uncheckedCast(state),reason);
}
public native NodeList<Node> getDestinationInsertionPoints();
public native ShadowRoot webkitCreateShadowRoot();
}
