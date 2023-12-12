package elemental2.svg;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedBoolean;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGMPathElement extends SVGElement implements SVGExternalResourcesRequired, SVGURIReference{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedString href;
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGAnimatedString getHref();
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setHref(SVGAnimatedString href);
}
