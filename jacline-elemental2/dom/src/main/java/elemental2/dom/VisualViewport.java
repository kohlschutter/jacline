package elemental2.dom;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class VisualViewport implements EventTarget{
@JsFunction
public interface OnresizeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnscrollFn{
Object onInvoke(Event p0);
}
public double height;
public double offsetLeft;
public double offsetTop;
public VisualViewport.OnresizeFn onresize;
public VisualViewport.OnscrollFn onscroll;
public double pageLeft;
public double pageTop;
public double scale;
public double width;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
