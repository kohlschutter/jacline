package elemental2.dom;
import elemental2.dom.ResizeObserverEntry;
import jsinterop.base.Js;
import elemental2.dom.ResizeObserver;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.core.JsArray;
@JsFunction
public interface ResizeObserverCallback{
Object onInvoke(JsArray<ResizeObserverEntry> p0,ResizeObserver p1);
@JsOverlay
default Object onInvoke(ResizeObserverEntry[] p0,ResizeObserver p1){
return onInvoke(Js.<JsArray<ResizeObserverEntry>>uncheckedCast(p0),p1);
}
}
