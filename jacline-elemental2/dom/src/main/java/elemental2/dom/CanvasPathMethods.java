package elemental2.dom;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface CanvasPathMethods{
void arc(double x,double y,double radius,double startAngle,double endAngle,boolean anticlockwise);
void arc(double x,double y,double radius,double startAngle,double endAngle);
void arcTo(double x1,double y1,double x2,double y2,double radius);
void bezierCurveTo(double cp1x,double cp1y,double cp2x,double cp2y,double x,double y);
void closePath();
void lineTo(double x,double y);
void moveTo(double x,double y);
void quadraticCurveTo(double cpx,double cpy,double x,double y);
void rect(double x,double y,double w,double h);
}
