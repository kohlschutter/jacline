package elemental2.media;
import org.jspecify.annotations.Nullable;
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
public native @Nullable Object getByteFrequencyData(Uint8Array array);
public native @Nullable Object getByteTimeDomainData(Uint8Array array);
public native @Nullable Object getFloatFrequencyData(Float32Array array);
public native @Nullable Object getFloatTimeDomainData(Float32Array array);
}
