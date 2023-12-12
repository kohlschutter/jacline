package elemental2.webgl;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ANGLE_instanced_arrays{
public double VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE;
public native void drawArraysInstancedANGLE(int mode,int first,int count,int primcount);
public native void drawElementsInstancedANGLE(int mode,int count,int type,double offset,int primcount);
public native void vertexAttribDivisorANGLE(int index,int divisor);
}
