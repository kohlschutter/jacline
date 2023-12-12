package elemental2.svg;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGFilterPrimitiveStandardAttributes;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGFEImageElement extends SVGElement implements SVGExternalResourcesRequired, SVGFilterPrimitiveStandardAttributes, SVGLangSpace, SVGURIReference{
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedLength height;
public SVGAnimatedString href;
public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
public SVGAnimatedString result;
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
public native SVGAnimatedLength getHeight();
@JsProperty
public native SVGAnimatedString getHref();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGAnimatedString getResult();
@JsProperty
public native SVGAnimatedLength getWidth();
@JsProperty
public native SVGAnimatedLength getX();
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
@JsProperty
public native SVGAnimatedLength getY();
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setHeight(SVGAnimatedLength height);
@JsProperty
public native void setHref(SVGAnimatedString href);
@JsProperty
public native void setResult(SVGAnimatedString result);
@JsProperty
public native void setWidth(SVGAnimatedLength width);
@JsProperty
public native void setX(SVGAnimatedLength x);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
@JsProperty
public native void setY(SVGAnimatedLength y);
}
