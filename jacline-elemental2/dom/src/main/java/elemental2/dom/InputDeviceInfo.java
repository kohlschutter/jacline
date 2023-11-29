package elemental2.dom;
import elemental2.dom.MediaTrackCapabilities;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MediaDeviceInfo;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface InputDeviceInfo extends MediaDeviceInfo{
MediaTrackCapabilities getCapabilities();
}
