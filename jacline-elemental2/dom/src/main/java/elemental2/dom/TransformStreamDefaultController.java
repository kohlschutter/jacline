package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TransformStreamDefaultController<OUT_VALUE extends @Nullable Object>{
void enqueue(OUT_VALUE chunk);
void error(@Nullable Object reason);
@JsProperty
double getDesiredSize();
@JsProperty
void setDesiredSize(double desiredSize);
void terminate();
}
