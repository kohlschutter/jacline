package elemental2.media;
import elemental2.media.AudioNode;
import elemental2.dom.MediaStream;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaStreamAudioDestinationNode extends AudioNode{
public MediaStream stream;
}
