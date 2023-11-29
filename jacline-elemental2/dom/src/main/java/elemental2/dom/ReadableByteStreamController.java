package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.core.ArrayBufferView;
import elemental2.dom.ReadableStreamBYOBRequest;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableByteStreamController{
void close();
void enqueue(ArrayBufferView chunk);
void error(Object err);
@JsProperty
ReadableStreamBYOBRequest getByobRequest();
@JsProperty
int getDesiredSize();
@JsProperty
void setByobRequest(ReadableStreamBYOBRequest byobRequest);
@JsProperty
void setDesiredSize(int desiredSize);
}
