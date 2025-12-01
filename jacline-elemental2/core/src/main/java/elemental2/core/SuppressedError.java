package elemental2.core;
import elemental2.core.JsError;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SuppressedError extends JsError{
public @Nullable Object error;
public @Nullable Object suppressed;
public SuppressedError(@Nullable Object error,@Nullable Object suppressed,String message){}
public SuppressedError(@Nullable Object error,@Nullable Object suppressed){}
}
