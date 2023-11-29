package elemental2.dom;
import elemental2.dom.EventListener;
import elemental2.dom.Event;
import elemental2.dom.MediaQueryListListener;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaQueryList implements EventTarget{
public boolean matches;
public String media;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void addListener(MediaQueryListListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void removeListener(MediaQueryListListener listener);
}
