package elemental2.svg;
import elemental2.dom.CSSValue;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.RGBColor;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGColor extends CSSValue{
@JsOverlay
public static final double SVG_COLORTYPE_CURRENTCOLOR=SVGColor__Constants.SVG_COLORTYPE_CURRENTCOLOR;
@JsOverlay
public static final double SVG_COLORTYPE_RGBCOLOR=SVGColor__Constants.SVG_COLORTYPE_RGBCOLOR;
@JsOverlay
public static final double SVG_COLORTYPE_RGBCOLOR_ICCCOLOR=SVGColor__Constants.SVG_COLORTYPE_RGBCOLOR_ICCCOLOR;
@JsOverlay
public static final double SVG_COLORTYPE_UNKNOWN=SVGColor__Constants.SVG_COLORTYPE_UNKNOWN;
public double colorType;
public RGBColor rgbColor;
public native void setColor(double colorType,String rgbColor,String iccColor);
public native void setRGBColor(String rgbColor);
public native void setRGBColorICCColor(String rgbColor,String iccColor);
}
