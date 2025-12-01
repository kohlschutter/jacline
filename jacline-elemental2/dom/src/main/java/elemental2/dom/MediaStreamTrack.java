package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Void;
import elemental2.dom.MediaTrackConstraints;
import elemental2.dom.Event;
import jsinterop.annotations.JsMethod;
import elemental2.dom.MediaTrackSettings;
import elemental2.promise.Promise;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import elemental2.dom.MediaTrackCapabilities;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaStreamTrack implements EventTarget{
@JsFunction
public interface OnendedFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnmuteFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnoverconstrainedFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnunmuteFn{
@Nullable Object onInvoke(Event p0);
}
public String contentHint;
public boolean enabled;
public String id;
public String kind;
public String label;
public boolean muted;
public MediaStreamTrack.@Nullable OnendedFn onended;
public MediaStreamTrack.@Nullable OnmuteFn onmute;
public MediaStreamTrack.@Nullable OnoverconstrainedFn onoverconstrained;
public MediaStreamTrack.@Nullable OnunmuteFn onunmute;
public String readyState;
public boolean remote;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native Promise<Void> applyConstraints();
public native Promise<Void> applyConstraints(@Nullable MediaTrackConstraints constraints);
@JsMethod(name = "clone")
public native MediaStreamTrack clone_();
public native boolean dispatchEvent(Event evt);
public native MediaTrackCapabilities getCapabilities();
public native MediaTrackConstraints getConstraints();
public native MediaTrackSettings getSettings();
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void stop();
}
