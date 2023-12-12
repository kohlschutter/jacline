package elemental2.media;
import elemental2.media.AudioNode;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.media.AudioBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ConvolverNode extends AudioNode{
public AudioBuffer buffer;
public boolean normalize;
}
