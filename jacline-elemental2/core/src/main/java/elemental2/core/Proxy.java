package elemental2.core;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.core.ProxyHandler;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Proxy<TARGET>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RevocableReturnType<TARGET>{
@JsFunction
public interface RevokeFn{
void onInvoke();
}
@JsOverlay
static Proxy.RevocableReturnType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Proxy<TARGET> getProxy();
@JsProperty
Proxy.RevocableReturnType.RevokeFn getRevoke();
@JsProperty
void setProxy(Proxy<TARGET> proxy);
@JsProperty
void setRevoke(Proxy.RevocableReturnType.RevokeFn revoke);
}
public static native <TARGET>Proxy.RevocableReturnType<TARGET> revocable(TARGET target,ProxyHandler<TARGET> handler);
public Proxy(TARGET target,ProxyHandler<TARGET> handler){}
}
