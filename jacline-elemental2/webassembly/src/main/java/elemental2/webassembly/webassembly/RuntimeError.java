package elemental2.webassembly.webassembly;
import elemental2.core.JsError;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "WebAssembly.RuntimeError",namespace = JsPackage.GLOBAL)
public class RuntimeError extends JsError{
public RuntimeError(){}
public RuntimeError(String message,String fileName,int lineNumber){}
public RuntimeError(String message,String fileName){}
public RuntimeError(String message){}
}
