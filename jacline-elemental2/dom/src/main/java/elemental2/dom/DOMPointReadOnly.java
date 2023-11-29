package elemental2.dom;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMPointInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMPointReadOnly{
public double w;
public double x;
public double y;
public double z;
public DOMPointReadOnly(){}
public DOMPointReadOnly(double x,double y,double z,double w){}
public DOMPointReadOnly(double x,double y,double z){}
public DOMPointReadOnly(double x,double y){}
public DOMPointReadOnly(double x){}
public native DOMPointReadOnly fromPoint(DOMPointInit other);
}
