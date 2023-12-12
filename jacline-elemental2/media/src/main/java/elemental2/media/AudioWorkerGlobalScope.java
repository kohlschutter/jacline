package elemental2.media;
import elemental2.media.AudioParam;
import elemental2.media.AudioWorkerParamDescriptor;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorkerGlobalScope{
@JsFunction
public interface OnaudioprocessFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnnodecreateFn{
Object onInvoke(Event p0);
}
public AudioWorkerGlobalScope.OnaudioprocessFn onaudioprocess;
public AudioWorkerGlobalScope.OnnodecreateFn onnodecreate;
public JsArray<AudioWorkerParamDescriptor> parameters;
public double sampleRate;
public native AudioParam addParameter(String name,double defaultValue);
public native Object removeParameter(String name);
}
