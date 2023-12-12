package elemental2.svg;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGLength{
@JsOverlay
public static final double SVG_LENGTHTYPE_CM=SVGLength__Constants.SVG_LENGTHTYPE_CM;
@JsOverlay
public static final double SVG_LENGTHTYPE_EMS=SVGLength__Constants.SVG_LENGTHTYPE_EMS;
@JsOverlay
public static final double SVG_LENGTHTYPE_EXS=SVGLength__Constants.SVG_LENGTHTYPE_EXS;
@JsOverlay
public static final double SVG_LENGTHTYPE_IN=SVGLength__Constants.SVG_LENGTHTYPE_IN;
@JsOverlay
public static final double SVG_LENGTHTYPE_MM=SVGLength__Constants.SVG_LENGTHTYPE_MM;
@JsOverlay
public static final double SVG_LENGTHTYPE_NUMBER=SVGLength__Constants.SVG_LENGTHTYPE_NUMBER;
@JsOverlay
public static final double SVG_LENGTHTYPE_PC=SVGLength__Constants.SVG_LENGTHTYPE_PC;
@JsOverlay
public static final double SVG_LENGTHTYPE_PERCENTAGE=SVGLength__Constants.SVG_LENGTHTYPE_PERCENTAGE;
@JsOverlay
public static final double SVG_LENGTHTYPE_PT=SVGLength__Constants.SVG_LENGTHTYPE_PT;
@JsOverlay
public static final double SVG_LENGTHTYPE_PX=SVGLength__Constants.SVG_LENGTHTYPE_PX;
@JsOverlay
public static final double SVG_LENGTHTYPE_UNKNOWN=SVGLength__Constants.SVG_LENGTHTYPE_UNKNOWN;
public int unitType;
public double value;
public String valueAsString;
public double valueInSpecifiedUnits;
public native void convertToSpecifiedUnits(int unitType);
public native void newValueSpecifiedUnits(int unitType,double valueInSpecifiedUnits);
}
