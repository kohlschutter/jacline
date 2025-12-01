package elemental2.dom;
import elemental2.dom.RTCEncodedVideoFrameMetadata;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCEncodedVideoFrame{
public ArrayBuffer data;
public double timestamp;
public String type;
public native RTCEncodedVideoFrameMetadata getMetadata();
}
