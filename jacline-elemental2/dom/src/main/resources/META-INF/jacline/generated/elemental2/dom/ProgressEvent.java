package elemental2.dom;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ProgressEventInit;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ProgressEvent<TARGET> extends Event{
public boolean lengthComputable;
public double loaded;
public TARGET target;
public double total;
public ProgressEvent(String type,ProgressEventInit progressEventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public ProgressEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
