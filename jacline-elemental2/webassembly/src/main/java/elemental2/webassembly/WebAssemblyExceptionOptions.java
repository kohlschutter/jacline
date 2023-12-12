package elemental2.webassembly;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WebAssemblyExceptionOptions{
@JsOverlay
static WebAssemblyExceptionOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isTraceStack();
@JsProperty
void setTraceStack(boolean traceStack);
}
