package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import jsinterop.base.JsArrayLike;
import java.lang.Deprecated;
import elemental2.core.Function;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Arguments implements JsIterable<@Nullable Object, @Nullable Object, @Nullable Object>, JsArrayLike<@Nullable Object>{
public @Nullable Function callee;
@Deprecated
public @Nullable Function caller;
public int length;
}
