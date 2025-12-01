package elemental2.webgl;
import org.jspecify.annotations.Nullable;
import elemental2.webgl.WebGLVertexArrayObjectOES;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class OES_vertex_array_object{
public double VERTEX_ARRAY_BINDING_OES;
public native void bindVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);
public native @Nullable WebGLVertexArrayObjectOES createVertexArrayOES();
public native void deleteVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);
public native boolean isVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);
}
