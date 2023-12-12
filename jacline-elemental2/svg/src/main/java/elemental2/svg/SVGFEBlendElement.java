package elemental2.svg;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGFilterPrimitiveStandardAttributes;
import elemental2.svg.SVGAnimatedString;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGFEBlendElement extends SVGElement implements SVGFilterPrimitiveStandardAttributes{
@JsOverlay
public static final double SVG_FEBLEND_MODE_DARKEN=SVGFEBlendElement__Constants.SVG_FEBLEND_MODE_DARKEN;
@JsOverlay
public static final double SVG_FEBLEND_MODE_LIGHTEN=SVGFEBlendElement__Constants.SVG_FEBLEND_MODE_LIGHTEN;
@JsOverlay
public static final double SVG_FEBLEND_MODE_MULTIPLY=SVGFEBlendElement__Constants.SVG_FEBLEND_MODE_MULTIPLY;
@JsOverlay
public static final double SVG_FEBLEND_MODE_NORMAL=SVGFEBlendElement__Constants.SVG_FEBLEND_MODE_NORMAL;
@JsOverlay
public static final double SVG_FEBLEND_MODE_SCREEN=SVGFEBlendElement__Constants.SVG_FEBLEND_MODE_SCREEN;
@JsOverlay
public static final double SVG_FEBLEND_MODE_UNKNOWN=SVGFEBlendElement__Constants.SVG_FEBLEND_MODE_UNKNOWN;
public SVGAnimatedLength height;
public SVGAnimatedString in1;
public SVGAnimatedString in2;
public SVGAnimatedEnumeration mode;
public SVGAnimatedString result;
public SVGAnimatedLength width;
public SVGAnimatedLength x;
public SVGAnimatedLength y;
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedLength getHeight();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGAnimatedString getResult();
@JsProperty
public native SVGAnimatedLength getWidth();
@JsProperty
public native SVGAnimatedLength getX();
@JsProperty
public native SVGAnimatedLength getY();
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setHeight(SVGAnimatedLength height);
@JsProperty
public native void setResult(SVGAnimatedString result);
@JsProperty
public native void setWidth(SVGAnimatedLength width);
@JsProperty
public native void setX(SVGAnimatedLength x);
@JsProperty
public native void setY(SVGAnimatedLength y);
}
