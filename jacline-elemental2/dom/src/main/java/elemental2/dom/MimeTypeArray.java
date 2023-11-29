package elemental2.dom;
import elemental2.dom.MimeType;
import jsinterop.base.JsArrayLike;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MimeTypeArray implements JsArrayLike<MimeType>, JsPropertyMap<MimeType>{
public int length;
public native MimeType item(int index);
public native MimeType namedItem(String name);
}
