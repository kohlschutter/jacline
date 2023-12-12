package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGMatrix;
import elemental2.svg.SVGElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGRect;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGLocatable{
SVGRect getBBox();
SVGMatrix getCTM();
@JsProperty
SVGElement getFarthestViewportElement();
@JsProperty
SVGElement getNearestViewportElement();
SVGMatrix getScreenCTM();
SVGMatrix getTransformToElement();
SVGMatrix getTransformToElement(SVGElement element);
@JsProperty
void setFarthestViewportElement(SVGElement farthestViewportElement);
@JsProperty
void setNearestViewportElement(SVGElement nearestViewportElement);
}
