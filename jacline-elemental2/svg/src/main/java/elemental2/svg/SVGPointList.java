package elemental2.svg;
import org.jspecify.annotations.Nullable;
import elemental2.svg.SVGPoint;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGPointList{
public int numberOfItems;
public native SVGPoint appendItem(SVGPoint item);
public native @Nullable Object clear();
public native SVGPoint getItem(int index);
public native SVGPoint initialize(SVGPoint item);
public native SVGPoint insertItemBefore(SVGPoint item,int index);
public native SVGPoint removeItem(int index);
public native SVGPoint replaceItem(SVGPoint item,int index);
}
