package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.KeyAlgorithm;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.EcKeyAlgorithm",namespace = JsPackage.GLOBAL)
public interface EcKeyAlgorithm extends KeyAlgorithm{
@JsOverlay
static EcKeyAlgorithm create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getNamedCurve();
@JsProperty
void setNamedCurve(String namedCurve);
}
