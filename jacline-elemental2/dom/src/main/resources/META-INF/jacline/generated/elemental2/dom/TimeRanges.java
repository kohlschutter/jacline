package elemental2.dom;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TimeRanges{
public int length;
public native double end(int index);
public native double start(int index);
}
