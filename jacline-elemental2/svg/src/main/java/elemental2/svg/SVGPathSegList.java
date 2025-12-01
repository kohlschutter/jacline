package elemental2.svg;
import org.jspecify.annotations.Nullable;
import elemental2.svg.SVGPathSeg;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGPathSegList{
public int numberOfItems;
public native SVGPathSeg appendItem(SVGPathSeg newItem);
public native @Nullable Object clear();
public native SVGPathSeg getItem(int index);
public native SVGPathSeg initialize(SVGPathSeg newItem);
public native SVGPathSeg insertItemBefore(SVGPathSeg newItem,int index);
public native SVGPathSeg removeItem(int index);
public native SVGPathSeg replaceItem(SVGPathSeg newItem,int index);
}
