package elemental2.svg;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGAngle{
@JsOverlay
public static final double SVG_ANGLETYPE_DEG=SVGAngle__Constants.SVG_ANGLETYPE_DEG;
@JsOverlay
public static final double SVG_ANGLETYPE_GRAD=SVGAngle__Constants.SVG_ANGLETYPE_GRAD;
@JsOverlay
public static final double SVG_ANGLETYPE_RAD=SVGAngle__Constants.SVG_ANGLETYPE_RAD;
@JsOverlay
public static final double SVG_ANGLETYPE_UNKNOWN=SVGAngle__Constants.SVG_ANGLETYPE_UNKNOWN;
@JsOverlay
public static final double SVG_ANGLETYPE_UNSPECIFIED=SVGAngle__Constants.SVG_ANGLETYPE_UNSPECIFIED;
public int unitType;
public double value;
public String valueAsString;
public double valueInSpecifiedUnits;
public native void convertToSpecifiedUnits(int unitType);
public native void newValueSpecifiedUnits(int unitType,double valueInSpecifiedUnits);
}
