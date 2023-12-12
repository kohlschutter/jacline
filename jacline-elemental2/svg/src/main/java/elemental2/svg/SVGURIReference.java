package elemental2.svg;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGURIReference{
@JsProperty
SVGAnimatedString getHref();
@JsProperty
void setHref(SVGAnimatedString href);
}
