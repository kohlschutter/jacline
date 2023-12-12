package elemental2.media;
import elemental2.media.AudioParam;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SpatialListener{
public AudioParam forwardX;
public AudioParam forwardY;
public AudioParam forwardZ;
public AudioParam positionX;
public AudioParam positionY;
public AudioParam positionZ;
public AudioParam upX;
public AudioParam upY;
public AudioParam upZ;
}
