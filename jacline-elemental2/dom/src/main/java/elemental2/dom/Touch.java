package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.TouchInitDict;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Touch{
public double clientX;
public double clientY;
public double force;
public int identifier;
public double pageX;
public double pageY;
public double radiusX;
public double radiusY;
public double rotationAngle;
public double screenX;
public double screenY;
public @Nullable EventTarget target;
public Touch(TouchInitDict touchInitDict){}
}
