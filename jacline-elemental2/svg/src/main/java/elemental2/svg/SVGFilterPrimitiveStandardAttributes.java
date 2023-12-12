package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGStylable;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGFilterPrimitiveStandardAttributes extends SVGStylable{
@JsProperty
SVGAnimatedLength getHeight();
@JsProperty
SVGAnimatedString getResult();
@JsProperty
SVGAnimatedLength getWidth();
@JsProperty
SVGAnimatedLength getX();
@JsProperty
SVGAnimatedLength getY();
@JsProperty
void setHeight(SVGAnimatedLength height);
@JsProperty
void setResult(SVGAnimatedString result);
@JsProperty
void setWidth(SVGAnimatedLength width);
@JsProperty
void setX(SVGAnimatedLength x);
@JsProperty
void setY(SVGAnimatedLength y);
}
