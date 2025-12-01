package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import java.lang.Deprecated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Function{
public @Nullable Object arguments;
@Deprecated
public double arity;
public @Nullable Function caller;
public @Nullable Object displayName;
public int length;
public String name;
public Function(@Nullable Object... var_args){}
public native @Nullable Object apply(@Nullable Object... var_args);
public native Function bind(@Nullable JsObject selfObj,@Nullable Object... var_args);
@JsOverlay
public final Function bind(@Nullable Object selfObj,@Nullable Object... var_args){
return bind(Js.<@Nullable JsObject>uncheckedCast(selfObj),var_args);
}
public native @Nullable Object call(@Nullable Object... var_args);
@JsMethod(name = "toString")
public native String toString_();
}
