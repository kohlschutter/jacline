package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import elemental2.dom.TextTrackCue;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import elemental2.dom.TextTrackCueList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextTrack implements EventTarget{
@JsFunction
public interface OncuechangeFn{
@Nullable Object onInvoke(Event p0);
}
public @Nullable TextTrackCueList activeCues;
public @Nullable TextTrackCueList cues;
public String id;
public String inBandMetadataTrackDispatchType;
public String kind;
public String label;
public String language;
public String mode;
public TextTrack.@Nullable OncuechangeFn oncuechange;
public native void addCue(@Nullable TextTrackCue cue);
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType useCapture);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeCue(@Nullable TextTrackCue cue);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
