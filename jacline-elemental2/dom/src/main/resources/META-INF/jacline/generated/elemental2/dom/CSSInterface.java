package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSInterface{
public native String escape(String ident);
public native boolean supports(String property,String value);
public native boolean supports(String property);
}
