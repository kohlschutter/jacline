package elemental2.svg;
import elemental2.svg.SVGElement;
import elemental2.dom.DOMRect;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedTransformList;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGGraphicsElement extends SVGElement{
public SVGAnimatedTransformList transform;
public native DOMRect getBBox();
public native JsObject getCTM();
public native JsObject getScreenCTM();
}
