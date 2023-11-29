package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLMenuItemElement extends HTMLElement{
public boolean checked;
@JsProperty(name = "default")
public boolean default_;
public boolean disabled;
public String icon;
public String label;
public String radiogroup;
public String type;
}
