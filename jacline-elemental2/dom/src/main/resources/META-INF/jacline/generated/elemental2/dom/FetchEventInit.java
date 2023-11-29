package elemental2.dom;
import elemental2.dom.Response;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.ServiceWorkerClient;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.Request;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FetchEventInit{
@JsOverlay
static FetchEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ServiceWorkerClient getClient();
@JsProperty
Promise<Response> getPreloadResponse();
@JsProperty
Request getRequest();
@JsProperty
boolean isBubbles();
@JsProperty
boolean isCancelable();
@JsProperty
boolean isIsReload();
@JsProperty
void setBubbles(boolean bubbles);
@JsProperty
void setCancelable(boolean cancelable);
@JsProperty
void setClient(ServiceWorkerClient client);
@JsProperty
void setIsReload(boolean isReload);
@JsProperty
void setPreloadResponse(Promise<Response> preloadResponse);
@JsProperty
void setRequest(Request request);
}
