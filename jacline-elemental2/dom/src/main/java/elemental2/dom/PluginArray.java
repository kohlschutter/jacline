package elemental2.dom;
import jsinterop.base.JsArrayLike;
import elemental2.dom.Plugin;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PluginArray implements JsArrayLike<Plugin>, JsPropertyMap<Plugin>{
public int length;
public native Plugin item(int index);
public native Plugin namedItem(String name);
public native void refresh();
public native void refresh(boolean reloadDocuments);
}
