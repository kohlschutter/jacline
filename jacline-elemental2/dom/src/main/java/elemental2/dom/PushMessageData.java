package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Blob;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PushMessageData{
public native ArrayBuffer arrayBuffer();
public native Blob blob();
public native @Nullable Object json();
public native String text();
}
