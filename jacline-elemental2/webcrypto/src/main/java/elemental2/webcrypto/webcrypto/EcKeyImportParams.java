package elemental2.webcrypto.webcrypto;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.webcrypto.webcrypto.Algorithm;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "webCrypto.EcKeyImportParams",namespace = JsPackage.GLOBAL)
public interface EcKeyImportParams extends Algorithm{
@JsOverlay
static EcKeyImportParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getNamedCurve();
@JsProperty
void setNamedCurve(String namedCurve);
}
