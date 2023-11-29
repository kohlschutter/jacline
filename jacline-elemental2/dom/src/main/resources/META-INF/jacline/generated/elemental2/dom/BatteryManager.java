package elemental2.dom;
import jsinterop.annotations.JsProperty;
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
BatteryManager.OnchargingchangeFn getOnchargingchange();
@JsProperty
BatteryManager.OnchargingtimechangeFn getOnchargingtimechange();
@JsProperty
BatteryManager.OndischargingtimechangeFn getOndischargingtimechange();
@JsProperty
BatteryManager.OnlevelchangeFn getOnlevelchange();
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
void setOnchargingchange(BatteryManager.OnchargingchangeFn onchargingchange);
@JsProperty
void setOnchargingtimechange(BatteryManager.OnchargingtimechangeFn onchargingtimechange);
@JsProperty
void setOndischargingtimechange(BatteryManager.OndischargingtimechangeFn ondischargingtimechange);
@JsProperty
void setOnlevelchange(BatteryManager.OnlevelchangeFn onlevelchange);
}
