package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCMediaSourceStats;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCVideoSourceStats extends RTCMediaSourceStats{
@JsProperty
int getFrames();
@JsProperty
int getFramesPerSecond();
@JsProperty
int getHeight();
@JsProperty
int getWidth();
}
