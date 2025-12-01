package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.NodeList;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RadioNodeList<T extends @Nullable Object> extends NodeList<T>{
public String value;
}
