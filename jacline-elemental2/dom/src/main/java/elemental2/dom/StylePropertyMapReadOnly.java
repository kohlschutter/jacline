package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.CSSStyleValue;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class StylePropertyMapReadOnly{
@JsFunction
public interface ForEachCallbackFn{
@JsOverlay
default void onInvoke(CSSStyleValue[] p0,String p1,StylePropertyMapReadOnly p2){
onInvoke(Js.<JsArray<CSSStyleValue>>uncheckedCast(p0),p1,p2);
}
void onInvoke(JsArray<CSSStyleValue> p0,String p1,StylePropertyMapReadOnly p2);
}
public double size;
public native @Nullable Object forEach(StylePropertyMapReadOnly.ForEachCallbackFn callbackfn,@Nullable Object thisArg);
public native @Nullable Object forEach(StylePropertyMapReadOnly.ForEachCallbackFn callbackfn);
public native @Nullable CSSStyleValue get(String property);
public native JsArray<CSSStyleValue> getAll(String property);
public native boolean has(String property);
}
