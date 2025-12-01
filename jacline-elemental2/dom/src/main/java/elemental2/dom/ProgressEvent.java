package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ProgressEventInit;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ProgressEvent<TARGET extends @Nullable Object> extends Event{
public boolean lengthComputable;
public double loaded;
public TARGET target;
public double total;
public ProgressEvent(String type,@Nullable ProgressEventInit progressEventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public ProgressEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
