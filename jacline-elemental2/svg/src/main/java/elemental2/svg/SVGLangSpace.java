package elemental2.svg;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGLangSpace{
@JsProperty
String getXmllang();
@JsProperty
String getXmlspace();
@JsProperty
void setXmllang(String xmllang);
@JsProperty
void setXmlspace(String xmlspace);
}
