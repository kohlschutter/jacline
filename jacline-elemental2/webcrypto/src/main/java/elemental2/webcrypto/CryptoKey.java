package elemental2.webcrypto;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CryptoKey{
public JsObject algorithm;
public boolean extractable;
public String type;
public JsObject usages;
}
