package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import elemental2.dom.WorkerGlobalScope;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MessageEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SharedWorkerGlobalScope extends WorkerGlobalScope{
@JsFunction
public interface OnconnectFn{
Object onInvoke(MessageEvent p0);
}
@JsProperty
String getName();
@JsProperty
SharedWorkerGlobalScope.OnconnectFn getOnconnect();
@JsProperty
void setName(String name);
@JsProperty
void setOnconnect(SharedWorkerGlobalScope.OnconnectFn onconnect);
}
