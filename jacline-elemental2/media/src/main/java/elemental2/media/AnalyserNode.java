package elemental2.media;
import elemental2.core.Uint8Array;
import elemental2.media.AudioNode;
import elemental2.core.Float32Array;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AnalyserNode extends AudioNode{
public int fftSize;
public int frequencyBinCount;
public double maxDecibels;
public double minDecibels;
public double smoothingTimeConstant;
public native Object getByteFrequencyData(Uint8Array array);
public native Object getByteTimeDomainData(Uint8Array array);
public native Object getFloatFrequencyData(Float32Array array);
public native Object getFloatTimeDomainData(Float32Array array);
}
