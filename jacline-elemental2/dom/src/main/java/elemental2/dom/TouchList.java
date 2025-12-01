package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Touch;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TouchList implements JsArrayLike<Touch>{
public int length;
public native @Nullable Touch identifiedTouch(double identifier);
public native @Nullable Touch item(int index);
}
