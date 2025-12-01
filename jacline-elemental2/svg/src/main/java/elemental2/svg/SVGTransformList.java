package elemental2.svg;
import org.jspecify.annotations.Nullable;
import elemental2.svg.SVGMatrix;
import elemental2.svg.SVGTransform;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGTransformList{
public int numberOfItems;
public native SVGTransform appendItem(SVGTransform item);
public native @Nullable Object clear();
public native SVGTransform consolidate();
public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
public native SVGTransform getItem(int index);
public native SVGTransform initialize(SVGTransform item);
public native SVGTransform insertItemBefore(SVGTransform item,int index);
public native SVGTransform removeItem(int index);
public native SVGTransform replaceItem(SVGTransform item,int index);
}
