package elemental2.media;
import elemental2.media.AudioNode;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PannerNode extends AudioNode{
public double coneInnerAngle;
public double coneOuterAngle;
public double coneOuterGain;
public String distanceModel;
public double maxDistance;
public String panningModel;
public double refDistance;
public double rolloffFactor;
public native Object setOrientation(double x,double y,double z);
public native Object setPosition(double x,double y,double z);
public native Object setVelocity(double x,double y,double z);
}
