package elemental2.media;
import jsinterop.annotations.JsProperty;
import elemental2.media.MediaKeySystemConfiguration;
import elemental2.media.MediaKeys;
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
