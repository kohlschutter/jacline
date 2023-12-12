package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGDescElement extends SVGElement implements SVGLangSpace, SVGStylable{
public String xmllang;
public String xmlspace;
@JsProperty
public native SVGAnimatedString getClassName();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}
