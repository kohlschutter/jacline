package elemental2.svg;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGMatrix{
public double a;
public double b;
public double c;
public double d;
public double e;
public double f;
public native SVGMatrix flipX();
public native SVGMatrix flipY();
public native SVGMatrix inverse();
public native SVGMatrix multiply(SVGMatrix secondMatrix);
public native SVGMatrix rotate(double angle);
public native SVGMatrix rotateFromVector(double x,double y);
public native SVGMatrix scale(double scaleFactor);
public native SVGMatrix scaleNonUniform(double scaleFactorX,double scaleFactorY);
public native SVGMatrix skewX(double angle);
public native SVGMatrix skewY(double angle);
public native SVGMatrix translate(double x,double y);
}
