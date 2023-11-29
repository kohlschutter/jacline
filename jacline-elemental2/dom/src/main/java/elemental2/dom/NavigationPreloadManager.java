package elemental2.dom;
import elemental2.dom.NavigationPreloadState;
import java.lang.Void;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class NavigationPreloadManager{
public native Promise<Void> disable();
public native Promise<Void> enable();
public native Promise<NavigationPreloadState> getState();
public native Promise<Void> setHeaderValue();
public native Promise<Void> setHeaderValue(String value);
}
