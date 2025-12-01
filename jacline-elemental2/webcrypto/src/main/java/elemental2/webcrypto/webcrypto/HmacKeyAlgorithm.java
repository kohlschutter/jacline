package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.KeyAlgorithm;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.HmacKeyAlgorithm",namespace = JsPackage.GLOBAL)
public interface HmacKeyAlgorithm extends KeyAlgorithm{
@JsOverlay
static HmacKeyAlgorithm create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
KeyAlgorithm getHash();
@JsProperty
double getLength();
@JsProperty
void setHash(KeyAlgorithm hash);
@JsProperty
void setLength(double length);
}
