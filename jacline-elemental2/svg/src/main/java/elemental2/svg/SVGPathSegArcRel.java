package elemental2.svg;
import elemental2.svg.SVGPathSeg;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGPathSegArcRel extends SVGPathSeg{
public double angle;
public boolean largeArcFlag;
public double r1;
public double r2;
public boolean sweepFlag;
public double x;
public double y;
}
