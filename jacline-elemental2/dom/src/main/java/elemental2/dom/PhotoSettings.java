package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PhotoSettings{
@JsProperty
String getFillLightMode();
@JsProperty
double getImageHeight();
@JsProperty
double getImageWidth();
@JsProperty
boolean isRedEyeReduction();
@JsProperty
void setFillLightMode(String fillLightMode);
@JsProperty
void setImageHeight(double imageHeight);
@JsProperty
void setImageWidth(double imageWidth);
@JsProperty
void setRedEyeReduction(boolean redEyeReduction);
}
