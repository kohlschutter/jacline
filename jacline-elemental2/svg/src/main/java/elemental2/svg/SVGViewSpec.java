package elemental2.svg;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGTransformList;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGAnimatedRect;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGZoomAndPan;
import elemental2.svg.SVGFitToViewBox;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGViewSpec implements SVGFitToViewBox, SVGZoomAndPan{
@JsOverlay
public static final double SVG_ZOOMANDPAN_DISABLE=SVGViewSpec__Constants.SVG_ZOOMANDPAN_DISABLE;
@JsOverlay
public static final double SVG_ZOOMANDPAN_MAGNIFY=SVGViewSpec__Constants.SVG_ZOOMANDPAN_MAGNIFY;
@JsOverlay
public static final double SVG_ZOOMANDPAN_UNKNOWN=SVGViewSpec__Constants.SVG_ZOOMANDPAN_UNKNOWN;
public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
public String preserveAspectRatioString;
public SVGTransformList transform;
public String transformString;
public SVGAnimatedRect viewBox;
public String viewBoxString;
public SVGElement viewTarget;
public String viewTargetString;
public double zoomAndPan;
@JsProperty
public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty
public native SVGAnimatedRect getViewBox();
@JsProperty
public native int getZoomAndPan();
@JsProperty
public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio preserveAspectRatio);
@JsProperty
public native void setViewBox(SVGAnimatedRect viewBox);
@JsProperty
public native void setZoomAndPan(int zoomAndPan);
}
