package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.RTCRtpReceiver;
import elemental2.dom.RTCRtpCodecCapability;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.RTCRtpSender;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpTransceiver{
@JsProperty
@Nullable String getCurrentDirection();
@JsProperty
String getDirection();
@JsProperty
@Nullable String getMid();
@JsProperty
@Nullable RTCRtpReceiver getReceiver();
@JsProperty
@Nullable RTCRtpSender getSender();
@JsProperty
boolean isStopped();
@Nullable Object setCodecPreferences(JsArray<RTCRtpCodecCapability> codecs);
@JsOverlay
default @Nullable Object setCodecPreferences(RTCRtpCodecCapability[] codecs){
return setCodecPreferences(Js.<JsArray<RTCRtpCodecCapability>>uncheckedCast(codecs));
}
@Nullable Object setDirection(String direction);
@Nullable Object stop();
}
