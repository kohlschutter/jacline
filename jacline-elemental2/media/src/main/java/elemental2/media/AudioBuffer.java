package elemental2.media;
import org.jspecify.annotations.Nullable;
import java.lang.Deprecated;
import elemental2.media.AudioGain;
import elemental2.core.Float32Array;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioBuffer{
public double duration;
@Deprecated
public AudioGain gain;
public int length;
public int numberOfChannels;
public double sampleRate;
public native @Nullable Object copyFromChannel(Float32Array destination,int channelNumber,int startInChannel);
public native @Nullable Object copyFromChannel(Float32Array destination,int channelNumber);
public native @Nullable Object copyToChannel(Float32Array source,int channelNumber,int startInChannel);
public native @Nullable Object copyToChannel(Float32Array source,int channelNumber);
public native Float32Array getChannelData(int channel);
}
