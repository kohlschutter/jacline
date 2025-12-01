package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.Algorithm;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.webcrypto.CryptoKey;
@JsType(isNative = true,name = "webCrypto.EcKeyDeriveParams",namespace = JsPackage.GLOBAL)
public interface EcKeyDeriveParams extends Algorithm{
@JsOverlay
static EcKeyDeriveParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
CryptoKey getPublic();
@JsProperty
void setPublic(CryptoKey public_);
}
