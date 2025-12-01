package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.FormDataEvent;
import elemental2.dom.HTMLFormControlsCollection;
import jsinterop.annotations.JsFunction;
import elemental2.dom.HTMLElement;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLFormElement extends HTMLElement{
@JsFunction
public interface OnformdataFn{
@Nullable Object onInvoke(@Nullable FormDataEvent p0);
}
public String acceptCharset;
public String action;
public HTMLFormControlsCollection<HTMLElement> elements;
public String enctype;
public int length;
public String method;
public String name;
public boolean noValidate;
public HTMLFormElement.@Nullable OnformdataFn onformdata;
public String target;
public native boolean checkValidity();
public native boolean reportValidity();
public native @Nullable Object requestSubmit();
public native @Nullable Object requestSubmit(@Nullable HTMLElement submitter);
public native void reset();
public native void submit();
}
