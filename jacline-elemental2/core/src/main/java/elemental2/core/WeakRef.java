package elemental2.core;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WeakRef<TYPE>{
public WeakRef(TYPE value){}
public native TYPE deref();
}
