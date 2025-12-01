package elemental2.dom;
import elemental2.dom.HTMLFormElement;
import org.jspecify.annotations.Nullable;
import elemental2.dom.ValidityState;
import elemental2.dom.HTMLCollection;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLFieldSetElement extends HTMLElement{
public boolean disabled;
public @Nullable HTMLCollection elements;
public @Nullable HTMLFormElement form;
public String name;
public String type;
public String validationMessage;
public @Nullable ValidityState validity;
public boolean willValidate;
public native boolean checkValidity();
public native void setCustomValidity(String message);
}
