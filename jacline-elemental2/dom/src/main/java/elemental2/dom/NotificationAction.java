package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NotificationAction{
@JsOverlay
static NotificationAction create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getAction();
@JsProperty
String getIcon();
@JsProperty
String getTitle();
@JsProperty
void setAction(String action);
@JsProperty
void setIcon(String icon);
@JsProperty
void setTitle(String title);
}
