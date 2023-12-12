package elemental2.svg;
import elemental2.svg.SVGLength;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGLengthList{
public int numberOfItems;
public native SVGLength appendItem(SVGLength item);
public native Object clear();
public native SVGLength getItem(int index);
public native SVGLength initialize(SVGLength item);
public native SVGLength insertItemBefore(SVGLength item,int index);
public native SVGLength removeItem(int index);
public native SVGLength replaceItem(SVGLength item,int index);
}
