package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FileSystemFlags{
@JsOverlay
static FileSystemFlags create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isCreate();
@JsProperty
boolean isExclusive();
@JsProperty
void setCreate(boolean create);
@JsProperty
void setExclusive(boolean exclusive);
}
