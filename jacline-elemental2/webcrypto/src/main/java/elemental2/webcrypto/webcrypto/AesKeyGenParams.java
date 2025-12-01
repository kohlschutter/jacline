package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.Algorithm;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.AesKeyGenParams",namespace = JsPackage.GLOBAL)
public interface AesKeyGenParams extends Algorithm{
@JsOverlay
static AesKeyGenParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getLength();
@JsProperty
void setLength(double length);
}
