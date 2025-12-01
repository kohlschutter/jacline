package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.BlobEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaRecorderEventMap{
@JsProperty
@Nullable BlobEvent getDataavailable();
@JsProperty
@Nullable Event getError();
@JsProperty
@Nullable Event getPause();
@JsProperty
@Nullable Event getResume();
@JsProperty
@Nullable Event getStart();
@JsProperty
@Nullable Event getStop();
@JsProperty
void setDataavailable(@Nullable BlobEvent dataavailable);
@JsProperty
void setError(@Nullable Event error);
@JsProperty
void setPause(@Nullable Event pause);
@JsProperty
void setResume(@Nullable Event resume);
@JsProperty
void setStart(@Nullable Event start);
@JsProperty
void setStop(@Nullable Event stop);
}
