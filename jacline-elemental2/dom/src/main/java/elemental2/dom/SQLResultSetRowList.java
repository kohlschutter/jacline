package elemental2.dom;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SQLResultSetRowList implements JsArrayLike<JsObject>{
public int length;
public native JsObject item(int index);
}
