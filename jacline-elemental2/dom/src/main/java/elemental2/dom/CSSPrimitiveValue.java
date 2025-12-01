package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.CSSValue;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.Rect;
import elemental2.dom.RGBColor;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Counter;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSPrimitiveValue extends CSSValue{
@JsOverlay
public static final int CSS_ATTR=CSSPrimitiveValue__Constants.CSS_ATTR;
@JsOverlay
public static final int CSS_CM=CSSPrimitiveValue__Constants.CSS_CM;
@JsOverlay
public static final int CSS_COUNTER=CSSPrimitiveValue__Constants.CSS_COUNTER;
@JsOverlay
public static final int CSS_DEG=CSSPrimitiveValue__Constants.CSS_DEG;
@JsOverlay
public static final int CSS_DIMENSION=CSSPrimitiveValue__Constants.CSS_DIMENSION;
@JsOverlay
public static final int CSS_EMS=CSSPrimitiveValue__Constants.CSS_EMS;
@JsOverlay
public static final int CSS_EXS=CSSPrimitiveValue__Constants.CSS_EXS;
@JsOverlay
public static final int CSS_GRAD=CSSPrimitiveValue__Constants.CSS_GRAD;
@JsOverlay
public static final int CSS_HZ=CSSPrimitiveValue__Constants.CSS_HZ;
@JsOverlay
public static final int CSS_IDENT=CSSPrimitiveValue__Constants.CSS_IDENT;
@JsOverlay
public static final int CSS_IN=CSSPrimitiveValue__Constants.CSS_IN;
@JsOverlay
public static final int CSS_KHZ=CSSPrimitiveValue__Constants.CSS_KHZ;
@JsOverlay
public static final int CSS_MM=CSSPrimitiveValue__Constants.CSS_MM;
@JsOverlay
public static final int CSS_MS=CSSPrimitiveValue__Constants.CSS_MS;
@JsOverlay
public static final int CSS_NUMBER=CSSPrimitiveValue__Constants.CSS_NUMBER;
@JsOverlay
public static final int CSS_PC=CSSPrimitiveValue__Constants.CSS_PC;
@JsOverlay
public static final int CSS_PERCENTAGE=CSSPrimitiveValue__Constants.CSS_PERCENTAGE;
@JsOverlay
public static final int CSS_PT=CSSPrimitiveValue__Constants.CSS_PT;
@JsOverlay
public static final int CSS_PX=CSSPrimitiveValue__Constants.CSS_PX;
@JsOverlay
public static final int CSS_RAD=CSSPrimitiveValue__Constants.CSS_RAD;
@JsOverlay
public static final int CSS_RECT=CSSPrimitiveValue__Constants.CSS_RECT;
@JsOverlay
public static final int CSS_RGBCOLOR=CSSPrimitiveValue__Constants.CSS_RGBCOLOR;
@JsOverlay
public static final int CSS_S=CSSPrimitiveValue__Constants.CSS_S;
@JsOverlay
public static final int CSS_STRING=CSSPrimitiveValue__Constants.CSS_STRING;
@JsOverlay
public static final int CSS_UNKNOWN=CSSPrimitiveValue__Constants.CSS_UNKNOWN;
@JsOverlay
public static final int CSS_URI=CSSPrimitiveValue__Constants.CSS_URI;
public double primitiveType;
public native @Nullable Counter getCounterValue();
public native double getFloatValue(double unitType);
public native @Nullable RGBColor getRGBColorValue();
public native @Nullable Rect getRectValue();
public native String getStringValue();
public native void setFloatValue(double unitType,double floatValue);
public native void setStringValue(double stringType,String stringValue);
}
