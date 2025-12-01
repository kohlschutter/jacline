package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AttributionReportingRequestOptions{
@JsOverlay
static AttributionReportingRequestOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isEventSourceEligible();
@JsProperty
boolean isTriggerEligible();
@JsProperty
void setEventSourceEligible(boolean eventSourceEligible);
@JsProperty
void setTriggerEligible(boolean triggerEligible);
}
