package elemental2.dom;
import elemental2.dom.ExtendableEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ExtendableEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SyncEvent extends ExtendableEvent{
public boolean lastChance;
public String tag;
public SyncEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(ExtendableEventInit)null);
}
}
