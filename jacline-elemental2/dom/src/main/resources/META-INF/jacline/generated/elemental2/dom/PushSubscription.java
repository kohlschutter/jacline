package elemental2.dom;
import elemental2.dom.PushSubscriptionOptions;
import java.lang.Boolean;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PushSubscription{
public String endpoint;
public PushSubscriptionOptions options;
public String subscriptionId;
public native Promise<Boolean> unsubscribe();
}
