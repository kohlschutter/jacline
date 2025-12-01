package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMImplementation;
import java.lang.String;
import elemental2.dom.DOMImplementationList;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMImplementationSource{
public native @Nullable DOMImplementation getDOMImplementation(String features);
public native @Nullable DOMImplementationList getDOMImplementationList(String features);
}
