package elemental2.svg;
import elemental2.svg.SVGNumber;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGNumberList{
public int numberOfItems;
public native SVGNumber appendItem(SVGNumber item);
public native Object clear();
public native SVGNumber getItem(int index);
public native SVGNumber initialize(SVGNumber item);
public native SVGNumber insertItemBefore(SVGNumber item,int index);
public native SVGNumber removeItem(int index);
public native SVGNumber replaceItem(SVGNumber item,int index);
}
