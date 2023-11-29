package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ProgressEventInit extends EventInit{
@JsOverlay
static ProgressEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getLoaded();
@JsProperty
double getTotal();
@JsProperty
boolean isLengthComputable();
@JsProperty
void setLengthComputable(boolean lengthComputable);
@JsProperty
void setLoaded(double loaded);
@JsProperty
void setTotal(double total);
}
