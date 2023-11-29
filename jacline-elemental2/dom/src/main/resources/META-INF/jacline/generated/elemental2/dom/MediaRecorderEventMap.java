package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.Event;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.BlobEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaRecorderEventMap{
@JsProperty
BlobEvent getDataavailable();
@JsProperty
Event getError();
@JsProperty
Event getPause();
@JsProperty
Event getResume();
@JsProperty
Event getStart();
@JsProperty
Event getStop();
@JsProperty
void setDataavailable(BlobEvent dataavailable);
@JsProperty
void setError(Event error);
@JsProperty
void setPause(Event pause);
@JsProperty
void setResume(Event resume);
@JsProperty
void setStart(Event start);
@JsProperty
void setStop(Event stop);
}
