package elemental2.dom;
import java.lang.Void;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NavigatorBadge{
Promise<Void> clearAppBadge();
Promise<Void> setAppBadge();
Promise<Void> setAppBadge(double contents);
}
