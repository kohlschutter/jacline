package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PromiseRejectionEventInit extends EventInit{
@JsOverlay
static PromiseRejectionEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Promise<@Nullable Object> getPromise();
@JsProperty
@Nullable Object getReason();
@JsProperty
void setPromise(Promise<@Nullable Object> promise);
@JsProperty
void setReason(@Nullable Object reason);
}
