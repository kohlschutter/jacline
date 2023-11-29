package elemental2.dom;
import elemental2.dom.AbortSignal;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AbortController{
public AbortSignal signal;
public native void abort();
public native void abort(Object reason);
}
