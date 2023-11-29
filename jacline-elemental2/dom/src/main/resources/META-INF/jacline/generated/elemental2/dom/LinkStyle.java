package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.StyleSheet;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface LinkStyle{
@JsProperty
StyleSheet getSheet();
@JsProperty
void setSheet(StyleSheet sheet);
}
