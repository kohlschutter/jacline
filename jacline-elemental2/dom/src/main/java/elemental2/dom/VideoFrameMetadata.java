package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface VideoFrameMetadata{
@JsOverlay
static VideoFrameMetadata create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getCaptureTime();
@JsProperty
double getExpectedDisplayTime();
@JsProperty
int getHeight();
@JsProperty
double getMediaTime();
@JsProperty
double getPresentationTime();
@JsProperty
int getPresentedFrames();
@JsProperty
double getProcessingDuration();
@JsProperty
double getReceiveTime();
@JsProperty
int getRtpTimestamp();
@JsProperty
int getWidth();
}
