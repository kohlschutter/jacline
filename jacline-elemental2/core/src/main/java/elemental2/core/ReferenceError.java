package elemental2.core;
import elemental2.core.JsError;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ReferenceError extends JsError{
public ReferenceError(){}
public ReferenceError(@Nullable Object message,@Nullable Object fileNameOrOptions,@Nullable Object line){}
public ReferenceError(@Nullable Object message,@Nullable Object fileNameOrOptions){}
public ReferenceError(@Nullable Object message){}
}
