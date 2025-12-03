package elemental2.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.webcrypto.webcrypto.Crypto;
import elemental2.dom.WorkerGlobalScope;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "WorkerGlobalScope",namespace = JsPackage.GLOBAL)
public interface WebcryptoWorkerGlobalScope extends WorkerGlobalScope{
@JsOverlay
static WebcryptoWorkerGlobalScope of(WorkerGlobalScope o){
return Js.cast(o);
}
@JsProperty
Crypto getCrypto();
@JsProperty
void setCrypto(Crypto crypto);
}
