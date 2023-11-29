package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface StorageEstimate{
@JsOverlay
static StorageEstimate create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getQuota();
@JsProperty
double getUsage();
@JsProperty
void setQuota(double quota);
@JsProperty
void setUsage(double usage);
}
