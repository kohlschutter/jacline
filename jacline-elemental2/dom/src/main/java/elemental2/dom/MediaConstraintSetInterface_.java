package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaConstraintSetInterface_{
@JsProperty(name = "DtlsSrtpKeyAgreement")
boolean isDtlsSrtpKeyAgreement();
@JsProperty(name = "OfferToReceiveAudio")
boolean isOfferToReceiveAudio();
@JsProperty(name = "OfferToReceiveVideo")
boolean isOfferToReceiveVideo();
@JsProperty(name = "RtpDataChannels")
boolean isRtpDataChannels();
@JsProperty(name = "DtlsSrtpKeyAgreement")
void setDtlsSrtpKeyAgreement(boolean DtlsSrtpKeyAgreement);
@JsProperty(name = "OfferToReceiveAudio")
void setOfferToReceiveAudio(boolean OfferToReceiveAudio);
@JsProperty(name = "OfferToReceiveVideo")
void setOfferToReceiveVideo(boolean OfferToReceiveVideo);
@JsProperty(name = "RtpDataChannels")
void setRtpDataChannels(boolean RtpDataChannels);
}
