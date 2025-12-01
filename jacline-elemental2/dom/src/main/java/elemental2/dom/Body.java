package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.FormData;
import elemental2.dom.Blob;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
import jsinterop.annotations.JsProperty;
import elemental2.core.Uint8Array;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Body{
Promise<ArrayBuffer> arrayBuffer();
Promise<Blob> blob();
Promise<Uint8Array> bytes();
Promise<FormData> formData();
@JsProperty
boolean isBodyUsed();
Promise<@Nullable Object> json();
@JsProperty
void setBodyUsed(boolean bodyUsed);
Promise<String> text();
}
