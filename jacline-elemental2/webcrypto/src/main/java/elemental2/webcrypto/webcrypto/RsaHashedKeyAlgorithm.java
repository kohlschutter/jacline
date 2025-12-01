package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import elemental2.webcrypto.webcrypto.RsaKeyAlgorithm;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.KeyAlgorithm;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.RsaHashedKeyAlgorithm",namespace = JsPackage.GLOBAL)
public interface RsaHashedKeyAlgorithm extends RsaKeyAlgorithm{
@JsOverlay
static RsaHashedKeyAlgorithm create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable KeyAlgorithm getHash();
@JsProperty
void setHash(@Nullable KeyAlgorithm hash);
}
