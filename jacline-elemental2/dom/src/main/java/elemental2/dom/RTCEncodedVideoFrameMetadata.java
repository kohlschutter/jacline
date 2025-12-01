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
public interface RTCEncodedVideoFrameMetadata{
@JsProperty
@Nullable JsArray<Double> getContributingSources();
@JsProperty
@Nullable JsArray<Double> getDependencies();
@JsProperty
int getFrameId();
@JsProperty
int getHeight();
@JsProperty
int getPayloadType();
@JsProperty
int getSpatialIndex();
@JsProperty
double getSynchronizationSource();
@JsProperty
int getTemporalIndex();
@JsProperty
double getTimestamp();
@JsProperty
int getWidth();
@JsProperty
void setContributingSources(@Nullable JsArray<Double> contributingSources);
@JsOverlay
default void setContributingSources(double@Nullable [] contributingSources){
setContributingSources(Js.<@Nullable JsArray<Double>>uncheckedCast(contributingSources));
}
@JsProperty
void setDependencies(@Nullable JsArray<Double> dependencies);
@JsOverlay
default void setDependencies(double@Nullable [] dependencies){
setDependencies(Js.<@Nullable JsArray<Double>>uncheckedCast(dependencies));
}
@JsProperty
void setFrameId(int frameId);
@JsProperty
void setHeight(int height);
@JsProperty
void setPayloadType(int payloadType);
@JsProperty
void setSpatialIndex(int spatialIndex);
@JsProperty
void setSynchronizationSource(double synchronizationSource);
@JsProperty
void setTemporalIndex(int temporalIndex);
@JsProperty
void setTimestamp(double timestamp);
@JsProperty
void setWidth(int width);
}
