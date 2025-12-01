package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMError;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMErrorHandler{
public native boolean handleError(@Nullable DOMError error);
}
