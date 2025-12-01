package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.ShadowRoot;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface GetHTMLOptions{
@JsOverlay
static GetHTMLOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<ShadowRoot> getShadowRoots();
@JsProperty
boolean isSerializableShadowRoots();
@JsProperty
void setSerializableShadowRoots(boolean serializableShadowRoots);
@JsProperty
void setShadowRoots(JsArray<ShadowRoot> shadowRoots);
@JsOverlay
default void setShadowRoots(ShadowRoot[] shadowRoots){
setShadowRoots(Js.<JsArray<ShadowRoot>>uncheckedCast(shadowRoots));
}
}
