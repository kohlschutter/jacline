package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FinalizationRegistry<TARGET extends @Nullable Object, HELDVALUE extends @Nullable Object, TOKEN extends @Nullable Object>{
@JsFunction
public interface FinalizationRegistryCleanupCallbackFn<HELDVALUE extends @Nullable Object>{
@Nullable Object onInvoke(HELDVALUE p0);
}
public FinalizationRegistry(FinalizationRegistry.FinalizationRegistryCleanupCallbackFn<? super HELDVALUE> cleanupCallback){}
public native void register(TARGET target,HELDVALUE heldValue,TOKEN unregisterToken);
public native void register(TARGET target,HELDVALUE heldValue);
public native void unregister(TOKEN unregisterToken);
}
