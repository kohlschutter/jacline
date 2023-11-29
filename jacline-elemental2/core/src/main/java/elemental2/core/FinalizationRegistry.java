package elemental2.core;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FinalizationRegistry<TARGET, HELDVALUE, TOKEN>{
@JsFunction
public interface FinalizationRegistryCleanupCallbackFn<HELDVALUE>{
Object onInvoke(HELDVALUE p0);
}
public FinalizationRegistry(FinalizationRegistry.FinalizationRegistryCleanupCallbackFn<? super HELDVALUE> cleanupCallback){}
public native void register(TARGET target,HELDVALUE heldValue,TOKEN unregisterToken);
public native void register(TARGET target,HELDVALUE heldValue);
public native void unregister(TOKEN unregisterToken);
}
