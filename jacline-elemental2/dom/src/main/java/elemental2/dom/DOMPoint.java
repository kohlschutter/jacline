package elemental2.dom;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMPointReadOnly;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMPoint extends DOMPointReadOnly{
public double w;
public double x;
public double y;
public double z;
public DOMPoint(){}
public DOMPoint(double x,double y,double z,double w){}
public DOMPoint(double x,double y,double z){}
public DOMPoint(double x,double y){}
public DOMPoint(double x){}
}
