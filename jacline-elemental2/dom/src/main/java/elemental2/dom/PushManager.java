package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.PushSubscriptionOptionsInit;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.PushSubscription;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PushManager{
public native Promise<@Nullable PushSubscription> getSubscription();
public native Promise<PushSubscription> subscribe();
public native Promise<PushSubscription> subscribe(@Nullable PushSubscriptionOptionsInit options);
}
