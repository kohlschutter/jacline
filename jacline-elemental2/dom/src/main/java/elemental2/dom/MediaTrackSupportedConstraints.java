package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaTrackSupportedConstraints{
@JsProperty
boolean isAspectRatio();
@JsProperty
boolean isAutoGainControl();
@JsProperty
boolean isChannelCount();
@JsProperty
boolean isCursor();
@JsProperty
boolean isDeviceId();
@JsProperty
boolean isDisplaySurface();
@JsProperty
boolean isEchoCancellation();
@JsProperty
boolean isFacingMode();
@JsProperty
boolean isFrameRate();
@JsProperty
boolean isGroupId();
@JsProperty
boolean isHeight();
@JsProperty
boolean isLatency();
@JsProperty
boolean isLogicalSurface();
@JsProperty
boolean isNoiseSuppression();
@JsProperty
boolean isResizeMode();
@JsProperty
boolean isRestrictOwnAudio();
@JsProperty
boolean isSampleRate();
@JsProperty
boolean isSampleSize();
@JsProperty
boolean isSuppressLocalAudioPlayback();
@JsProperty
boolean isVolume();
@JsProperty
boolean isWidth();
@JsProperty
void setAspectRatio(boolean aspectRatio);
@JsProperty
void setAutoGainControl(boolean autoGainControl);
@JsProperty
void setChannelCount(boolean channelCount);
@JsProperty
void setCursor(boolean cursor);
@JsProperty
void setDeviceId(boolean deviceId);
@JsProperty
void setDisplaySurface(boolean displaySurface);
@JsProperty
void setEchoCancellation(boolean echoCancellation);
@JsProperty
void setFacingMode(boolean facingMode);
@JsProperty
void setFrameRate(boolean frameRate);
@JsProperty
void setGroupId(boolean groupId);
@JsProperty
void setHeight(boolean height);
@JsProperty
void setLatency(boolean latency);
@JsProperty
void setLogicalSurface(boolean logicalSurface);
@JsProperty
void setNoiseSuppression(boolean noiseSuppression);
@JsProperty
void setResizeMode(boolean resizeMode);
@JsProperty
void setRestrictOwnAudio(boolean restrictOwnAudio);
@JsProperty
void setSampleRate(boolean sampleRate);
@JsProperty
void setSampleSize(boolean sampleSize);
@JsProperty
void setSuppressLocalAudioPlayback(boolean suppressLocalAudioPlayback);
@JsProperty
void setVolume(boolean volume);
@JsProperty
void setWidth(boolean width);
}
