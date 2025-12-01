package elemental2.core;
import org.jspecify.annotations.Nullable;
import java.lang.Void;
import elemental2.promise.Promise;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.core.AsyncDisposable;
import jsinterop.annotations.JsOverlay;
import elemental2.core.Disposable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AsyncDisposableStack{
@JsFunction
public interface AdoptOnDisposeFn<T extends @Nullable Object>{
Promise<Void> onInvoke(T p0);
}
@JsFunction
public interface DeferOnDisposeFn{
Promise<Void> onInvoke();
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UseDisposableUnionType{
@JsOverlay
static AsyncDisposableStack.@Nullable UseDisposableUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable AsyncDisposable asAsyncDisposable(){
return Js.cast(this);
}
@JsOverlay
default @Nullable Disposable asDisposable(){
return Js.cast(this);
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UseUnionType{
@JsOverlay
static AsyncDisposableStack.@Nullable UseUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable AsyncDisposable asAsyncDisposable(){
return Js.cast(this);
}
@JsOverlay
default @Nullable Disposable asDisposable(){
return Js.cast(this);
}
}
public boolean disposed;
public native <T extends @Nullable Object> T adopt(T value,AsyncDisposableStack.AdoptOnDisposeFn<? super T> onDispose);
public native void defer(AsyncDisposableStack.DeferOnDisposeFn onDispose);
public native Promise<Void> disposeAsync();
public native AsyncDisposableStack move();
@JsOverlay
public final AsyncDisposableStack.@Nullable UseUnionType use(AsyncDisposable disposable){
return use(Js.<AsyncDisposableStack.@Nullable UseDisposableUnionType>uncheckedCast(disposable));
}
@JsOverlay
public final AsyncDisposableStack.@Nullable UseUnionType use(Disposable disposable){
return use(Js.<AsyncDisposableStack.@Nullable UseDisposableUnionType>uncheckedCast(disposable));
}
public native AsyncDisposableStack.@Nullable UseUnionType use(AsyncDisposableStack.@Nullable UseDisposableUnionType disposable);
}
