package elemental2.dom;
import elemental2.dom.HTMLFormElement;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLLabelElement extends HTMLElement{
public String accessKey;
public @Nullable Element control;
public @Nullable HTMLFormElement form;
public String htmlFor;
}
