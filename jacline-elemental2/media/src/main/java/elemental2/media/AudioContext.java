package elemental2.media;
import elemental2.media.GainNode;
import java.lang.Deprecated;
import elemental2.media.DelayNode;
import elemental2.media.MediaStreamAudioSourceNode;
import elemental2.media.MediaStreamAudioDestinationNode;
import elemental2.media.AudioContextOptions;
import elemental2.dom.MediaStream;
import elemental2.dom.HTMLMediaElement;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import elemental2.media.ScriptProcessorNode;
import jsinterop.annotations.JsPackage;
import elemental2.media.MediaElementAudioSourceNode;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioContext extends BaseAudioContext{
public double baseLatency;
public double outputLatency;
public AudioContext(){}
public AudioContext(AudioContextOptions contextOptions){}
@Deprecated
public native DelayNode createDelayNode();
@Deprecated
public native DelayNode createDelayNode(double maxDelayTime);
@Deprecated
public native GainNode createGainNode();
@Deprecated
public native ScriptProcessorNode createJavaScriptNode(int bufferSize,int numberOfInputs,int numberOfOuputs);
public native MediaElementAudioSourceNode createMediaElementSource(HTMLMediaElement mediaElement);
public native MediaStreamAudioDestinationNode createMediaStreamDestination();
public native MediaStreamAudioSourceNode createMediaStreamSource(MediaStream mediaStream);
}
