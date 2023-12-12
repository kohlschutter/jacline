package elemental2.svg;
import elemental2.svg.SVGStringList;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGRect;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGMatrix;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGTransformable;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGTests;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedTransformList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGDefsElement extends SVGElement implements SVGExternalResourcesRequired, SVGLangSpace, SVGStylable, SVGTests, SVGTransformable{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGElement farthestViewportElement;
public SVGElement nearestViewportElement;
public SVGStringList requiredExtensions;
public SVGStringList requiredFeatures;
public SVGStringList systemLanguage;
public SVGAnimatedTransformList transform;
public String xmllang;
public String xmlspace;
public native SVGRect getBBox();
public native SVGMatrix getCTM();
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGElement getFarthestViewportElement();
@JsProperty
public native SVGElement getNearestViewportElement();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGStringList getRequiredExtensions();
@JsProperty
public native SVGStringList getRequiredFeatures();
public native SVGMatrix getScreenCTM();
@JsProperty
public native SVGStringList getSystemLanguage();
@JsProperty
public native SVGAnimatedTransformList getTransform();
public native SVGMatrix getTransformToElement();
public native SVGMatrix getTransformToElement(SVGElement element);
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
public native void setFarthestViewportElement(SVGElement farthestViewportElement);
@JsProperty
public native void setNearestViewportElement(SVGElement nearestViewportElement);
@JsProperty
public native void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
public native void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
public native void setSystemLanguage(SVGStringList systemLanguage);
@JsProperty
public native void setTransform(SVGAnimatedTransformList transform);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}
