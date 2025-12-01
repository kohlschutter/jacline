package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import jsinterop.base.JsArrayLike;
import elemental2.dom.Node;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class NamedNodeMap<T extends @Nullable Object> implements JsIterable<T, @Nullable Object, @Nullable Object>, JsArrayLike<T>, JsPropertyMap<T>{
public int length;
public native @Nullable Node getNamedItem(String name);
public native @Nullable Node item(int index);
public native @Nullable Node removeNamedItem(String name);
public native @Nullable Node setNamedItem(@Nullable Node arg);
}
