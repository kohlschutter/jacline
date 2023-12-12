package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AudioParamDescriptor{
@JsOverlay
static AudioParamDescriptor create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getAutomationRate();
@JsProperty
double getDefaultValue();
@JsProperty
double getMaxValue();
@JsProperty
double getMinValue();
@JsProperty
String getName();
@JsProperty
void setAutomationRate(String automationRate);
@JsProperty
void setDefaultValue(double defaultValue);
@JsProperty
void setMaxValue(double maxValue);
@JsProperty
void setMinValue(double minValue);
@JsProperty
void setName(String name);
}
