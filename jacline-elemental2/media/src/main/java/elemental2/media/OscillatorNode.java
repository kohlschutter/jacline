package elemental2.media;
import java.lang.Deprecated;
import elemental2.media.PeriodicWave;
import elemental2.dom.Event;
import elemental2.media.AudioNode;
import elemental2.media.AudioParam;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.media.WaveTable;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class OscillatorNode extends AudioNode{
@JsFunction
public interface OnendedFn{
Object onInvoke(Event p0);
}
public AudioParam detune;
public AudioParam frequency;
public OscillatorNode.OnendedFn onended;
@Deprecated
public double playbackState;
public String type;
public native Object setPeriodicWave(PeriodicWave periodicWave);
@Deprecated
public native Object setWaveTable(WaveTable waveTable);
public native Object start();
public native Object start(double when);
public native Object stop();
public native Object stop(double when);
}
