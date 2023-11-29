package elemental2.dom;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMRectReadOnly;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMRect extends DOMRectReadOnly{
public double bottom;
public double height;
public double left;
public double right;
public double top;
public double width;
public double x;
public double y;
public DOMRect(){}
public DOMRect(double x,double y,double width,double height){}
public DOMRect(double x,double y,double width){}
public DOMRect(double x,double y){}
public DOMRect(double x){}
}
