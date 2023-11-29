package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ImageBitmapOptions{
@JsOverlay
static ImageBitmapOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getColorSpaceConversion();
@JsProperty
String getImageOrientation();
@JsProperty
String getPremultiplyAlpha();
@JsProperty
double getResizeHeight();
@JsProperty
String getResizeQuality();
@JsProperty
double getResizeWidth();
@JsProperty
void setColorSpaceConversion(String colorSpaceConversion);
@JsProperty
void setImageOrientation(String imageOrientation);
@JsProperty
void setPremultiplyAlpha(String premultiplyAlpha);
@JsProperty
void setResizeHeight(double resizeHeight);
@JsProperty
void setResizeQuality(String resizeQuality);
@JsProperty
void setResizeWidth(double resizeWidth);
}
