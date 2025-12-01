package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaKeySystemMediaCapability;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaKeySystemConfiguration{
@JsOverlay
static MediaKeySystemConfiguration create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<MediaKeySystemMediaCapability> getAudioCapabilities();
@JsProperty
String getDistinctiveIdentifier();
@JsProperty
JsArray<String> getInitDataTypes();
@JsProperty
String getLabel();
@JsProperty
String getPersistentState();
@JsProperty
JsArray<String> getSessionTypes();
@JsProperty
JsArray<MediaKeySystemMediaCapability> getVideoCapabilities();
@JsProperty
void setAudioCapabilities(JsArray<MediaKeySystemMediaCapability> audioCapabilities);
@JsOverlay
default void setAudioCapabilities(MediaKeySystemMediaCapability[] audioCapabilities){
setAudioCapabilities(Js.<JsArray<MediaKeySystemMediaCapability>>uncheckedCast(audioCapabilities));
}
@JsProperty
void setDistinctiveIdentifier(String distinctiveIdentifier);
@JsProperty
void setInitDataTypes(JsArray<String> initDataTypes);
@JsOverlay
default void setInitDataTypes(String[] initDataTypes){
setInitDataTypes(Js.<JsArray<String>>uncheckedCast(initDataTypes));
}
@JsProperty
void setLabel(String label);
@JsProperty
void setPersistentState(String persistentState);
@JsProperty
void setSessionTypes(JsArray<String> sessionTypes);
@JsOverlay
default void setSessionTypes(String[] sessionTypes){
setSessionTypes(Js.<JsArray<String>>uncheckedCast(sessionTypes));
}
@JsProperty
void setVideoCapabilities(JsArray<MediaKeySystemMediaCapability> videoCapabilities);
@JsOverlay
default void setVideoCapabilities(MediaKeySystemMediaCapability[] videoCapabilities){
setVideoCapabilities(Js.<JsArray<MediaKeySystemMediaCapability>>uncheckedCast(videoCapabilities));
}
}
