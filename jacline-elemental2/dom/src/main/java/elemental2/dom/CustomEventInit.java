package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface CustomEventInit<T extends @Nullable Object> extends EventInit{
@JsOverlay
static <T extends @Nullable Object> CustomEventInit<T> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
T getDetail();
@JsProperty
void setDetail(T detail);
}
