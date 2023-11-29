package elemental2.dom;
import elemental2.dom.EventListener;
import elemental2.dom.TextTrackCue;
import elemental2.dom.Event;
import elemental2.dom.TextTrackCueList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextTrack implements EventTarget{
public TextTrackCueList activeCues;
public TextTrackCueList cues;
public String mode;
public native void addCue(TextTrackCue cue);
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType useCapture);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeCue(TextTrackCue cue);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
