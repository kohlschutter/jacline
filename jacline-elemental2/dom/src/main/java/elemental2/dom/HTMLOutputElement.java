package elemental2.dom;
import elemental2.dom.HTMLFormElement;
import elemental2.dom.ValidityState;
import elemental2.dom.DOMTokenList;
import elemental2.dom.HTMLElement;
import elemental2.dom.NodeList;
import elemental2.dom.HTMLLabelElement;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLOutputElement extends HTMLElement{
public String defaultValue;
public HTMLFormElement form;
public DOMTokenList htmlFor;
public NodeList<HTMLLabelElement> labels;
public String name;
public String type;
public String validationMessage;
public ValidityState validity;
public String value;
public boolean willValidate;
public native boolean checkValidity();
public native boolean reportValidity();
public native Object setCustomValidity(String message);
}
