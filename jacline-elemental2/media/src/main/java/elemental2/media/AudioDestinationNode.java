package elemental2.media;
import java.lang.Deprecated;
import elemental2.media.AudioNode;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioDestinationNode extends AudioNode{
public double maxChannelCount;
@Deprecated
public double numberOfChannels;
}
