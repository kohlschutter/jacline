package elemental2.webassembly.webassembly;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.webassembly.webassembly.Module;
import elemental2.core.JsObject;
@JsType(isNative = true,name = "WebAssembly.Instance",namespace = JsPackage.GLOBAL)
public class Instance{
public Object exports;
public Instance(Module moduleObject,JsObject importObject){}
public Instance(Module moduleObject,Object importObject){}
public Instance(Module moduleObject){}
}
