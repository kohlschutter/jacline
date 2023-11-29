package elemental2.dom;
import elemental2.dom.VideoFrameMetadata;
import jsinterop.annotations.JsFunction;
@JsFunction
public interface VideoFrameRequestCallback{
void onInvoke(double now,VideoFrameMetadata metadata);
}
