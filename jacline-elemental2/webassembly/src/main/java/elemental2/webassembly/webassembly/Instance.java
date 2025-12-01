package elemental2.webassembly.webassembly;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.webassembly.webassembly.Module;
import elemental2.core.JsObject;
@JsType(isNative = true,name = "WebAssembly.Instance",namespace = JsPackage.GLOBAL)
public class Instance{
public @Nullable Object exports;
public Instance(Module moduleObject,@Nullable JsObject importObject){}
public Instance(Module moduleObject,@Nullable Object importObject){}
public Instance(Module moduleObject){}
}
