package elemental2.dom;
import jsinterop.annotations.JsMethod;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSStyleValue{
public static native CSSStyleValue parse(String property,String cssText);
public static native JsArray<CSSStyleValue> parseAll(String property,String cssText);
@JsMethod(name = "toString")
public native String toString_();
}
