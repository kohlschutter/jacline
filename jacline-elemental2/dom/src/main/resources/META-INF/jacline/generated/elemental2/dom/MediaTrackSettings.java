package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaTrackSettings{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PointsOfInterestFieldType{
@JsOverlay
static MediaTrackSettings.PointsOfInterestFieldType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getX();
@JsProperty
double getY();
@JsProperty
void setX(double x);
@JsProperty
void setY(double y);
}
@JsProperty
double getAspectRatio();
@JsProperty
double getBrightness();
@JsProperty
double getChannelCount();
@JsProperty
double getColorTemperature();
@JsProperty
double getContrast();
@JsProperty
String getDeviceId();
@JsProperty
double getExposureCompensation();
@JsProperty
String getExposureMode();
@JsProperty
String getFacingMode();
@JsProperty
String getFocusMode();
@JsProperty
double getFrameRate();
@JsProperty
String getGroupId();
@JsProperty
int getHeight();
@JsProperty
double getIso();
@JsProperty
double getLatency();
@JsProperty
JsArray<MediaTrackSettings.PointsOfInterestFieldType> getPointsOfInterest();
@JsProperty
String getResizeMode();
@JsProperty
double getSampleRate();
@JsProperty
int getSampleSize();
@JsProperty
double getSaturation();
@JsProperty
double getSharpness();
@JsProperty
double getVolume();
@JsProperty
String getWhiteBalanceMode();
@JsProperty
int getWidth();
@JsProperty
double getZoom();
@JsProperty
boolean isAutoGainControl();
@JsProperty
boolean isEchoCancellation();
@JsProperty
boolean isNoiseSuppression();
@JsProperty
boolean isTorch();
@JsProperty
void setAspectRatio(double aspectRatio);
@JsProperty
void setAutoGainControl(boolean autoGainControl);
@JsProperty
void setBrightness(double brightness);
@JsProperty
void setChannelCount(double channelCount);
@JsProperty
void setColorTemperature(double colorTemperature);
@JsProperty
void setContrast(double contrast);
@JsProperty
void setDeviceId(String deviceId);
@JsProperty
void setEchoCancellation(boolean echoCancellation);
@JsProperty
void setExposureCompensation(double exposureCompensation);
@JsProperty
void setExposureMode(String exposureMode);
@JsProperty
void setFacingMode(String facingMode);
@JsProperty
void setFocusMode(String focusMode);
@JsProperty
void setFrameRate(double frameRate);
@JsProperty
void setGroupId(String groupId);
@JsProperty
void setHeight(int height);
@JsProperty
void setIso(double iso);
@JsProperty
void setLatency(double latency);
@JsProperty
void setNoiseSuppression(boolean noiseSuppression);
@JsProperty
void setPointsOfInterest(JsArray<MediaTrackSettings.PointsOfInterestFieldType> pointsOfInterest);
@JsOverlay
default void setPointsOfInterest(MediaTrackSettings.PointsOfInterestFieldType[] pointsOfInterest){
setPointsOfInterest(Js.<JsArray<MediaTrackSettings.PointsOfInterestFieldType>>uncheckedCast(pointsOfInterest));
}
@JsProperty
void setResizeMode(String resizeMode);
@JsProperty
void setSampleRate(double sampleRate);
@JsProperty
void setSampleSize(int sampleSize);
@JsProperty
void setSaturation(double saturation);
@JsProperty
void setSharpness(double sharpness);
@JsProperty
void setTorch(boolean torch);
@JsProperty
void setVolume(double volume);
@JsProperty
void setWhiteBalanceMode(String whiteBalanceMode);
@JsProperty
void setWidth(int width);
@JsProperty
void setZoom(double zoom);
}
