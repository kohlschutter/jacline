package elemental2.webgl;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface EXT_color_buffer_half_float{
@JsProperty(name = "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT")
double getFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT();
@JsProperty(name = "RGB16F_EXT")
double getRGB16F_EXT();
@JsProperty(name = "RGBA16F_EXT")
double getRGBA16F_EXT();
@JsProperty(name = "UNSIGNED_NORMALIZED_EXT")
double getUNSIGNED_NORMALIZED_EXT();
}
