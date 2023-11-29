package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface GetRootNodeOptions{
@JsOverlay
static GetRootNodeOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isComposed();
@JsProperty
void setComposed(boolean composed);
}
