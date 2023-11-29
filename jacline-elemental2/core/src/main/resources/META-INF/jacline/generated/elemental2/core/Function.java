package elemental2.core;
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
public Object arguments;
@Deprecated
public double arity;
public Function caller;
public Object displayName;
public int length;
public String name;
public Function(Object... var_args){}
public native Object apply(Object... var_args);
public native Function bind(JsObject selfObj,Object... var_args);
@JsOverlay
public final Function bind(Object selfObj,Object... var_args){
return bind(Js.<JsObject>uncheckedCast(selfObj),var_args);
}
public native Object call(Object... var_args);
@JsMethod(name = "toString")
public native String toString_();
}
