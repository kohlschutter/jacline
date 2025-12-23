package elemental2.barcode;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface BarcodeDetectorOptions{
@JsOverlay
static BarcodeDetectorOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<String> getFormats();
@JsProperty
void setFormats(JsArray<String> formats);
@JsOverlay
default void setFormats(String[] formats){
setFormats(Js.<JsArray<String>>uncheckedCast(formats));
}
}
