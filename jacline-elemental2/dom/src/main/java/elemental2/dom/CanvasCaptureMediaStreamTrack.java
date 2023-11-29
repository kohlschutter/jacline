package elemental2.dom;
import elemental2.dom.MediaStreamTrack;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.HTMLCanvasElement;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CanvasCaptureMediaStreamTrack extends MediaStreamTrack{
public HTMLCanvasElement canvas;
public native void requestFrame();
}
