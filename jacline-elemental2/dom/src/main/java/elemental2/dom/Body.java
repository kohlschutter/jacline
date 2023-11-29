package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.FormData;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.Blob;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Body{
Promise<ArrayBuffer> arrayBuffer();
Promise<Blob> blob();
Promise<FormData> formData();
@JsProperty
boolean isBodyUsed();
Promise<Object> json();
@JsProperty
void setBodyUsed(boolean bodyUsed);
Promise<String> text();
}
