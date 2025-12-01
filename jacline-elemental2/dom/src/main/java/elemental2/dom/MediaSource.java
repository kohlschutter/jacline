package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.EventListener;
import elemental2.dom.SourceBuffer;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaSource implements EventTarget{
public static native boolean isTypeSupported(String type);
public @Nullable JsArray<@Nullable SourceBuffer> activeSourceBuffers;
public double duration;
public String readyState;
public @Nullable JsArray<@Nullable SourceBuffer> sourceBuffers;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native @Nullable SourceBuffer addSourceBuffer(String type);
public native void clearLiveSeekableRange();
public native boolean dispatchEvent(Event evt);
public native void endOfStream();
public native void endOfStream(String error);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void removeSourceBuffer(@Nullable SourceBuffer sourceBuffer);
public native @Nullable Object setLiveSeekableRange(double start,double end);
}
