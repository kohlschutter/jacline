package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGAnimatedRect;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGFitToViewBox{
@JsProperty
SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty
SVGAnimatedRect getViewBox();
@JsProperty
void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio preserveAspectRatio);
@JsProperty
void setViewBox(SVGAnimatedRect viewBox);
}
