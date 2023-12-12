package elemental2.media;
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
public native Object start();
public native Object start(double when);
public native Object stop();
public native Object stop(double when);
}
