package elemental2.webgl;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WEBGL_lose_context{
public native Object loseContext();
public native Object restoreContext();
}
