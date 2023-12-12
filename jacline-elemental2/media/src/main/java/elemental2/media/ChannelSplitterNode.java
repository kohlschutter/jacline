package elemental2.media;
import elemental2.media.AudioNode;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.media.ChannelSplitterOptions;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ChannelSplitterNode extends AudioNode{
public ChannelSplitterNode(BaseAudioContext context,ChannelSplitterOptions options){}
public ChannelSplitterNode(BaseAudioContext context){}
}
