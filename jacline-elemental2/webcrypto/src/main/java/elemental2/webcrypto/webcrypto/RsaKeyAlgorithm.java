package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import elemental2.core.Uint8Array;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.KeyAlgorithm;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.RsaKeyAlgorithm",namespace = JsPackage.GLOBAL)
public interface RsaKeyAlgorithm extends KeyAlgorithm{
@JsOverlay
static RsaKeyAlgorithm create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getModulusLength();
@JsProperty
@Nullable Uint8Array getPublicExponent();
@JsProperty
void setModulusLength(double modulusLength);
@JsProperty
void setPublicExponent(@Nullable Uint8Array publicExponent);
}
