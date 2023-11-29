package elemental2.core;
import elemental2.core.JsError;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SyntaxError extends JsError{
public SyntaxError(){}
public SyntaxError(Object message,Object fileNameOrOptions,Object line){}
public SyntaxError(Object message,Object fileNameOrOptions){}
public SyntaxError(Object message){}
}
