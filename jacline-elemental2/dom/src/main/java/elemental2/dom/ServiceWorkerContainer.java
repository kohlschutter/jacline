package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.ErrorEvent;
import elemental2.dom.URL;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.Event;
import elemental2.dom.RegistrationOptions;
import elemental2.dom.ServiceWorkerRegistration;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.dom.ExtendableMessageEvent;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ServiceWorker;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.MessageEvent;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ServiceWorkerContainer extends EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetRegistrationDocumentURLUnionType{
@JsOverlay
static ServiceWorkerContainer.GetRegistrationDocumentURLUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsFunction
public interface OncontrollerchangeFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
void onInvoke(ErrorEvent p0);
}
@JsFunction
public interface OnmessageFn{
void onInvoke(ExtendableMessageEvent p0);
}
@JsFunction
public interface OnmessageerrorFn{
@Nullable Object onInvoke(MessageEvent<@Nullable Object> p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RegisterScriptURLUnionType{
@JsOverlay
static ServiceWorkerContainer.RegisterScriptURLUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedScriptURL asTrustedScriptURL(){
return Js.cast(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedScriptURL(){
return (Object)this instanceof TrustedScriptURL;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsProperty
@Nullable ServiceWorker getController();
@JsProperty
ServiceWorkerContainer.@Nullable OncontrollerchangeFn getOncontrollerchange();
@JsProperty
ServiceWorkerContainer.@Nullable OnerrorFn getOnerror();
@JsProperty
ServiceWorkerContainer.@Nullable OnmessageFn getOnmessage();
@JsProperty
ServiceWorkerContainer.@Nullable OnmessageerrorFn getOnmessageerror();
@JsProperty
Promise<ServiceWorkerRegistration> getReady();
Promise<ServiceWorkerRegistration> getRegistration();
Promise<ServiceWorkerRegistration> getRegistration(ServiceWorkerContainer.GetRegistrationDocumentURLUnionType documentURL);
@JsOverlay
default Promise<ServiceWorkerRegistration> getRegistration(String documentURL){
return getRegistration(Js.<ServiceWorkerContainer.GetRegistrationDocumentURLUnionType>uncheckedCast(documentURL));
}
@JsOverlay
default Promise<ServiceWorkerRegistration> getRegistration(URL documentURL){
return getRegistration(Js.<ServiceWorkerContainer.GetRegistrationDocumentURLUnionType>uncheckedCast(documentURL));
}
Promise<@Nullable JsArray<ServiceWorkerRegistration>> getRegistrations();
Promise<ServiceWorkerRegistration> register(ServiceWorkerContainer.RegisterScriptURLUnionType scriptURL,RegistrationOptions options);
Promise<ServiceWorkerRegistration> register(ServiceWorkerContainer.RegisterScriptURLUnionType scriptURL);
@JsOverlay
default Promise<ServiceWorkerRegistration> register(String scriptURL,RegistrationOptions options){
return register(Js.<ServiceWorkerContainer.RegisterScriptURLUnionType>uncheckedCast(scriptURL),options);
}
@JsOverlay
default Promise<ServiceWorkerRegistration> register(String scriptURL){
return register(Js.<ServiceWorkerContainer.RegisterScriptURLUnionType>uncheckedCast(scriptURL));
}
@JsOverlay
default Promise<ServiceWorkerRegistration> register(TrustedScriptURL scriptURL,RegistrationOptions options){
return register(Js.<ServiceWorkerContainer.RegisterScriptURLUnionType>uncheckedCast(scriptURL),options);
}
@JsOverlay
default Promise<ServiceWorkerRegistration> register(TrustedScriptURL scriptURL){
return register(Js.<ServiceWorkerContainer.RegisterScriptURLUnionType>uncheckedCast(scriptURL));
}
@JsOverlay
default Promise<ServiceWorkerRegistration> register(URL scriptURL,RegistrationOptions options){
return register(Js.<ServiceWorkerContainer.RegisterScriptURLUnionType>uncheckedCast(scriptURL),options);
}
@JsOverlay
default Promise<ServiceWorkerRegistration> register(URL scriptURL){
return register(Js.<ServiceWorkerContainer.RegisterScriptURLUnionType>uncheckedCast(scriptURL));
}
@JsProperty
void setController(@Nullable ServiceWorker controller);
@JsProperty
void setOncontrollerchange(ServiceWorkerContainer.@Nullable OncontrollerchangeFn oncontrollerchange);
@JsProperty
void setOnerror(ServiceWorkerContainer.@Nullable OnerrorFn onerror);
@JsProperty
void setOnmessage(ServiceWorkerContainer.@Nullable OnmessageFn onmessage);
@JsProperty
void setOnmessageerror(ServiceWorkerContainer.@Nullable OnmessageerrorFn onmessageerror);
@JsProperty
void setReady(Promise<ServiceWorkerRegistration> ready);
}
