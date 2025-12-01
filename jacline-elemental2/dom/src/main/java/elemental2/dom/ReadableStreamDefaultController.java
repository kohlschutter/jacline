package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableStreamDefaultController<VALUE extends @Nullable Object>{
void close();
void enqueue(VALUE chunk);
void error(@Nullable Object err);
@JsProperty
int getDesiredSize();
@JsProperty
void setDesiredSize(int desiredSize);
}
