package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGGlyphRefElement extends SVGElement implements SVGStylable, SVGURIReference{
public double dx;
public double dy;
public String format;
public String glyphRef;
public SVGAnimatedString href;
public double x;
public double y;
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedString getHref();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setHref(SVGAnimatedString href);
}
