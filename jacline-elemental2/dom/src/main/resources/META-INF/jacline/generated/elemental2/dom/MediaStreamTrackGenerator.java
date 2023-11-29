package elemental2.dom;
import elemental2.dom.WritableStream;
import elemental2.dom.ReadableStream;
import elemental2.dom.MediaStreamTrackGeneratorInit;
import jsinterop.annotations.JsFunction;
import elemental2.dom.MediaStreamTrack;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MediaStreamTrackEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaStreamTrackGenerator<T> extends MediaStreamTrack{
@JsFunction
public interface OnaddtrackFn{
Object onInvoke(MediaStreamTrackEvent p0);
}
@JsFunction
public interface OnremovetrackFn{
Object onInvoke(MediaStreamTrackEvent p0);
}
public MediaStreamTrackGenerator.OnaddtrackFn onaddtrack;
public MediaStreamTrackGenerator.OnremovetrackFn onremovetrack;
public ReadableStream readableControl;
public WritableStream<T> writable;
public MediaStreamTrackGenerator(MediaStreamTrackGeneratorInit kind){}
}
