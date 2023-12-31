package elemental2.svg;
import elemental2.svg.SVGAnimatedNumberList;
import elemental2.svg.SVGAnimatedEnumeration;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGAnimatedNumber;
import elemental2.svg.SVGElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGComponentTransferFunctionElement extends SVGElement{
@JsOverlay
public static final double SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE=SVGComponentTransferFunctionElement__Constants.SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE;
@JsOverlay
public static final double SVG_FECOMPONENTTRANSFER_TYPE_GAMMA=SVGComponentTransferFunctionElement__Constants.SVG_FECOMPONENTTRANSFER_TYPE_GAMMA;
@JsOverlay
public static final double SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY=SVGComponentTransferFunctionElement__Constants.SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY;
@JsOverlay
public static final double SVG_FECOMPONENTTRANSFER_TYPE_LINEAR=SVGComponentTransferFunctionElement__Constants.SVG_FECOMPONENTTRANSFER_TYPE_LINEAR;
@JsOverlay
public static final double SVG_FECOMPONENTTRANSFER_TYPE_TABLE=SVGComponentTransferFunctionElement__Constants.SVG_FECOMPONENTTRANSFER_TYPE_TABLE;
@JsOverlay
public static final double SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN=SVGComponentTransferFunctionElement__Constants.SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN;
public SVGAnimatedNumber amplitude;
public SVGAnimatedNumber exponent;
public SVGAnimatedNumber intercept;
public SVGAnimatedNumber offset;
public SVGAnimatedNumber slope;
public SVGAnimatedNumberList tableValues;
public SVGAnimatedEnumeration type;
}
