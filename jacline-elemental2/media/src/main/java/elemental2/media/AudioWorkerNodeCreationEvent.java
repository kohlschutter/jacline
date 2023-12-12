package elemental2.media;
import elemental2.media.AudioWorkerNodeProcessor;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorkerNodeCreationEvent extends Event{
public JsArray inputs;
public AudioWorkerNodeProcessor node;
public JsArray outputs;
public AudioWorkerNodeCreationEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
