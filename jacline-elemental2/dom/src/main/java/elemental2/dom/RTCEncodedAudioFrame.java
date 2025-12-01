package elemental2.dom;
import elemental2.dom.RTCEncodedAudioFrameMetadata;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCEncodedAudioFrame{
public ArrayBuffer data;
public double timestamp;
public native RTCEncodedAudioFrameMetadata getMetadata();
}
