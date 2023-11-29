package elemental2.core;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ArrayBufferView{
public ArrayBuffer buffer;
public int byteLength;
public int byteOffset;
}
