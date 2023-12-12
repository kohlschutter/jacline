package elemental2.svg;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedBoolean;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGScriptElement extends SVGElement implements SVGExternalResourcesRequired, SVGURIReference{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedString href;
public String type;
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGAnimatedString getHref();
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setHref(SVGAnimatedString href);
}
