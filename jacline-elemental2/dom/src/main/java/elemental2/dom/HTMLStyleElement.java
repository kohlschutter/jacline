package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import elemental2.dom.HTMLElement;
import elemental2.dom.StyleSheet;
import java.lang.String;
import elemental2.dom.LinkStyle;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLStyleElement extends HTMLElement implements LinkStyle{
public boolean disabled;
public String media;
public @Nullable StyleSheet sheet;
public String type;
@JsProperty
public native @Nullable StyleSheet getSheet();
@JsProperty
public native void setSheet(@Nullable StyleSheet sheet);
}
