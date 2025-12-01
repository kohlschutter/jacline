package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.MediaKeyMessageEventInit;
import elemental2.dom.Event;
import elemental2.dom.MediaKeySession;
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
public MediaKeyMessageEvent(String type,@Nullable MediaKeyMessageEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
