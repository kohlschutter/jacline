package elemental2.core;
import elemental2.core.JsError;
import elemental2.core.JsIterable;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AggregateError extends JsError{
public JsArray<JsError> errors;
public String message;
public AggregateError(JsIterable<Object> errors,String message){}
}
