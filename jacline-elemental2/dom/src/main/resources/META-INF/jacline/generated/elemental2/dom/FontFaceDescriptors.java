package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FontFaceDescriptors{
@JsOverlay
static FontFaceDescriptors create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getDisplay();
@JsProperty
String getFeatureSettings();
@JsProperty
String getStretch();
@JsProperty
String getStyle();
@JsProperty
String getUnicodeRange();
@JsProperty
String getVariant();
@JsProperty
String getWeight();
@JsProperty
void setDisplay(String display);
@JsProperty
void setFeatureSettings(String featureSettings);
@JsProperty
void setStretch(String stretch);
@JsProperty
void setStyle(String style);
@JsProperty
void setUnicodeRange(String unicodeRange);
@JsProperty
void setVariant(String variant);
@JsProperty
void setWeight(String weight);
}
