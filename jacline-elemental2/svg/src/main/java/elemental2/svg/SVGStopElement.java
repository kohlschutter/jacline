package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGAnimatedNumber;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGStopElement extends SVGElement implements SVGStylable{
public SVGAnimatedNumber offset;
@JsProperty
public native SVGAnimatedString getClassName();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native void setClassName(SVGAnimatedString className);
}
