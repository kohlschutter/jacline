package elemental2.indexeddb;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface IDBVersionChangeEventInit extends EventInit{
@JsOverlay
static IDBVersionChangeEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable Double getNewVersion();
@JsProperty
double getOldVersion();
@JsProperty
void setNewVersion(@Nullable Double newVersion);
@JsProperty
void setOldVersion(double oldVersion);
}
