package elemental2.webgl;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WEBGL_draw_buffers{
public double COLOR_ATTACHMENT0_WEBGL;
public double COLOR_ATTACHMENT10_WEBGL;
public double COLOR_ATTACHMENT11_WEBGL;
public double COLOR_ATTACHMENT12_WEBGL;
public double COLOR_ATTACHMENT13_WEBGL;
public double COLOR_ATTACHMENT14_WEBGL;
public double COLOR_ATTACHMENT15_WEBGL;
public double COLOR_ATTACHMENT1_WEBGL;
public double COLOR_ATTACHMENT2_WEBGL;
public double COLOR_ATTACHMENT3_WEBGL;
public double COLOR_ATTACHMENT4_WEBGL;
public double COLOR_ATTACHMENT5_WEBGL;
public double COLOR_ATTACHMENT6_WEBGL;
public double COLOR_ATTACHMENT7_WEBGL;
public double COLOR_ATTACHMENT8_WEBGL;
public double COLOR_ATTACHMENT9_WEBGL;
public double DRAW_BUFFER0_WEBGL;
public double DRAW_BUFFER10_WEBGL;
public double DRAW_BUFFER11_WEBGL;
public double DRAW_BUFFER12_WEBGL;
public double DRAW_BUFFER13_WEBGL;
public double DRAW_BUFFER14_WEBGL;
public double DRAW_BUFFER15_WEBGL;
public double DRAW_BUFFER1_WEBGL;
public double DRAW_BUFFER2_WEBGL;
public double DRAW_BUFFER3_WEBGL;
public double DRAW_BUFFER4_WEBGL;
public double DRAW_BUFFER5_WEBGL;
public double DRAW_BUFFER6_WEBGL;
public double DRAW_BUFFER7_WEBGL;
public double DRAW_BUFFER8_WEBGL;
public double DRAW_BUFFER9_WEBGL;
public double MAX_COLOR_ATTACHMENTS_WEBGL;
public double MAX_DRAW_BUFFERS_WEBGL;
public native void drawBuffersWEBGL(JsArray<Double> buffers);
@JsOverlay
public final void drawBuffersWEBGL(double[] buffers){
drawBuffersWEBGL(Js.<JsArray<Double>>uncheckedCast(buffers));
}
}
