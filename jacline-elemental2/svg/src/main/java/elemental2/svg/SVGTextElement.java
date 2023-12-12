package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGMatrix;
import elemental2.svg.SVGTransformable;
import elemental2.svg.SVGTextPositioningElement;
import elemental2.svg.SVGElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedTransformList;
import elemental2.svg.SVGRect;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGTextElement extends SVGTextPositioningElement implements SVGTransformable{
public SVGElement farthestViewportElement;
public SVGElement nearestViewportElement;
public SVGAnimatedTransformList transform;
public native SVGRect getBBox();
public native SVGMatrix getCTM();
@JsProperty
public native SVGElement getFarthestViewportElement();
@JsProperty
public native SVGElement getNearestViewportElement();
public native SVGMatrix getScreenCTM();
@JsProperty
public native SVGAnimatedTransformList getTransform();
public native SVGMatrix getTransformToElement();
public native SVGMatrix getTransformToElement(SVGElement element);
@JsProperty
public native void setFarthestViewportElement(SVGElement farthestViewportElement);
@JsProperty
public native void setNearestViewportElement(SVGElement nearestViewportElement);
@JsProperty
public native void setTransform(SVGAnimatedTransformList transform);
}
