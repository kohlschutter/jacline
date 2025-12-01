package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import elemental2.dom.File;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FileList implements JsArrayLike<File>{
public int length;
public native @Nullable File item(double i);
}
