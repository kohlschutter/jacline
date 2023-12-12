package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGStyleElement extends SVGElement implements SVGLangSpace{
public boolean disabled;
public String media;
public String title;
public String type;
public String xmllang;
public String xmlspace;
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}
