package elemental2.svg;
import elemental2.svg.SVGStringList;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGAnimatedRect;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGTests;
import elemental2.svg.SVGFitToViewBox;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedTransformList;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGPatternElement extends SVGElement implements SVGExternalResourcesRequired, SVGFitToViewBox, SVGLangSpace, SVGStylable, SVGTests, SVGURIReference{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedLength height;
public SVGAnimatedString href;
public SVGAnimatedEnumeration patternContentUnits;
public SVGAnimatedTransformList patternTransform;
public SVGAnimatedEnumeration patternUnits;
public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
public SVGStringList requiredExtensions;
public SVGStringList requiredFeatures;
public SVGStringList systemLanguage;
public SVGAnimatedRect viewBox;
public SVGAnimatedLength width;
public SVGAnimatedLength x;
public String xmllang;
public String xmlspace;
public SVGAnimatedLength y;
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGAnimatedString getHref();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty
public native SVGStringList getRequiredExtensions();
@JsProperty
public native SVGStringList getRequiredFeatures();
@JsProperty
public native SVGStringList getSystemLanguage();
@JsProperty
public native SVGAnimatedRect getViewBox();
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
public native boolean hasExtension();
public native boolean hasExtension(String extension);
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setHref(SVGAnimatedString href);
@JsProperty
public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio preserveAspectRatio);
@JsProperty
public native void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
public native void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
public native void setSystemLanguage(SVGStringList systemLanguage);
@JsProperty
public native void setViewBox(SVGAnimatedRect viewBox);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}
