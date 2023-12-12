package elemental2.media;
import elemental2.media.AudioWorkerNodeProcessor;
import elemental2.dom.Event;
import elemental2.core.Float32Array;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioProcessEvent extends Event{
public Float32Array inputs;
public AudioWorkerNodeProcessor node;
public Float32Array outputs;
public JsObject parameters;
public double playbackTime;
public AudioProcessEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
