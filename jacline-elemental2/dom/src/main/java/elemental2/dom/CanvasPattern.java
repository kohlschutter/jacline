package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMMatrixReadOnly;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CanvasPattern{
public native void setTransform(@Nullable DOMMatrixReadOnly matrix);
}
