package elemental2.svg;
import elemental2.svg.SVGElementInstance;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGElementInstanceList{
public int length;
public native SVGElementInstance item();
public native SVGElementInstance item(int index);
}
