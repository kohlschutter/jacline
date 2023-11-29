package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface IdleCallbackOptions{
@JsOverlay
static IdleCallbackOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getTimeout();
@JsProperty
void setTimeout(int timeout);
}
