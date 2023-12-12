package elemental2.media;
import elemental2.media.WorkletGlobalScope;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorkletGlobalScope implements WorkletGlobalScope{
@JsFunction
public interface RegisterProcessorProcessorCtorFn{
Object onInvoke();
}
public double currentFrame;
public double currentTime;
public double sampleRate;
public native Object registerProcessor(String name,AudioWorkletGlobalScope.RegisterProcessorProcessorCtorFn processorCtor);
}
