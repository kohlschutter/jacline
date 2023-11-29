package elemental2.dom;
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
ServiceWorker getController();
@JsProperty
ServiceWorkerContainer.OncontrollerchangeFn getOncontrollerchange();
@JsProperty
ServiceWorkerContainer.OnerrorFn getOnerror();
@JsProperty
ServiceWorkerContainer.OnmessageFn getOnmessage();
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
Promise<JsArray<ServiceWorkerRegistration>> getRegistrations();
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
void setController(ServiceWorker controller);
@JsProperty
void setOncontrollerchange(ServiceWorkerContainer.OncontrollerchangeFn oncontrollerchange);
@JsProperty
void setOnerror(ServiceWorkerContainer.OnerrorFn onerror);
@JsProperty
void setOnmessage(ServiceWorkerContainer.OnmessageFn onmessage);
@JsProperty
void setReady(Promise<ServiceWorkerRegistration> ready);
}
