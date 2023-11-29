package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCDataChannelInitInterface_{
@JsProperty
boolean isReliable();
@JsProperty
void setReliable(boolean reliable);
}
