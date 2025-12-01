package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.Algorithm;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.EcKeyGenParams",namespace = JsPackage.GLOBAL)
public interface EcKeyGenParams extends Algorithm{
@JsOverlay
static EcKeyGenParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getNamedCurve();
@JsProperty
void setNamedCurve(String namedCurve);
}
