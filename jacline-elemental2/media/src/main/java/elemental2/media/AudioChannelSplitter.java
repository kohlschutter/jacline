package elemental2.media;
import java.lang.Deprecated;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.media.ChannelSplitterNode;
import elemental2.media.ChannelSplitterOptions;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@Deprecated
public class AudioChannelSplitter extends ChannelSplitterNode{
public AudioChannelSplitter(){
// This super call is here only for the code to compile; it is never executed.
super((BaseAudioContext)null,(ChannelSplitterOptions)null);
}
}
