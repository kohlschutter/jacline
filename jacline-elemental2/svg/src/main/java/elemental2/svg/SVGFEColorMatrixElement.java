package elemental2.svg;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGFilterPrimitiveStandardAttributes;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGAnimatedNumberList;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGFEColorMatrixElement extends SVGElement implements SVGFilterPrimitiveStandardAttributes{
@JsOverlay
public static final double SVG_FECOLORMATRIX_TYPE_HUEROTATE=SVGFEColorMatrixElement__Constants.SVG_FECOLORMATRIX_TYPE_HUEROTATE;
@JsOverlay
public static final double SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA=SVGFEColorMatrixElement__Constants.SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA;
@JsOverlay
public static final double SVG_FECOLORMATRIX_TYPE_MATRIX=SVGFEColorMatrixElement__Constants.SVG_FECOLORMATRIX_TYPE_MATRIX;
@JsOverlay
public static final double SVG_FECOLORMATRIX_TYPE_SATURATE=SVGFEColorMatrixElement__Constants.SVG_FECOLORMATRIX_TYPE_SATURATE;
@JsOverlay
public static final double SVG_FECOLORMATRIX_TYPE_UNKNOWN=SVGFEColorMatrixElement__Constants.SVG_FECOLORMATRIX_TYPE_UNKNOWN;
public SVGAnimatedLength height;
public SVGAnimatedString in1;
public SVGAnimatedString result;
public SVGAnimatedEnumeration type;
public SVGAnimatedNumberList values;
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
