package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MutationEvent extends Event{
public int attrChange;
public String attrName;
public String newValue;
public String prevValue;
public @Nullable Node relatedNode;
public MutationEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public native void initMutationEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,@Nullable Node relatedNodeArg,String prevValueArg,String newValueArg,String attrNameArg,int attrChangeArg);
}
