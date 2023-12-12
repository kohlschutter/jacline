package elemental2.media;
import elemental2.media.AudioNode;
import elemental2.core.Float32Array;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IIRFilterNode extends AudioNode{
public native void getFrequencyResponse(Float32Array frequencyHz,Float32Array magResponse,Float32Array phaseResponse);
}
