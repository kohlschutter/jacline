package elemental2.dom;
import elemental2.dom.Element;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ResizeObserverCallback;
import elemental2.dom.ResizeObserverOptions;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ResizeObserver{
public ResizeObserver(ResizeObserverCallback callback){}
public native void disconnect();
public native void observe(Element target,ResizeObserverOptions options);
public native void observe(Element target);
public native void unobserve(Element target);
}
