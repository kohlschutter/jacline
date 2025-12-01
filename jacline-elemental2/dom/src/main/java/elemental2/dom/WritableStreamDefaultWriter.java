package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import java.lang.Void;
import java.lang.Double;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WritableStreamDefaultWriter<VALUE extends @Nullable Object>{
Promise<Void> abort(@Nullable Object reason);
Promise<Void> close();
@JsProperty
Promise<Void> getClosed();
@JsProperty
int getDesiredSize();
@JsProperty
Promise<Double> getReady();
void releaseLock();
@JsProperty
void setClosed(Promise<Void> closed);
@JsProperty
void setDesiredSize(int desiredSize);
@JsProperty
void setReady(Promise<Double> ready);
Promise<Void> write(VALUE chunk);
}
