package elemental2.media;
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
public native void getFrequencyResponse(Float32Array frequencyHz,Float32Array magResponse,Float32Array phaseResponse);
}
