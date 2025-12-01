package elemental2.dom;
import elemental2.dom.HTMLFormElement;
import org.jspecify.annotations.Nullable;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLOptionElement extends HTMLElement{
public boolean defaultSelected;
public boolean disabled;
public @Nullable HTMLFormElement form;
public int index;
public String label;
public boolean selected;
public String text;
public String value;
}
