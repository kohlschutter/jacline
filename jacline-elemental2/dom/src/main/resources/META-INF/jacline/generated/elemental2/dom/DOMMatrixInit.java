package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMMatrix2DInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface DOMMatrixInit extends DOMMatrix2DInit{
@JsOverlay
static DOMMatrixInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getM13();
@JsProperty
double getM14();
@JsProperty
double getM23();
@JsProperty
double getM24();
@JsProperty
double getM31();
@JsProperty
double getM32();
@JsProperty
double getM33();
@JsProperty
double getM34();
@JsProperty
double getM43();
@JsProperty
double getM44();
@JsProperty
boolean isIs2D();
@JsProperty
void setIs2D(boolean is2D);
@JsProperty
void setM13(double m13);
@JsProperty
void setM14(double m14);
@JsProperty
void setM23(double m23);
@JsProperty
void setM24(double m24);
@JsProperty
void setM31(double m31);
@JsProperty
void setM32(double m32);
@JsProperty
void setM33(double m33);
@JsProperty
void setM34(double m34);
@JsProperty
void setM43(double m43);
@JsProperty
void setM44(double m44);
}
