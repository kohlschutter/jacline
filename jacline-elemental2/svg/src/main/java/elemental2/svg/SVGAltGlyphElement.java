package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGTextPositioningElement;
import elemental2.svg.SVGURIReference;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGAltGlyphElement extends SVGTextPositioningElement implements SVGURIReference{
public String format;
public String glyphRef;
public SVGAnimatedString href;
@JsProperty
public native SVGAnimatedString getHref();
@JsProperty
public native void setHref(SVGAnimatedString href);
}
