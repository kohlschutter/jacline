package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCMediaSourceStats;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCAudioSourceStats extends RTCMediaSourceStats{
@JsProperty
double getAudioLevel();
@JsProperty
double getEchoReturnLoss();
@JsProperty
double getEchoReturnLossEnhancement();
@JsProperty
double getTotalAudioEnergy();
@JsProperty
double getTotalSamplesDuration();
}
