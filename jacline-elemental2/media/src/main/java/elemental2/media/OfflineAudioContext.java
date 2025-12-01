package elemental2.media;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.media.AudioBuffer;
import elemental2.media.OfflineAudioCompletionEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class OfflineAudioContext extends BaseAudioContext{
@JsFunction
public interface OncompleteFn{
@Nullable Object onInvoke(OfflineAudioCompletionEvent p0);
}
public OfflineAudioContext.OncompleteFn oncomplete;
public OfflineAudioContext(int numberOfChannels,int length,double sampleRate){}
public native Promise<AudioBuffer> startRendering();
}
