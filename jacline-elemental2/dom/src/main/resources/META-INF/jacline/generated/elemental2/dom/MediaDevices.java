package elemental2.dom;
import elemental2.dom.MediaStreamConstraints;
import elemental2.dom.MediaStream;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.MediaTrackSupportedConstraints;
import elemental2.dom.MediaDeviceInfo;
import elemental2.dom.DisplayMediaStreamOptions;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaDevices extends EventTarget{
Promise<JsArray<MediaDeviceInfo>> enumerateDevices();
Promise<MediaStream> getDisplayMedia();
Promise<MediaStream> getDisplayMedia(DisplayMediaStreamOptions options);
MediaTrackSupportedConstraints getSupportedConstraints();
Promise<MediaStream> getUserMedia(MediaStreamConstraints constraints);
}
