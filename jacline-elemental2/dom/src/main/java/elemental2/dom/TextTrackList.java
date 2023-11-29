package elemental2.dom;
import elemental2.dom.EventListener;
import jsinterop.base.JsArrayLike;
import elemental2.dom.TextTrack;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextTrackList implements EventTarget, JsArrayLike<TextTrack>{
public int length;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType useCapture);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native TextTrack getTrackById(String id);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
