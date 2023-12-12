package elemental2.media;
import java.lang.Deprecated;
import elemental2.media.ChannelMergerOptions;
import elemental2.media.ChannelMergerNode;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@Deprecated
public class AudioChannelMerger extends ChannelMergerNode{
public AudioChannelMerger(){
// This super call is here only for the code to compile; it is never executed.
super((BaseAudioContext)null,(ChannelMergerOptions)null);
}
}
