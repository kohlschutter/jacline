package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.MediaSettingsRange;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PhotoCapabilities{
@JsProperty
JsArray<String> getFillLightMode();
@JsProperty
MediaSettingsRange getImageHeight();
@JsProperty
MediaSettingsRange getImageWidth();
@JsProperty
String getRedEyeReduction();
}
