package elemental2.media;
import elemental2.core.Transferable;
import elemental2.dom.Event;
import elemental2.core.JsArray;
import elemental2.media.AudioParam;
import jsinterop.base.Js;
import elemental2.media.AudioWorkerParamDescriptor;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.media.AudioWorkerNode;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorker{
@JsFunction
public interface OnloadedFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnmessageFn{
Object onInvoke(Event p0);
}
public AudioWorker.OnloadedFn onloaded;
public AudioWorker.OnmessageFn onmessage;
public JsArray<AudioWorkerParamDescriptor> parameters;
public native AudioParam addParameter(String name,double defaultValue);
public native AudioWorkerNode createNode(double numberOfInputs,double numberOfOutputs);
public native Object postMessage(Object message,JsArray<Transferable> transfer);
@JsOverlay
public final Object postMessage(Object message,Transferable[] transfer){
return postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
public native Object postMessage(Object message);
public native Object removeParameter(String name);
public native Object terminate();
}
