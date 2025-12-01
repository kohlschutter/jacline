package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.Algorithm;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.RsaPssParams",namespace = JsPackage.GLOBAL)
public interface RsaPssParams extends Algorithm{
@JsOverlay
static RsaPssParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getSaltLength();
@JsProperty
void setSaltLength(double saltLength);
}
