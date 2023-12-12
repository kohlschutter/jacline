package elemental2.webgl;
import elemental2.webgl.WebGLVertexArrayObjectOES;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class OES_vertex_array_object{
public double VERTEX_ARRAY_BINDING_OES;
public native void bindVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
public native WebGLVertexArrayObjectOES createVertexArrayOES();
public native void deleteVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
public native boolean isVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
}
