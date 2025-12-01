package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.RTCReceivedRtpStreamStats;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCInboundRtpStreamStats extends RTCReceivedRtpStreamStats{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetEstimatedPlayoutTimestampUnionType{
@JsOverlay
static RTCInboundRtpStreamStats.@Nullable GetEstimatedPlayoutTimestampUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetLastPacketReceivedTimestampUnionType{
@JsOverlay
static RTCInboundRtpStreamStats.@Nullable GetLastPacketReceivedTimestampUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
}
@JsProperty
double getAudioLevel();
@JsProperty
double getBitrateMean();
@JsProperty
double getBytesReceived();
@JsProperty
double getConcealedSamples();
@JsProperty
double getConcealmentEvents();
@JsProperty
double getCorruptionMeasurements();
@JsProperty
String getDecoderImplementation();
@JsProperty
double getDelayedPacketOutageSamples();
@JsProperty
RTCInboundRtpStreamStats.@Nullable GetEstimatedPlayoutTimestampUnionType getEstimatedPlayoutTimestamp();
@JsProperty
double getFecPacketsDiscarded();
@JsProperty
double getFecPacketsReceived();
@JsProperty
int getFirCount();
@JsProperty
double getFractionLost();
@JsProperty
int getFrameHeight();
@JsProperty
int getFrameWidth();
@JsProperty
double getFramesAssembledFromMultiplePackets();
@JsProperty
int getFramesDecoded();
@JsProperty
double getFramesPerSecond();
@JsProperty
int getFramesReceived();
@JsProperty
int getFreezeCount();
@JsProperty
double getHeaderBytesReceived();
@JsProperty
double getInsertedSamplesForDeceleration();
@JsProperty
double getJitterBufferDelay();
@JsProperty
double getJitterBufferEmittedCount();
@JsProperty
double getJitterBufferFlushes();
@JsProperty
double getJitterBufferMinimumDelay();
@JsProperty
double getJitterBufferTargetDelay();
@JsProperty
int getKeyFramesDecoded();
@JsProperty
String getKind();
@JsProperty
RTCInboundRtpStreamStats.@Nullable GetLastPacketReceivedTimestampUnionType getLastPacketReceivedTimestamp();
@JsProperty
String getMid();
@JsProperty
int getNackCount();
@JsProperty
double getPacketsDiscarded();
@JsProperty
int getPliCount();
@JsProperty
double getQpSum();
@JsProperty
String getRemoteId();
@JsProperty
double getRemovedSamplesForAcceleration();
@JsProperty
double getSilentConcealedSamples();
@JsProperty
double getTotalAssemblyTime();
@JsProperty
double getTotalAudioEnergy();
@JsProperty
double getTotalCorruptionProbability();
@JsProperty
double getTotalDecodeTime();
@JsProperty
double getTotalFreezesDuration();
@JsProperty
double getTotalInterFrameDelay();
@JsProperty
double getTotalProcessingDelay();
@JsProperty
double getTotalSamplesDuration();
@JsProperty
double getTotalSamplesReceived();
@JsProperty
double getTotalSquaredCorruptionProbability();
@JsProperty
double getTotalSquaredInterFrameDelay();
@JsProperty
String getTrackId();
@JsProperty
String getTrackIdentifier();
}
