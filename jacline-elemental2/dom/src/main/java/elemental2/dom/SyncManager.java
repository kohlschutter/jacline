package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Void;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SyncManager{
public native Promise<@Nullable JsArray<String>> getTags();
public native Promise<Void> register(String tag);
}
