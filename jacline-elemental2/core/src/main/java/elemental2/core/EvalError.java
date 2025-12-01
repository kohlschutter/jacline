package elemental2.core;
import elemental2.core.JsError;
import org.jspecify.annotations.Nullable;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class EvalError extends JsError{
public EvalError(){}
public EvalError(@Nullable Object message,@Nullable Object fileNameOrOptions,@Nullable Object line){}
public EvalError(@Nullable Object message,@Nullable Object fileNameOrOptions){}
public EvalError(@Nullable Object message){}
}
