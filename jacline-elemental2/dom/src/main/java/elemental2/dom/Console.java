package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Console{
@JsMethod(name = "assert")
public native void assert_(@Nullable Object condition,@Nullable Object... var_data);
public native void clear();
public native void count();
public native void count(String label);
public native void countReset();
public native void countReset(String label);
public native void debug(@Nullable Object... var_data);
public native void dir(@Nullable Object item);
public native void dirxml(@Nullable Object... var_data);
public native void error(@Nullable Object... var_data);
public native void group(@Nullable Object... var_data);
public native void groupCollapsed(@Nullable Object... var_data);
public native void groupEnd();
public native void info(@Nullable Object... var_data);
public native void log(@Nullable Object... var_data);
public native void table(JsObject tabularData,@Nullable Object properties);
public native void table(JsObject tabularData);
@JsOverlay
public final void table(Object tabularData,@Nullable Object properties){
table(Js.<JsObject>uncheckedCast(tabularData),properties);
}
@JsOverlay
public final void table(Object tabularData){
table(Js.<JsObject>uncheckedCast(tabularData));
}
public native void time(String label);
public native void timeEnd(String label);
public native void timeLog(String label,@Nullable Object... data);
public native void trace(@Nullable Object... var_data);
public native void warn(@Nullable Object... var_data);
}
