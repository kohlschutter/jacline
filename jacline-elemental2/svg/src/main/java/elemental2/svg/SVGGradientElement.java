package elemental2.svg;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGStylable;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedTransformList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGGradientElement extends SVGElement implements SVGExternalResourcesRequired, SVGStylable, SVGURIReference{
@JsOverlay
public static final double SVG_SPREADMETHOD_PAD=SVGGradientElement__Constants.SVG_SPREADMETHOD_PAD;
@JsOverlay
public static final double SVG_SPREADMETHOD_REFLECT=SVGGradientElement__Constants.SVG_SPREADMETHOD_REFLECT;
@JsOverlay
public static final double SVG_SPREADMETHOD_REPEAT=SVGGradientElement__Constants.SVG_SPREADMETHOD_REPEAT;
@JsOverlay
public static final double SVG_SPREADMETHOD_UNKNOWN=SVGGradientElement__Constants.SVG_SPREADMETHOD_UNKNOWN;
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedTransformList gradientTransform;
public SVGAnimatedEnumeration gradientUnits;
public SVGAnimatedString href;
public SVGAnimatedEnumeration spreadMethod;
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGAnimatedString getHref();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setHref(SVGAnimatedString href);
}
