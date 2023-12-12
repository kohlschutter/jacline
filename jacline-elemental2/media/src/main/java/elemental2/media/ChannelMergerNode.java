package elemental2.media;
import elemental2.media.ChannelMergerOptions;
import elemental2.media.AudioNode;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ChannelMergerNode extends AudioNode{
public ChannelMergerNode(BaseAudioContext context,ChannelMergerOptions options){}
public ChannelMergerNode(BaseAudioContext context){}
}
