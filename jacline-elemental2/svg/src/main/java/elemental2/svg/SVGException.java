package elemental2.svg;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsMethod;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGException{
@JsOverlay
public static final double SVG_INVALID_VALUE_ERR=SVGException__Constants.SVG_INVALID_VALUE_ERR;
@JsOverlay
public static final double SVG_MATRIX_NOT_INVERTABLE=SVGException__Constants.SVG_MATRIX_NOT_INVERTABLE;
@JsOverlay
public static final double SVG_WRONG_TYPE_ERR=SVGException__Constants.SVG_WRONG_TYPE_ERR;
public double code;
public String message;
public String name;
@JsMethod(name = "toString")
public native String toString_();
}
