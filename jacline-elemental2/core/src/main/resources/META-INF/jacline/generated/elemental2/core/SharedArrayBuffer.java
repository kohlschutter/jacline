package elemental2.core;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SharedArrayBuffer{
public int byteLength;
public SharedArrayBuffer(int length){}
public native SharedArrayBuffer slice();
public native SharedArrayBuffer slice(double begin,double end);
public native SharedArrayBuffer slice(double begin);
}
