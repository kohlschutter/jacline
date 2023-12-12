package elemental2.svg;
import elemental2.svg.SVGStringList;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGTests;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGCursorElement extends SVGElement implements SVGExternalResourcesRequired, SVGTests, SVGURIReference{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedString href;
public SVGStringList requiredExtensions;
public SVGStringList requiredFeatures;
public SVGStringList systemLanguage;
public SVGAnimatedLength x;
public SVGAnimatedLength y;
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGAnimatedString getHref();
@JsProperty
public native SVGStringList getRequiredExtensions();
@JsProperty
public native SVGStringList getRequiredFeatures();
@JsProperty
public native SVGStringList getSystemLanguage();
public native boolean hasExtension();
public native boolean hasExtension(String extension);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setHref(SVGAnimatedString href);
@JsProperty
public native void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
public native void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
public native void setSystemLanguage(SVGStringList systemLanguage);
}
