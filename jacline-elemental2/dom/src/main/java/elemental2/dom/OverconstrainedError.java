package elemental2.dom;
import elemental2.core.JsError;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class OverconstrainedError extends JsError{
public String constraint;
public OverconstrainedError(String constraint,String message){}
public OverconstrainedError(String constraint){}
}
