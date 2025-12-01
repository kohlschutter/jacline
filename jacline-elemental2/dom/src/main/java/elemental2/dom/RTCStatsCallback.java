package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.RTCStatsResponse;
import jsinterop.annotations.JsFunction;
import elemental2.dom.MediaStreamTrack;
import java.lang.Object;
@JsFunction
public interface RTCStatsCallback{
@Nullable Object onInvoke(RTCStatsResponse p0,@Nullable MediaStreamTrack p1);
}
