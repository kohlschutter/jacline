package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGStylable{
@JsProperty
SVGAnimatedString getClassName();
CSSValue getPresentationAttribute();
CSSValue getPresentationAttribute(String name);
@JsProperty
void setClassName(SVGAnimatedString className);
}
