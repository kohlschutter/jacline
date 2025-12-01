package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import java.lang.Boolean;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaConstraintSetInterface_{
@JsProperty(name = "DtlsSrtpKeyAgreement")
@Nullable Boolean getDtlsSrtpKeyAgreement();
@JsProperty(name = "OfferToReceiveAudio")
@Nullable Boolean getOfferToReceiveAudio();
@JsProperty(name = "OfferToReceiveVideo")
@Nullable Boolean getOfferToReceiveVideo();
@JsProperty(name = "RtpDataChannels")
@Nullable Boolean getRtpDataChannels();
@JsProperty(name = "DtlsSrtpKeyAgreement")
void setDtlsSrtpKeyAgreement(@Nullable Boolean DtlsSrtpKeyAgreement);
@JsProperty(name = "OfferToReceiveAudio")
void setOfferToReceiveAudio(@Nullable Boolean OfferToReceiveAudio);
@JsProperty(name = "OfferToReceiveVideo")
void setOfferToReceiveVideo(@Nullable Boolean OfferToReceiveVideo);
@JsProperty(name = "RtpDataChannels")
void setRtpDataChannels(@Nullable Boolean RtpDataChannels);
}
