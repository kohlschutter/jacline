package elemental2.dom;
import elemental2.dom.WritableStream;
import org.jspecify.annotations.Nullable;
import elemental2.dom.ReadableStream;
import elemental2.dom.MediaStreamTrackGeneratorInit;
import jsinterop.annotations.JsFunction;
import elemental2.dom.MediaStreamTrack;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MediaStreamTrackEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaStreamTrackGenerator<T extends @Nullable Object> extends MediaStreamTrack{
@JsFunction
public interface OnaddtrackFn{
@Nullable Object onInvoke(MediaStreamTrackEvent p0);
}
@JsFunction
public interface OnremovetrackFn{
@Nullable Object onInvoke(MediaStreamTrackEvent p0);
}
public MediaStreamTrackGenerator.@Nullable OnaddtrackFn onaddtrack;
public MediaStreamTrackGenerator.@Nullable OnremovetrackFn onremovetrack;
public ReadableStream readableControl;
public WritableStream<T> writable;
public MediaStreamTrackGenerator(MediaStreamTrackGeneratorInit kind){}
}
