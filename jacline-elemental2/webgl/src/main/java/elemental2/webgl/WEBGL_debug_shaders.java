package elemental2.webgl;
import org.jspecify.annotations.Nullable;
import elemental2.webgl.WebGLShader;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WEBGL_debug_shaders{
public native String getTranslatedShaderSource(@Nullable WebGLShader shader);
}
