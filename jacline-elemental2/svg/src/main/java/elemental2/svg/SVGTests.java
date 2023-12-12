package elemental2.svg;
import elemental2.svg.SVGStringList;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGTests{
@JsProperty
SVGStringList getRequiredExtensions();
@JsProperty
SVGStringList getRequiredFeatures();
@JsProperty
SVGStringList getSystemLanguage();
boolean hasExtension();
boolean hasExtension(String extension);
@JsProperty
void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
void setSystemLanguage(SVGStringList systemLanguage);
}
