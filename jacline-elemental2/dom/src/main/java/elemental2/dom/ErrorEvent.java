package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import java.lang.Object;
import elemental2.dom.ErrorEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ErrorEvent extends Event{
public int colno;
public @Nullable Object error;
public String filename;
public int lineno;
public String message;
public ErrorEvent(String type,@Nullable ErrorEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public ErrorEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
