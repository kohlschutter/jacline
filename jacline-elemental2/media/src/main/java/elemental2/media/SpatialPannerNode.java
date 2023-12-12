package elemental2.media;
import elemental2.media.AudioParam;
import elemental2.media.AudioNode;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SpatialPannerNode extends AudioNode{
public double coneInnerAngle;
public double coneOuterAngle;
public double coneOuterGain;
public String distanceModel;
public double maxDistance;
public AudioParam orientationX;
public AudioParam orientationY;
public AudioParam orientationZ;
public String panningModel;
public AudioParam positionX;
public AudioParam positionY;
public AudioParam positionZ;
public double refDistance;
public double rolloffFactor;
}
