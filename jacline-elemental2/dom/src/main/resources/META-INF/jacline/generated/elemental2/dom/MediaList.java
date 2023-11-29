package elemental2.dom;
import jsinterop.base.JsArrayLike;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaList implements JsArrayLike<MediaList>{
public int length;
public String mediaText;
public native String item(int index);
}
