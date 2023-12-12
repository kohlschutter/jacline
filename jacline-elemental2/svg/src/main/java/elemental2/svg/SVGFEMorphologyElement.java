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
public class SVGFEMorphologyElement extends SVGElement implements SVGFilterPrimitiveStandardAttributes{
@JsOverlay
public static final double SVG_MORPHOLOGY_OPERATOR_DILATE=SVGFEMorphologyElement__Constants.SVG_MORPHOLOGY_OPERATOR_DILATE;
@JsOverlay
public static final double SVG_MORPHOLOGY_OPERATOR_ERODE=SVGFEMorphologyElement__Constants.SVG_MORPHOLOGY_OPERATOR_ERODE;
@JsOverlay
public static final double SVG_MORPHOLOGY_OPERATOR_UNKNOWN=SVGFEMorphologyElement__Constants.SVG_MORPHOLOGY_OPERATOR_UNKNOWN;
public SVGAnimatedLength height;
public SVGAnimatedString in1;
public SVGAnimatedEnumeration operator;
public SVGAnimatedNumber radiusX;
public SVGAnimatedNumber radiusY;
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
public native void setRadius();
public native void setRadius(double radiusX,double radiusY);
public native void setRadius(double radiusX);
@JsProperty
public native void setResult(SVGAnimatedString result);
@JsProperty
public native void setWidth(SVGAnimatedLength width);
@JsProperty
public native void setX(SVGAnimatedLength x);
@JsProperty
public native void setY(SVGAnimatedLength y);
}
