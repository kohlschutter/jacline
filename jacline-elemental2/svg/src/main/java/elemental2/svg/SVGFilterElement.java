package elemental2.svg;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGAnimatedInteger;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGFilterElement extends SVGElement implements SVGExternalResourcesRequired, SVGLangSpace, SVGStylable, SVGURIReference{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedInteger filterResX;
public SVGAnimatedInteger filterResY;
public SVGAnimatedEnumeration filterUnits;
public SVGAnimatedLength height;
public SVGAnimatedString href;
public SVGAnimatedEnumeration primitiveUnits;
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
public native String getXmllang();
@JsProperty
public native String getXmlspace();
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
public native void setFilterRes();
public native void setFilterRes(double filterResX,double filterResY);
public native void setFilterRes(double filterResX);
@JsProperty
public native void setHref(SVGAnimatedString href);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}
