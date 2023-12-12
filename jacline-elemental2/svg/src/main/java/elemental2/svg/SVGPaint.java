package elemental2.svg;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGColor;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGPaint extends SVGColor{
@JsOverlay
public static final double SVG_PAINTTYPE_CURRENTCOLOR=SVGPaint__Constants.SVG_PAINTTYPE_CURRENTCOLOR;
@JsOverlay
public static final double SVG_PAINTTYPE_NONE=SVGPaint__Constants.SVG_PAINTTYPE_NONE;
@JsOverlay
public static final double SVG_PAINTTYPE_RGBCOLOR=SVGPaint__Constants.SVG_PAINTTYPE_RGBCOLOR;
@JsOverlay
public static final double SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR=SVGPaint__Constants.SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR;
@JsOverlay
public static final double SVG_PAINTTYPE_UNKNOWN=SVGPaint__Constants.SVG_PAINTTYPE_UNKNOWN;
@JsOverlay
public static final double SVG_PAINTTYPE_URI=SVGPaint__Constants.SVG_PAINTTYPE_URI;
@JsOverlay
public static final double SVG_PAINTTYPE_URI_CURRENTCOLOR=SVGPaint__Constants.SVG_PAINTTYPE_URI_CURRENTCOLOR;
@JsOverlay
public static final double SVG_PAINTTYPE_URI_NONE=SVGPaint__Constants.SVG_PAINTTYPE_URI_NONE;
@JsOverlay
public static final double SVG_PAINTTYPE_URI_RGBCOLOR=SVGPaint__Constants.SVG_PAINTTYPE_URI_RGBCOLOR;
@JsOverlay
public static final double SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR=SVGPaint__Constants.SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR;
public double paintType;
public String uri;
public native void setPaint(double paintType,String uri,String rgbColor,String iccColor);
public native void setUri(String uri);
}
