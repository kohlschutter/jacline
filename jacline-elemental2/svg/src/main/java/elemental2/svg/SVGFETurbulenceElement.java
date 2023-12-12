package elemental2.svg;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGFilterPrimitiveStandardAttributes;
import elemental2.svg.SVGAnimatedInteger;
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
public class SVGFETurbulenceElement extends SVGElement implements SVGFilterPrimitiveStandardAttributes{
@JsOverlay
public static final double SVG_STITCHTYPE_NOSTITCH=SVGFETurbulenceElement__Constants.SVG_STITCHTYPE_NOSTITCH;
@JsOverlay
public static final double SVG_STITCHTYPE_STITCH=SVGFETurbulenceElement__Constants.SVG_STITCHTYPE_STITCH;
@JsOverlay
public static final double SVG_STITCHTYPE_UNKNOWN=SVGFETurbulenceElement__Constants.SVG_STITCHTYPE_UNKNOWN;
@JsOverlay
public static final double SVG_TURBULENCE_TYPE_FRACTALNOISE=SVGFETurbulenceElement__Constants.SVG_TURBULENCE_TYPE_FRACTALNOISE;
@JsOverlay
public static final double SVG_TURBULENCE_TYPE_TURBULENCE=SVGFETurbulenceElement__Constants.SVG_TURBULENCE_TYPE_TURBULENCE;
@JsOverlay
public static final double SVG_TURBULENCE_TYPE_UNKNOWN=SVGFETurbulenceElement__Constants.SVG_TURBULENCE_TYPE_UNKNOWN;
public SVGAnimatedNumber baseFrequencyX;
public SVGAnimatedNumber baseFrequencyY;
public SVGAnimatedLength height;
public SVGAnimatedInteger numOctaves;
public SVGAnimatedString result;
public SVGAnimatedNumber seed;
public SVGAnimatedEnumeration stitchTiles;
public SVGAnimatedEnumeration type;
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
