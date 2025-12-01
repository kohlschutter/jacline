package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaKeySystemMediaCapability{
@JsOverlay
static MediaKeySystemMediaCapability create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getContentType();
@JsProperty
@Nullable String getEncryptionScheme();
@JsProperty
String getRobustness();
@JsProperty
void setContentType(String contentType);
@JsProperty
void setEncryptionScheme(@Nullable String encryptionScheme);
@JsProperty
void setRobustness(String robustness);
}
