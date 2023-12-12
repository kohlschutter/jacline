package elemental2.svg;
import elemental2.svg.SVGMatrix;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGPoint{
public double x;
public double y;
public native SVGPoint matrixTransform(SVGMatrix matrix);
}
