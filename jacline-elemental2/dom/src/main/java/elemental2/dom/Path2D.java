package elemental2.dom;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CanvasPathMethods;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Path2D implements CanvasPathMethods{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorArgUnionType{
@JsOverlay
static Path2D.ConstructorArgUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Path2D asPath2D(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isPath2D(){
return (Object)this instanceof Path2D;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public Path2D(){}
public Path2D(Path2D.ConstructorArgUnionType arg){}
public Path2D(Path2D arg){}
public Path2D(String arg){}
public native void addPath(Path2D path);
public native void arc(double x,double y,double radius,double startAngle,double endAngle,boolean optAnticlockwise);
public native void arc(double x,double y,double radius,double startAngle,double endAngle);
public native void arcTo(double x1,double y1,double x2,double y2,double radius);
public native void bezierCurveTo(double cp1x,double cp1y,double cp2x,double cp2y,double x,double y);
public native void closePath();
public native void lineTo(double x,double y);
public native void moveTo(double x,double y);
public native void quadraticCurveTo(double cpx,double cpy,double x,double y);
public native void rect(double x,double y,double w,double h);
public native void roundRect(double x,double y,double w,double h,CanvasPathMethods.RoundRectRadiiUnionType radii);
public native void roundRect(double x,double y,double w,double h);
}
