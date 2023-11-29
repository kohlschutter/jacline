package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NotificationOptionsInterface_{
@JsProperty
String getBody();
@JsProperty
String getDir();
@JsProperty
String getIcon();
@JsProperty
String getLang();
@JsProperty
String getTag();
@JsProperty
boolean isRequireInteraction();
@JsProperty
void setBody(String body);
@JsProperty
void setDir(String dir);
@JsProperty
void setIcon(String icon);
@JsProperty
void setLang(String lang);
@JsProperty
void setRequireInteraction(boolean requireInteraction);
@JsProperty
void setTag(String tag);
}
