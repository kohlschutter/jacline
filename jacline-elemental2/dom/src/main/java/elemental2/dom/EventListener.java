package elemental2.dom;
import java.lang.FunctionalInterface;
import elemental2.dom.Event;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@FunctionalInterface
public interface EventListener{
void handleEvent(Event evt);
}
