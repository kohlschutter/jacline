package elemental2.svg;
import elemental2.svg.SVGExternalResourcesRequired;
import elemental2.svg.SVGStringList;
import jsinterop.annotations.JsProperty;
import elemental2.svg.ElementTimeControl;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGTests;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedBoolean;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGAnimationElement extends SVGElement implements ElementTimeControl, SVGExternalResourcesRequired, SVGTests{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGStringList requiredExtensions;
public SVGStringList requiredFeatures;
public SVGStringList systemLanguage;
public SVGElement targetElement;
public native void beginElement();
public native void beginElementAt();
public native void beginElementAt(double offset);
public native void endElement();
public native void endElementAt();
public native void endElementAt(double offset);
public native double getCurrentTime();
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGStringList getRequiredExtensions();
@JsProperty
public native SVGStringList getRequiredFeatures();
public native double getSimpleDuration();
public native double getStartTime();
@JsProperty
public native SVGStringList getSystemLanguage();
public native boolean hasExtension();
public native boolean hasExtension(String extension);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
public native void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
public native void setSystemLanguage(SVGStringList systemLanguage);
}
