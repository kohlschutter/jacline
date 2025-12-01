package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PushSubscriptionOptions{
@JsOverlay
static PushSubscriptionOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable ArrayBuffer getApplicationServerKey();
@JsProperty
boolean isUserVisibleOnly();
@JsProperty
void setApplicationServerKey(@Nullable ArrayBuffer applicationServerKey);
@JsProperty
void setUserVisibleOnly(boolean userVisibleOnly);
}
