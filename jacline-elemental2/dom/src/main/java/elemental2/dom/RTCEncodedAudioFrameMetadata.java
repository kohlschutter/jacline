package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCEncodedAudioFrameMetadata{
@JsProperty
@Nullable JsArray<Double> getContributingSources();
@JsProperty
double getPayloadType();
@JsProperty
double getSequenceNumber();
@JsProperty
double getSynchronizationSource();
@JsProperty
void setContributingSources(@Nullable JsArray<Double> contributingSources);
@JsOverlay
default void setContributingSources(double@Nullable [] contributingSources){
setContributingSources(Js.<@Nullable JsArray<Double>>uncheckedCast(contributingSources));
}
@JsProperty
void setPayloadType(double payloadType);
@JsProperty
void setSequenceNumber(double sequenceNumber);
@JsProperty
void setSynchronizationSource(double synchronizationSource);
}
