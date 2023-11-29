package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import elemental2.dom.RTCDTMFToneChangeEvent;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCDTMFSender{
@JsFunction
public interface OntonechangeFn{
Object onInvoke(RTCDTMFToneChangeEvent p0);
}
@JsProperty
RTCDTMFSender.OntonechangeFn getOntonechange();
@JsProperty
String getToneBuffer();
Object insertDTMF(String tones,double duration,double interToneGap);
Object insertDTMF(String tones,double duration);
Object insertDTMF(String tones);
@JsProperty
boolean isCanInsertDTMF();
@JsProperty
void setCanInsertDTMF(boolean canInsertDTMF);
@JsProperty
void setOntonechange(RTCDTMFSender.OntonechangeFn ontonechange);
}
