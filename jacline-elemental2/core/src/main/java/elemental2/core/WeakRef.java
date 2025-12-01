package elemental2.core;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WeakRef<TYPE extends @Nullable Object>{
public WeakRef(TYPE value){}
public native TYPE deref();
}
