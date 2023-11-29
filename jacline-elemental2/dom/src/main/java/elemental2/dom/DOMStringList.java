package elemental2.dom;
import jsinterop.base.JsArrayLike;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMStringList implements JsArrayLike<String>{
public int length;
public native boolean contains(String str);
public native String item(int index);
}
