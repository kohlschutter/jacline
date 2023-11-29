package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextTrackCue{
public double endTime;
public String id;
public double startTime;
public String text;
public TextTrackCue(double startTime,double endTime,String text){}
}
