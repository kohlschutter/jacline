package elemental2.media;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.core.Transferable;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorkerNodeProcessor{
@JsFunction
public interface OnmessageFn{
@Nullable Object onInvoke(Event p0);
}
public AudioWorkerNodeProcessor.@Nullable OnmessageFn onmessage;
public native @Nullable Object postMessage(@Nullable Object message,JsArray<Transferable> transfer);
@JsOverlay
public final @Nullable Object postMessage(@Nullable Object message,Transferable[] transfer){
return postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
public native @Nullable Object postMessage(@Nullable Object message);
}
