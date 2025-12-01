package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class EventCounts{
@JsFunction
public interface ForEachCallbackFn{
void onInvoke(double p0,String p1,EventCounts p2);
}
public native void forEach(EventCounts.ForEachCallbackFn callback,@Nullable Object thisArg);
}
