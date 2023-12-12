package elemental2.svg;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGFilterPrimitiveStandardAttributes;
import elemental2.svg.SVGAnimatedInteger;
import elemental2.svg.SVGAnimatedNumber;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGAnimatedNumberList;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGFEConvolveMatrixElement extends SVGElement implements SVGFilterPrimitiveStandardAttributes{
@JsOverlay
public static final double SVG_EDGEMODE_DUPLICATE=SVGFEConvolveMatrixElement__Constants.SVG_EDGEMODE_DUPLICATE;
@JsOverlay
public static final double SVG_EDGEMODE_NONE=SVGFEConvolveMatrixElement__Constants.SVG_EDGEMODE_NONE;
@JsOverlay
public static final double SVG_EDGEMODE_UNKNOWN=SVGFEConvolveMatrixElement__Constants.SVG_EDGEMODE_UNKNOWN;
@JsOverlay
public static final double SVG_EDGEMODE_WRAP=SVGFEConvolveMatrixElement__Constants.SVG_EDGEMODE_WRAP;
public SVGAnimatedNumber bias;
public SVGAnimatedNumber divisor;
public SVGAnimatedEnumeration edgeMode;
public SVGAnimatedLength height;
public SVGAnimatedString in1;
public SVGAnimatedNumberList kernelMatrix;
public SVGAnimatedNumber kernelUnitLengthX;
public SVGAnimatedNumber kernelUnitLengthY;
public SVGAnimatedInteger orderX;
public SVGAnimatedInteger orderY;
public SVGAnimatedBoolean preserveAlpha;
public SVGAnimatedString result;
public SVGAnimatedInteger targetX;
public SVGAnimatedInteger targetY;
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
