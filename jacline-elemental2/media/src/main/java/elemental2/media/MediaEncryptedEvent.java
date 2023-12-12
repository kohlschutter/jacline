package elemental2.media;
import elemental2.media.MediaEncryptedEventInit;
import elemental2.dom.Event;
import elemental2.dom.HTMLMediaElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaEncryptedEvent extends Event{
public ArrayBuffer initData;
public String initDataType;
public HTMLMediaElement target;
public MediaEncryptedEvent(String type,MediaEncryptedEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public MediaEncryptedEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
