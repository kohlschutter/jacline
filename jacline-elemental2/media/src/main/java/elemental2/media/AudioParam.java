package elemental2.media;
import java.lang.Deprecated;
import elemental2.core.Float32Array;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioParam{
public String automationRate;
public double defaultValue;
@Deprecated
public double maxValue;
@Deprecated
public double minValue;
@Deprecated
public double units;
public double value;
public native AudioParam cancelScheduledValues(double startTime);
public native AudioParam exponentialRampToValueAtTime(double value,double endTime);
public native AudioParam linearRampToValueAtTime(double value,double endTime);
public native AudioParam setTargetAtTime(double target,double startTime,double timeConstant);
@Deprecated
public native AudioParam setTargetValueAtTime(double target,double startTime,double timeConstant);
public native AudioParam setValueAtTime(double value,double startTime);
public native AudioParam setValueCurveAtTime(Float32Array values,double startTime,double duration);
}
