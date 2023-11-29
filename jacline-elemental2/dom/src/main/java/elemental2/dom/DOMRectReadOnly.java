package elemental2.dom;
import elemental2.dom.ClientRect;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMRectInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMRectReadOnly extends ClientRect{
public double bottom;
public double height;
public double left;
public double right;
public double top;
public double width;
public double x;
public double y;
public DOMRectReadOnly(){}
public DOMRectReadOnly(double x,double y,double width,double height){}
public DOMRectReadOnly(double x,double y,double width){}
public DOMRectReadOnly(double x,double y){}
public DOMRectReadOnly(double x){}
public native DOMRectReadOnly fromRect(DOMRectInit other);
}
