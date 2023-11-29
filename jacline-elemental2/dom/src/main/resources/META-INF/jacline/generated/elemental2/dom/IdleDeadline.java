package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface IdleDeadline{
@JsProperty
boolean isDidTimeout();
@JsProperty
void setDidTimeout(boolean didTimeout);
double timeRemaining();
}
