package elemental2.svg;
import elemental2.svg.SVGStringList;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGAnimatedRect;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import elemental2.svg.SVGZoomAndPan;
import elemental2.svg.SVGFitToViewBox;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGViewElement extends SVGElement implements SVGExternalResourcesRequired, SVGFitToViewBox, SVGZoomAndPan{
@JsOverlay
public static final double SVG_ZOOMANDPAN_DISABLE=SVGViewElement__Constants.SVG_ZOOMANDPAN_DISABLE;
@JsOverlay
public static final double SVG_ZOOMANDPAN_MAGNIFY=SVGViewElement__Constants.SVG_ZOOMANDPAN_MAGNIFY;
@JsOverlay
public static final double SVG_ZOOMANDPAN_UNKNOWN=SVGViewElement__Constants.SVG_ZOOMANDPAN_UNKNOWN;
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
public SVGAnimatedRect viewBox;
public SVGStringList viewTarget;
public double zoomAndPan;
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty
public native SVGAnimatedRect getViewBox();
@JsProperty
public native int getZoomAndPan();
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio preserveAspectRatio);
@JsProperty
public native void setViewBox(SVGAnimatedRect viewBox);
@JsProperty
public native void setZoomAndPan(int zoomAndPan);
}
