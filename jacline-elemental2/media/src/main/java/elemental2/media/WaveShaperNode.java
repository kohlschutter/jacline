package elemental2.media;
import org.jspecify.annotations.Nullable;
import elemental2.media.AudioNode;
import elemental2.core.Float32Array;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WaveShaperNode extends AudioNode{
public @Nullable Float32Array curve;
public String oversample;
}
