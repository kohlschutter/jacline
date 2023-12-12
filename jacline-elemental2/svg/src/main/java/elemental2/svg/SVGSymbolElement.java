package elemental2.svg;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGAnimatedRect;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGFitToViewBox;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGSymbolElement extends SVGElement implements SVGExternalResourcesRequired, SVGFitToViewBox, SVGLangSpace, SVGStylable{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
public SVGAnimatedRect viewBox;
public String xmllang;
public String xmlspace;
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty
public native SVGAnimatedRect getViewBox();
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio preserveAspectRatio);
@JsProperty
public native void setViewBox(SVGAnimatedRect viewBox);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}
