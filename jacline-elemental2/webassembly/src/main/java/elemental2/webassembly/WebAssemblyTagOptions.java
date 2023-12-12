package elemental2.webassembly;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WebAssemblyTagOptions{
@JsOverlay
static WebAssemblyTagOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<String> getParameters();
@JsProperty
void setParameters(JsArray<String> parameters);
@JsOverlay
default void setParameters(String[] parameters){
setParameters(Js.<JsArray<String>>uncheckedCast(parameters));
}
}
