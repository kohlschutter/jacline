package elemental2.dom;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLParamElement extends HTMLElement{
public String name;
public String type;
public String value;
public String valueType;
}
