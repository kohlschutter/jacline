package elemental2.media;
import elemental2.media.MediaKeyMessageEventInit;
import elemental2.dom.Event;
import elemental2.media.MediaKeySession;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaKeyMessageEvent extends Event{
public ArrayBuffer message;
public String messageType;
public MediaKeySession target;
public MediaKeyMessageEvent(String type,MediaKeyMessageEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
