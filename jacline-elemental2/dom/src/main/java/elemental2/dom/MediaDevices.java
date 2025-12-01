package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import elemental2.dom.MediaDeviceInfo;
import elemental2.promise.Promise;
import elemental2.dom.DisplayMediaStreamOptions;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import elemental2.dom.MediaStreamConstraints;
import jsinterop.annotations.JsFunction;
import elemental2.dom.MediaStream;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MediaTrackSupportedConstraints;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaDevices extends EventTarget{
@JsFunction
public interface OndevicechangeFn{
@Nullable Object onInvoke(Event p0);
}
Promise<JsArray<MediaDeviceInfo>> enumerateDevices();
Promise<MediaStream> getDisplayMedia();
Promise<MediaStream> getDisplayMedia(DisplayMediaStreamOptions options);
@JsProperty
MediaDevices.@Nullable OndevicechangeFn getOndevicechange();
MediaTrackSupportedConstraints getSupportedConstraints();
Promise<MediaStream> getUserMedia(MediaStreamConstraints constraints);
@JsProperty
void setOndevicechange(MediaDevices.@Nullable OndevicechangeFn ondevicechange);
}
