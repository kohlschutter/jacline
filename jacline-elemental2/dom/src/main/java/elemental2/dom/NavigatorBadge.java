package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Void;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NavigatorBadge{
@Nullable Promise<Void> clearAppBadge();
@Nullable Promise<Void> setAppBadge();
@Nullable Promise<Void> setAppBadge(double contents);
}
