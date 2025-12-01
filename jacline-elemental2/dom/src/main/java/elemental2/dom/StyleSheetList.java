package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import elemental2.dom.StyleSheet;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class StyleSheetList implements JsArrayLike<StyleSheet>{
public int length;
public native @Nullable StyleSheet item(int index);
}
