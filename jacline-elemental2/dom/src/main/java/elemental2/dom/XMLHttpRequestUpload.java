package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.XMLHttpRequestEventTarget;
import elemental2.dom.ProgressEvent;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XMLHttpRequestUpload extends XMLHttpRequestEventTarget{
@JsFunction
public interface OnprogressFn{
void onInvoke(ProgressEvent p0);
}
public XMLHttpRequestUpload.@Nullable OnprogressFn onprogress;
}
