package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
@Nullable Object onInvoke(MessageEvent p0);
}
@JsProperty
String getName();
@JsProperty
SharedWorkerGlobalScope.@Nullable OnconnectFn getOnconnect();
@JsProperty
void setName(String name);
@JsProperty
void setOnconnect(SharedWorkerGlobalScope.@Nullable OnconnectFn onconnect);
}
