package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import elemental2.core.Disposable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DisposableStack{
@JsFunction
public interface AdoptOnDisposeFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T p0);
}
@JsFunction
public interface DeferOnDisposeFn{
void onInvoke();
}
public boolean disposed;
public native <T extends @Nullable Object> T adopt(T value,DisposableStack.AdoptOnDisposeFn<? super T> onDispose);
public native void defer(DisposableStack.DeferOnDisposeFn onDispose);
public native void dispose();
public native DisposableStack move();
public native @Nullable Disposable use(@Nullable Disposable disposable);
}
