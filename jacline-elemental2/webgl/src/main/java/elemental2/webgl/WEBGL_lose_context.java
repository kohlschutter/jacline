package elemental2.webgl;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WEBGL_lose_context{
public native @Nullable Object loseContext();
public native @Nullable Object restoreContext();
}
