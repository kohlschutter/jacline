package elemental2.webassembly.webassembly;
import elemental2.webassembly.webassembly.Tag;
import elemental2.webassembly.WebAssemblyExceptionOptions;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,name = "WebAssembly.Exception",namespace = JsPackage.GLOBAL)
public class Exception{
public String stack;
public Exception(Tag tag,JsArray payload,WebAssemblyExceptionOptions options){}
public Exception(Tag tag,JsArray payload){}
}
