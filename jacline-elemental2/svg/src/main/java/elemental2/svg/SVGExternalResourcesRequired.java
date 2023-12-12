package elemental2.svg;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedBoolean;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGExternalResourcesRequired{
@JsProperty
SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
}
