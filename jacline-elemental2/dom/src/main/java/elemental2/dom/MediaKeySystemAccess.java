package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.MediaKeys;
import elemental2.dom.MediaKeySystemConfiguration;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaKeySystemAccess{
Promise<MediaKeys> createMediaKeys();
MediaKeySystemConfiguration getConfiguration();
@JsProperty
String getKeySystem();
}
