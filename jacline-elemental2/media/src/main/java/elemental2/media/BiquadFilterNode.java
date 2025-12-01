package elemental2.media;
import org.jspecify.annotations.Nullable;
import elemental2.media.AudioParam;
import elemental2.media.AudioNode;
import elemental2.core.Float32Array;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class BiquadFilterNode extends AudioNode{
public AudioParam Q;
public AudioParam detune;
public AudioParam frequency;
public AudioParam gain;
public String type;
public native void getFrequencyResponse(@Nullable Float32Array frequencyHz,@Nullable Float32Array magResponse,@Nullable Float32Array phaseResponse);
}
