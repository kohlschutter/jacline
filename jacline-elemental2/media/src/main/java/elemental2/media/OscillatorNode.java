package elemental2.media;
import org.jspecify.annotations.Nullable;
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
@Nullable Object onInvoke(Event p0);
}
public AudioParam detune;
public AudioParam frequency;
public OscillatorNode.@Nullable OnendedFn onended;
@Deprecated
public double playbackState;
public String type;
public native @Nullable Object setPeriodicWave(PeriodicWave periodicWave);
@Deprecated
public native @Nullable Object setWaveTable(WaveTable waveTable);
public native @Nullable Object start();
public native @Nullable Object start(double when);
public native @Nullable Object stop();
public native @Nullable Object stop(double when);
}
