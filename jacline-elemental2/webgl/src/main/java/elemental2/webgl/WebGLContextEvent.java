package elemental2.webgl;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WebGLContextEvent extends Event{
public String statusMessage;
public WebGLContextEvent(String eventType){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
