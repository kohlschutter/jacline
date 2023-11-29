package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableStreamDefaultController<VALUE>{
void close();
void enqueue(VALUE chunk);
void error(Object err);
@JsProperty
int getDesiredSize();
@JsProperty
void setDesiredSize(int desiredSize);
}
