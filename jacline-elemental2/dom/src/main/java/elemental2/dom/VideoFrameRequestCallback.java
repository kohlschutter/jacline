package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.VideoFrameMetadata;
import jsinterop.annotations.JsFunction;
@JsFunction
public interface VideoFrameRequestCallback{
void onInvoke(double now,@Nullable VideoFrameMetadata metadata);
}
