package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCOfferOptions{
@JsOverlay
static RTCOfferOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isIceRestart();
@JsProperty
boolean isOfferToReceiveAudio();
@JsProperty
boolean isOfferToReceiveVideo();
@JsProperty
void setIceRestart(boolean iceRestart);
@JsProperty
void setOfferToReceiveAudio(boolean offerToReceiveAudio);
@JsProperty
void setOfferToReceiveVideo(boolean offerToReceiveVideo);
}
