package elemental2.dom;
import elemental2.dom.Element;
import elemental2.dom.HTMLFormElement;
import org.jspecify.annotations.Nullable;
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
@Nullable Object onInvoke();
}
@JsFunction
public interface ConnectedCallbackFn{
@Nullable Object onInvoke();
}
@JsFunction
public interface CreatedCallbackFn{
@Nullable Object onInvoke();
}
@JsFunction
public interface DetachedCallbackFn{
@Nullable Object onInvoke();
}
@JsFunction
public interface DisconnectedCallbackFn{
@Nullable Object onInvoke();
}
@JsFunction
public interface FormResetCallbackFn{
@Nullable Object onInvoke();
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
static HTMLElement.@Nullable FormStateRestoreCallbackStateUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable File asFile(){
return Js.cast(this);
}
@JsOverlay
default @Nullable JsArray<JsArray<HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType>> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
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
public @Nullable Element contextMenu;
public HTMLElement.CreatedCallbackFn createdCallback;
public JsPropertyMap<String> dataset;
public HTMLElement.DetachedCallbackFn detachedCallback;
public String dir;
public HTMLElement.DisconnectedCallbackFn disconnectedCallback;
public boolean draggable;
public @Nullable JsObject dropzone;
public HTMLElement.FormResetCallbackFn formResetCallback;
public boolean hidden;
public boolean inert;
public String lang;
public @Nullable String nonce;
public int offsetHeight;
public int offsetLeft;
public @Nullable Element offsetParent;
public int offsetTop;
public int offsetWidth;
public String outerText;
public @Nullable String popover;
public @Nullable ShadowRoot shadowRoot;
public boolean spellcheck;
public CSSStyleDeclaration style;
public int tabIndex;
public String title;
public native @Nullable Object adoptedCallback(Document oldDocument,Document newDocument);
public native ElementInternals attachInternals();
public native ShadowRoot attachShadow(ShadowRootInit options);
public native @Nullable Object attributeChangedCallback(String attributeName,@Nullable String oldValue,@Nullable String newValue,@Nullable String namespace);
public native void click();
public native ShadowRoot createShadowRoot();
public native @Nullable Object formAssociatedCallback(@Nullable HTMLFormElement form);
public native @Nullable Object formDisabledCallback(boolean disabled);
@JsOverlay
public final @Nullable Object formStateRestoreCallback(File state,String reason){
return formStateRestoreCallback(Js.<HTMLElement.@Nullable FormStateRestoreCallbackStateUnionType>uncheckedCast(state),reason);
}
@JsOverlay
public final @Nullable Object formStateRestoreCallback(HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType[][] state,String reason){
return formStateRestoreCallback(Js.<JsArray<JsArray<HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType>>>uncheckedCast(state),reason);
}
public native @Nullable Object formStateRestoreCallback(HTMLElement.@Nullable FormStateRestoreCallbackStateUnionType state,String reason);
@JsOverlay
public final @Nullable Object formStateRestoreCallback(JsArray<JsArray<HTMLElement.FormStateRestoreCallbackStateArrayArrayUnionType>> state,String reason){
return formStateRestoreCallback(Js.<HTMLElement.@Nullable FormStateRestoreCallbackStateUnionType>uncheckedCast(state),reason);
}
@JsOverlay
public final @Nullable Object formStateRestoreCallback(String state,String reason){
return formStateRestoreCallback(Js.<HTMLElement.@Nullable FormStateRestoreCallbackStateUnionType>uncheckedCast(state),reason);
}
public native NodeList<Node> getDestinationInsertionPoints();
public native void hidePopover();
public native void showPopover();
public native boolean togglePopover();
public native boolean togglePopover(boolean force);
public native ShadowRoot webkitCreateShadowRoot();
}
