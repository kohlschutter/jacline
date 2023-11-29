package elemental2.core;
import elemental2.core.JsIterable;
import jsinterop.base.JsArrayLike;
import java.lang.Deprecated;
import elemental2.core.Function;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Arguments implements JsIterable<Object>, JsArrayLike<Object>{
public Function callee;
@Deprecated
public Function caller;
public int length;
}
