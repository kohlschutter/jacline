package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.BlobPropertyBag;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FilePropertyBag extends BlobPropertyBag{
@JsOverlay
static FilePropertyBag create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getLastModified();
@JsProperty
void setLastModified(double lastModified);
}
