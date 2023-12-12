package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGLocatable;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedTransformList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGTransformable extends SVGLocatable{
@JsProperty
SVGAnimatedTransformList getTransform();
@JsProperty
void setTransform(SVGAnimatedTransformList transform);
}
