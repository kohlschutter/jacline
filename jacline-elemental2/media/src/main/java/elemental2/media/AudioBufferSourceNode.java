package elemental2.media;
import elemental2.media.AudioParam;
import jsinterop.annotations.JsFunction;
import java.lang.Deprecated;
import elemental2.dom.Event;
import elemental2.media.AudioNode;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.media.AudioBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioBufferSourceNode extends AudioNode{
@JsFunction
public interface OnendedFn{
void onInvoke(Event p0);
}
@Deprecated
public double FINISHED_STATE;
@Deprecated
public double PLAYING_STATE;
@Deprecated
public double SCHEDULED_STATE;
@Deprecated
public double UNSCHEDULED_STATE;
public AudioBuffer buffer;
public AudioParam detune;
@Deprecated
public double gain;
public boolean loop;
public double loopEnd;
public double loopStart;
public AudioBufferSourceNode.OnendedFn onended;
public AudioParam playbackRate;
@Deprecated
public double playbackState;
@Deprecated
public native Object noteGrainOn();
@Deprecated
public native Object noteGrainOn(double when,double offset,double duration);
@Deprecated
public native Object noteGrainOn(double when,double offset);
@Deprecated
public native Object noteGrainOn(double when);
@Deprecated
public native Object noteOff(double when);
@Deprecated
public native void noteOn(double when);
public native Object start();
public native Object start(double when,double offset,double duration);
public native Object start(double when,double offset);
public native Object start(double when);
public native Object stop();
public native Object stop(double when);
}
