package elemental2.svg;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGStringList{
public int numberOfItems;
public native String appendItem(String item);
public native Object clear();
public native String getItem(int index);
public native String initialize(String item);
public native String insertItemBefore(String item,int index);
public native String removeItem(int index);
public native String replaceItem(String item,int index);
}
