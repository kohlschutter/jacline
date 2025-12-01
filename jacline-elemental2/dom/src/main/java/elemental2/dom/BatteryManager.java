package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface BatteryManager extends EventTarget{
@JsFunction
public interface OnchargingchangeFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnchargingtimechangeFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OndischargingtimechangeFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnlevelchangeFn{
void onInvoke(Event p0);
}
@JsProperty
double getChargingTime();
@JsProperty
double getDischargingTime();
@JsProperty
double getLevel();
@JsProperty
BatteryManager.@Nullable OnchargingchangeFn getOnchargingchange();
@JsProperty
BatteryManager.@Nullable OnchargingtimechangeFn getOnchargingtimechange();
@JsProperty
BatteryManager.@Nullable OndischargingtimechangeFn getOndischargingtimechange();
@JsProperty
BatteryManager.@Nullable OnlevelchangeFn getOnlevelchange();
@JsProperty
boolean isCharging();
@JsProperty
void setCharging(boolean charging);
@JsProperty
void setChargingTime(double chargingTime);
@JsProperty
void setDischargingTime(double dischargingTime);
@JsProperty
void setLevel(double level);
@JsProperty
void setOnchargingchange(BatteryManager.@Nullable OnchargingchangeFn onchargingchange);
@JsProperty
void setOnchargingtimechange(BatteryManager.@Nullable OnchargingtimechangeFn onchargingtimechange);
@JsProperty
void setOndischargingtimechange(BatteryManager.@Nullable OndischargingtimechangeFn ondischargingtimechange);
@JsProperty
void setOnlevelchange(BatteryManager.@Nullable OnlevelchangeFn onlevelchange);
}
