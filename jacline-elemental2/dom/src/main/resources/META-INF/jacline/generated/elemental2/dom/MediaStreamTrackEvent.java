package elemental2.dom;
import elemental2.dom.Event;
import elemental2.dom.MediaStreamTrack;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.dom.MediaStreamTrackEventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaStreamTrackEvent extends Event{
public MediaStreamTrack track;
public MediaStreamTrackEvent(String type,MediaStreamTrackEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
