package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaDeviceInfo{
@JsProperty
String getDeviceId();
@JsProperty
String getGroupId();
@JsProperty
String getKind();
@JsProperty
String getLabel();
}
