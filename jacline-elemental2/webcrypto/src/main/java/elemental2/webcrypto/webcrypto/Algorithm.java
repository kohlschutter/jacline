package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.Algorithm",namespace = JsPackage.GLOBAL)
public interface Algorithm{
@JsOverlay
static Algorithm create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getName();
@JsProperty
void setName(String name);
}
