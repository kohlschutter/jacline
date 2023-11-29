package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CanvasGradient{
public native void addColorStop(double offset,String color);
}
