package elemental2.dom;
import elemental2.dom.HTMLFormElement;
import org.jspecify.annotations.Nullable;
import elemental2.dom.ValidityState;
import elemental2.dom.DOMTokenList;
import elemental2.dom.HTMLLabelElement;
import elemental2.dom.HTMLElement;
import elemental2.dom.NodeList;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLOutputElement extends HTMLElement{
public String defaultValue;
public @Nullable HTMLFormElement form;
public DOMTokenList htmlFor;
public @Nullable NodeList<HTMLLabelElement> labels;
public String name;
public String type;
public String validationMessage;
public @Nullable ValidityState validity;
public String value;
public boolean willValidate;
public native boolean checkValidity();
public native boolean reportValidity();
public native @Nullable Object setCustomValidity(String message);
}
