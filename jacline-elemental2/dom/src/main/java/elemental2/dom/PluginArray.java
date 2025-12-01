package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import elemental2.dom.Plugin;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PluginArray implements JsArrayLike<Plugin>, JsPropertyMap<Plugin>{
public int length;
public native @Nullable Plugin item(int index);
public native @Nullable Plugin namedItem(String name);
public native void refresh();
public native void refresh(boolean reloadDocuments);
}
