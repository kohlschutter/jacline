package elemental2.media;
import elemental2.media.AudioParam;
import elemental2.media.AudioNode;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DynamicsCompressorNode extends AudioNode{
public AudioParam attack;
public AudioParam knee;
public AudioParam ratio;
public double reduction;
public AudioParam release;
public AudioParam threshold;
}
