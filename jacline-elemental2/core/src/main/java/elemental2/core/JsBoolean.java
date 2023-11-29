package elemental2.core;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "Boolean",namespace = JsPackage.GLOBAL)
public class JsBoolean{
public JsBoolean(){}
public JsBoolean(Object value){}
public native String toSource();
@JsMethod(name = "toString")
public native String toString_();
public native boolean valueOf();
}
