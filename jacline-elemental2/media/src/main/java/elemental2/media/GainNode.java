package elemental2.media;
import elemental2.media.AudioParam;
import elemental2.media.AudioNode;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class GainNode extends AudioNode{
public AudioParam gain;
}
