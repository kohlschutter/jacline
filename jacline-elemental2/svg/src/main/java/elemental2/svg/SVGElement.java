package elemental2.svg;
import elemental2.dom.Element;
import elemental2.svg.SVGSVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGElement extends Element{
public SVGAnimatedString className;
public SVGSVGElement ownerSVGElement;
public int tabIndex;
public SVGElement viewportElement;
public String xmlbase;
}
