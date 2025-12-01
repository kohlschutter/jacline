package elemental2.dom;
import elemental2.dom.NotificationAction;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NotificationOptions{
@JsOverlay
static NotificationOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<NotificationAction> getActions();
@JsProperty
String getBadge();
@JsProperty
String getBody();
@JsProperty
@Nullable Object getData();
@JsProperty
String getDir();
@JsProperty
String getIcon();
@JsProperty
String getImage();
@JsProperty
String getLang();
@JsProperty
String getTag();
@JsProperty
double getTimestamp();
@JsProperty
JsArray<Double> getVibrate();
@JsProperty
boolean isRenotify();
@JsProperty
boolean isRequireInteraction();
@JsProperty
boolean isSilent();
@JsProperty
void setActions(JsArray<NotificationAction> actions);
@JsOverlay
default void setActions(NotificationAction[] actions){
setActions(Js.<JsArray<NotificationAction>>uncheckedCast(actions));
}
@JsProperty
void setBadge(String badge);
@JsProperty
void setBody(String body);
@JsProperty
void setData(@Nullable Object data);
@JsProperty
void setDir(String dir);
@JsProperty
void setIcon(String icon);
@JsProperty
void setImage(String image);
@JsProperty
void setLang(String lang);
@JsProperty
void setRenotify(boolean renotify);
@JsProperty
void setRequireInteraction(boolean requireInteraction);
@JsProperty
void setSilent(boolean silent);
@JsProperty
void setTag(String tag);
@JsProperty
void setTimestamp(double timestamp);
@JsProperty
void setVibrate(JsArray<Double> vibrate);
@JsOverlay
default void setVibrate(double[] vibrate){
setVibrate(Js.<JsArray<Double>>uncheckedCast(vibrate));
}
}
