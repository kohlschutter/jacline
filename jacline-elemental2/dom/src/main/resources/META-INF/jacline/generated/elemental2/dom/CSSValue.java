package elemental2.dom;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSValue{
@JsOverlay
public static final int CSS_CUSTOM=CSSValue__Constants.CSS_CUSTOM;
@JsOverlay
public static final int CSS_INHERIT=CSSValue__Constants.CSS_INHERIT;
@JsOverlay
public static final int CSS_PRIMITIVE_VALUE=CSSValue__Constants.CSS_PRIMITIVE_VALUE;
@JsOverlay
public static final int CSS_VALUE_LIST=CSSValue__Constants.CSS_VALUE_LIST;
public String cssText;
public double cssValueType;
}
