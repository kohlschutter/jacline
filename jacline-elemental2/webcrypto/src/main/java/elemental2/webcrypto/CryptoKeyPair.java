package elemental2.webcrypto;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.webcrypto.CryptoKey;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CryptoKeyPair{
public CryptoKey privateKey;
public CryptoKey publicKey;
}
