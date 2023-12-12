package elemental2.webassembly.webassembly;
import elemental2.webassembly.MemoryDescriptor;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,name = "WebAssembly.Memory",namespace = JsPackage.GLOBAL)
public class Memory{
public ArrayBuffer buffer;
public Memory(MemoryDescriptor memoryDescriptor){}
public native int grow(int delta);
}
