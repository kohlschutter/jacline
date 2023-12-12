package elemental2.media;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ConstantSourceOptions{
@JsOverlay
double offset=ConstantSourceOptions__Constants.offset;
@JsOverlay
static ConstantSourceOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
}
