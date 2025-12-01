package elemental2.media;
import org.jspecify.annotations.Nullable;
import elemental2.media.AudioParam;
import elemental2.media.ConstantSourceOptions;
import elemental2.media.AudioNode;
import java.lang.Object;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ConstantSourceNode extends AudioNode{
public AudioParam offset;
public ConstantSourceNode(BaseAudioContext context,ConstantSourceOptions options){}
public ConstantSourceNode(BaseAudioContext context){}
public native @Nullable Object start();
public native @Nullable Object start(double when);
public native @Nullable Object stop();
public native @Nullable Object stop(double when);
}
