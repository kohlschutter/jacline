package elemental2.dom;
import elemental2.dom.DOMMatrixInit;
import java.lang.Double;
import elemental2.core.Float32Array;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import elemental2.core.Float64Array;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.DOMMatrixReadOnly;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMMatrix extends DOMMatrixReadOnly{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorInitUnionType{
@JsOverlay
static DOMMatrix.ConstructorInitUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public static native DOMMatrix fromFloat32Array(Float32Array array32);
public static native DOMMatrix fromFloat64Array(Float64Array array64);
public static native DOMMatrix fromMatrix(DOMMatrixInit other);
public DOMMatrix(DOMMatrix.ConstructorInitUnionType init){
// This super call is here only for the code to compile; it is never executed.
super((DOMMatrixReadOnly.ConstructorInitUnionType)null);
}
public DOMMatrix(JsArray<Double> init){
// This super call is here only for the code to compile; it is never executed.
super((DOMMatrixReadOnly.ConstructorInitUnionType)null);
}
public DOMMatrix(String init){
// This super call is here only for the code to compile; it is never executed.
super((DOMMatrixReadOnly.ConstructorInitUnionType)null);
}
public DOMMatrix(double[] init){
// This super call is here only for the code to compile; it is never executed.
super((DOMMatrixReadOnly.ConstructorInitUnionType)null);
}
public native DOMMatrix invertSelf();
public native DOMMatrix multiplySelf(DOMMatrixInit other);
public native DOMMatrix preMultiplySelf(DOMMatrixInit other);
public native DOMMatrix rotateAxisAngleSelf();
public native DOMMatrix rotateAxisAngleSelf(double x,double y,double z,double angle);
public native DOMMatrix rotateAxisAngleSelf(double x,double y,double z);
public native DOMMatrix rotateAxisAngleSelf(double x,double y);
public native DOMMatrix rotateAxisAngleSelf(double x);
public native DOMMatrix rotateFromVectorSelf();
public native DOMMatrix rotateFromVectorSelf(double x,double y);
public native DOMMatrix rotateFromVectorSelf(double x);
public native DOMMatrix rotateSelf();
public native DOMMatrix rotateSelf(double rotX,double rotY,double rotZ);
public native DOMMatrix rotateSelf(double rotX,double rotY);
public native DOMMatrix rotateSelf(double rotX);
public native DOMMatrix scale3dSelf();
public native DOMMatrix scale3dSelf(double scale,double originX,double originY,double originZ);
public native DOMMatrix scale3dSelf(double scale,double originX,double originY);
public native DOMMatrix scale3dSelf(double scale,double originX);
public native DOMMatrix scale3dSelf(double scale);
public native DOMMatrix scaleSelf();
public native DOMMatrix scaleSelf(double scaleX,double scaleY,double scaleZ,double originX,double originY,double originZ);
public native DOMMatrix scaleSelf(double scaleX,double scaleY,double scaleZ,double originX,double originY);
public native DOMMatrix scaleSelf(double scaleX,double scaleY,double scaleZ,double originX);
public native DOMMatrix scaleSelf(double scaleX,double scaleY,double scaleZ);
public native DOMMatrix scaleSelf(double scaleX,double scaleY);
public native DOMMatrix scaleSelf(double scaleX);
public native DOMMatrix skewXSelf();
public native DOMMatrix skewXSelf(double sx);
public native DOMMatrix skewYSelf();
public native DOMMatrix skewYSelf(double sy);
public native DOMMatrix translateSelf();
public native DOMMatrix translateSelf(double tx,double ty,double tz);
public native DOMMatrix translateSelf(double tx,double ty);
public native DOMMatrix translateSelf(double tx);
}
