package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCSentRtpStreamStats;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCOutboundRtpStreamStats extends RTCSentRtpStreamStats{
@JsProperty
double getBitrateMean();
@JsProperty
String getContentType();
@JsProperty
String getEncoderImplementation();
@JsProperty
int getFirCount();
@JsProperty
int getFrameHeight();
@JsProperty
int getFrameWidth();
@JsProperty
int getFramesEncoded();
@JsProperty
double getFramesPerSecond();
@JsProperty
double getFramesSent();
@JsProperty
double getHeaderBytesSent();
@JsProperty
double getHugeFramesSent();
@JsProperty
double getKeyFramesEncoded();
@JsProperty
String getMediaSourceId();
@JsProperty
String getMid();
@JsProperty
int getNackCount();
@JsProperty
int getPliCount();
@JsProperty
double getQpSum();
@JsProperty
JsObject getQualityLimitationDurations();
@JsProperty
String getQualityLimitationReason();
@JsProperty
double getQualityLimitationResolutionChanges();
@JsProperty
String getRemoteId();
@JsProperty
double getRetransmittedBytesSent();
@JsProperty
double getRetransmittedPacketsSent();
@JsProperty
String getRid();
@JsProperty
double getTargetBitrate();
@JsProperty
double getTotalEncodeTime();
@JsProperty
double getTotalEncodedBytesTarget();
@JsProperty
double getTotalPacketSendDelay();
@JsProperty
String getTrackId();
@JsProperty
boolean isActive();
}
