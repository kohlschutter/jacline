package elemental2.svg;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGFilterPrimitiveStandardAttributes;
import elemental2.svg.SVGAnimatedNumber;
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
public class SVGFECompositeElement extends SVGElement implements SVGFilterPrimitiveStandardAttributes{
@JsOverlay
public static final double SVG_FECOMPOSITE_OPERATOR_ARITHMETIC=SVGFECompositeElement__Constants.SVG_FECOMPOSITE_OPERATOR_ARITHMETIC;
@JsOverlay
public static final double SVG_FECOMPOSITE_OPERATOR_ATOP=SVGFECompositeElement__Constants.SVG_FECOMPOSITE_OPERATOR_ATOP;
@JsOverlay
public static final double SVG_FECOMPOSITE_OPERATOR_IN=SVGFECompositeElement__Constants.SVG_FECOMPOSITE_OPERATOR_IN;
@JsOverlay
public static final double SVG_FECOMPOSITE_OPERATOR_OUT=SVGFECompositeElement__Constants.SVG_FECOMPOSITE_OPERATOR_OUT;
@JsOverlay
public static final double SVG_FECOMPOSITE_OPERATOR_OVER=SVGFECompositeElement__Constants.SVG_FECOMPOSITE_OPERATOR_OVER;
@JsOverlay
public static final double SVG_FECOMPOSITE_OPERATOR_UNKNOWN=SVGFECompositeElement__Constants.SVG_FECOMPOSITE_OPERATOR_UNKNOWN;
@JsOverlay
public static final double SVG_FECOMPOSITE_OPERATOR_XOR=SVGFECompositeElement__Constants.SVG_FECOMPOSITE_OPERATOR_XOR;
public SVGAnimatedLength height;
public SVGAnimatedString in1;
public SVGAnimatedString in2;
public SVGAnimatedNumber k1;
public SVGAnimatedNumber k2;
public SVGAnimatedNumber k3;
public SVGAnimatedNumber k4;
public SVGAnimatedEnumeration operator;
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
