package elemental2.media;
import java.lang.Deprecated;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@Deprecated
public class AudioListener{
@Deprecated
public double dopplerFactor;
@Deprecated
public double gain;
@Deprecated
public double speedOfSound;
@Deprecated
public native Object setOrientation(double x,double y,double z,double xUp,double yUp,double zUp);
@Deprecated
public native Object setPosition(double x,double y,double z);
@Deprecated
public native Object setVelocity(double x,double y,double z);
}
