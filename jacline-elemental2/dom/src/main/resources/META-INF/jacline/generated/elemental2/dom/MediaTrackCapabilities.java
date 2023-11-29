package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.MediaSettingsRange;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaTrackCapabilities{
@JsProperty
double getAspectRatio();
@JsProperty
MediaSettingsRange getBrightness();
@JsProperty
double getChannelCount();
@JsProperty
MediaSettingsRange getColorTemperature();
@JsProperty
MediaSettingsRange getContrast();
@JsProperty
String getDeviceId();
@JsProperty
JsArray<Boolean> getEchoCancellation();
@JsProperty
MediaSettingsRange getExposureCompensation();
@JsProperty
JsArray<String> getExposureMode();
@JsProperty
JsArray<String> getFacingMode();
@JsProperty
JsArray<String> getFocusMode();
@JsProperty
double getFrameRate();
@JsProperty
String getGroupId();
@JsProperty
double getHeight();
@JsProperty
MediaSettingsRange getIso();
@JsProperty
double getLatency();
@JsProperty
JsArray<String> getResizeMode();
@JsProperty
double getSampleRate();
@JsProperty
int getSampleSize();
@JsProperty
MediaSettingsRange getSaturation();
@JsProperty
MediaSettingsRange getSharpness();
@JsProperty
double getVolume();
@JsProperty
JsArray<String> getWhiteBalanceMode();
@JsProperty
double getWidth();
@JsProperty
MediaSettingsRange getZoom();
@JsProperty
boolean isTorch();
@JsProperty
void setAspectRatio(double aspectRatio);
@JsProperty
void setBrightness(MediaSettingsRange brightness);
@JsProperty
void setChannelCount(double channelCount);
@JsProperty
void setColorTemperature(MediaSettingsRange colorTemperature);
@JsProperty
void setContrast(MediaSettingsRange contrast);
@JsProperty
void setDeviceId(String deviceId);
@JsProperty
void setEchoCancellation(JsArray<Boolean> echoCancellation);
@JsOverlay
default void setEchoCancellation(boolean[] echoCancellation){
setEchoCancellation(Js.<JsArray<Boolean>>uncheckedCast(echoCancellation));
}
@JsProperty
void setExposureCompensation(MediaSettingsRange exposureCompensation);
@JsProperty
void setExposureMode(JsArray<String> exposureMode);
@JsOverlay
default void setExposureMode(String[] exposureMode){
setExposureMode(Js.<JsArray<String>>uncheckedCast(exposureMode));
}
@JsProperty
void setFacingMode(JsArray<String> facingMode);
@JsOverlay
default void setFacingMode(String[] facingMode){
setFacingMode(Js.<JsArray<String>>uncheckedCast(facingMode));
}
@JsProperty
void setFocusMode(JsArray<String> focusMode);
@JsOverlay
default void setFocusMode(String[] focusMode){
setFocusMode(Js.<JsArray<String>>uncheckedCast(focusMode));
}
@JsProperty
void setFrameRate(double frameRate);
@JsProperty
void setGroupId(String groupId);
@JsProperty
void setHeight(double height);
@JsProperty
void setIso(MediaSettingsRange iso);
@JsProperty
void setLatency(double latency);
@JsProperty
void setResizeMode(JsArray<String> resizeMode);
@JsOverlay
default void setResizeMode(String[] resizeMode){
setResizeMode(Js.<JsArray<String>>uncheckedCast(resizeMode));
}
@JsProperty
void setSampleRate(double sampleRate);
@JsProperty
void setSampleSize(int sampleSize);
@JsProperty
void setSaturation(MediaSettingsRange saturation);
@JsProperty
void setSharpness(MediaSettingsRange sharpness);
@JsProperty
void setTorch(boolean torch);
@JsProperty
void setVolume(double volume);
@JsProperty
void setWhiteBalanceMode(JsArray<String> whiteBalanceMode);
@JsOverlay
default void setWhiteBalanceMode(String[] whiteBalanceMode){
setWhiteBalanceMode(Js.<JsArray<String>>uncheckedCast(whiteBalanceMode));
}
@JsProperty
void setWidth(double width);
@JsProperty
void setZoom(MediaSettingsRange zoom);
}
