package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.core.ProxyHandler;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Proxy<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RevocableReturnType<TARGET extends @Nullable Object>{
@JsFunction
public interface RevokeFn{
void onInvoke();
}
@JsOverlay
static <TARGET extends @Nullable Object> Proxy.RevocableReturnType<TARGET> create(){
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
public static native <TARGET extends @Nullable Object> Proxy.RevocableReturnType<TARGET> revocable(TARGET target,ProxyHandler<TARGET> handler);
public Proxy(TARGET target,ProxyHandler<TARGET> handler){}
}
