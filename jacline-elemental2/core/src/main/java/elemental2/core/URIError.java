package elemental2.core;
import elemental2.core.JsError;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class URIError extends JsError{
public URIError(){}
public URIError(Object message,Object fileNameOrOptions,Object line){}
public URIError(Object message,Object fileNameOrOptions){}
public URIError(Object message){}
}
