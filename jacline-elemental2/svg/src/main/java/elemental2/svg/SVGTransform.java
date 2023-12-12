package elemental2.svg;
import elemental2.svg.SVGMatrix;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGTransform{
@JsOverlay
public static final double SVG_TRANSFORM_MATRIX=SVGTransform__Constants.SVG_TRANSFORM_MATRIX;
@JsOverlay
public static final double SVG_TRANSFORM_ROTATE=SVGTransform__Constants.SVG_TRANSFORM_ROTATE;
@JsOverlay
public static final double SVG_TRANSFORM_SCALE=SVGTransform__Constants.SVG_TRANSFORM_SCALE;
@JsOverlay
public static final double SVG_TRANSFORM_SKEWX=SVGTransform__Constants.SVG_TRANSFORM_SKEWX;
@JsOverlay
public static final double SVG_TRANSFORM_SKEWY=SVGTransform__Constants.SVG_TRANSFORM_SKEWY;
@JsOverlay
public static final double SVG_TRANSFORM_TRANSLATE=SVGTransform__Constants.SVG_TRANSFORM_TRANSLATE;
@JsOverlay
public static final double SVG_TRANSFORM_UNKNOWN=SVGTransform__Constants.SVG_TRANSFORM_UNKNOWN;
public double angle;
public SVGMatrix matrix;
public int type;
public native void setMatrix(SVGMatrix matrix);
public native void setRotate(double angle,double cx,double cy);
public native void setScale(double sx,double sy);
public native void setSkewX(double angle);
public native void setSkewY(double angle);
public native void setTranslate(double tx,double ty);
}
