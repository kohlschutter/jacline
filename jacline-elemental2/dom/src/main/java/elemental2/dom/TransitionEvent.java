package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import elemental2.dom.TransitionEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TransitionEvent extends Event{
public double elapsedTime;
public String propertyName;
public String pseudoElement;
public TransitionEvent(String type,TransitionEventInit transitionEventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public TransitionEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
