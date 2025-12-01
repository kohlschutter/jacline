package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import java.lang.Boolean;
import java.lang.Object;
import elemental2.dom.RTCDTMFToneChangeEvent;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCDTMFSender{
@JsFunction
public interface OntonechangeFn{
@Nullable Object onInvoke(RTCDTMFToneChangeEvent p0);
}
@JsProperty
@Nullable Boolean getCanInsertDTMF();
@JsProperty
RTCDTMFSender.@Nullable OntonechangeFn getOntonechange();
@JsProperty
String getToneBuffer();
@Nullable Object insertDTMF(String tones,double duration,double interToneGap);
@Nullable Object insertDTMF(String tones,double duration);
@Nullable Object insertDTMF(String tones);
@JsProperty
void setCanInsertDTMF(@Nullable Boolean canInsertDTMF);
@JsProperty
void setOntonechange(RTCDTMFSender.@Nullable OntonechangeFn ontonechange);
}
