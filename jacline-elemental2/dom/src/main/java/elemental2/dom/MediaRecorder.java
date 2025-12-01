package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import elemental2.dom.EventTarget;
import elemental2.dom.MediaRecorderOptions;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsFunction;
import elemental2.dom.MediaStream;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaRecorder implements EventTarget{
@JsFunction
public interface OndataavailableFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnpauseFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnresumeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnstartFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnstopFn{
@Nullable Object onInvoke(Event p0);
}
public static native boolean isTypeSupported(String type);
public int audioBitsPerSecond;
public String mimeType;
public MediaRecorder.OndataavailableFn ondataavailable;
public MediaRecorder.OnerrorFn onerror;
public MediaRecorder.OnpauseFn onpause;
public MediaRecorder.OnresumeFn onresume;
public MediaRecorder.OnstartFn onstart;
public MediaRecorder.OnstopFn onstop;
public String state;
public MediaStream stream;
public int videoBitsPerSecond;
public MediaRecorder(MediaStream stream,@Nullable MediaRecorderOptions options){}
public MediaRecorder(MediaStream stream){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType useCapture);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void pause();
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType useCapture);
public native void removeEventListener(String type,EventListener listener);
public native void requestData();
public native void resume();
public native @Nullable Object start();
public native @Nullable Object start(int timeslice);
public native void stop();
}
