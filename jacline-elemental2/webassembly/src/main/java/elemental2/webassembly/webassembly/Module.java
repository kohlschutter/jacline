package elemental2.webassembly.webassembly;
import elemental2.core.ArrayBuffer;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "WebAssembly.Module",namespace = JsPackage.GLOBAL)
public class Module{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorBytesUnionType{
@JsOverlay
static Module.ConstructorBytesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ExportsReturnType{
@JsOverlay
static Module.ExportsReturnType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getKind();
@JsProperty
String getName();
@JsProperty
void setKind(String kind);
@JsProperty
void setName(String name);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ImportsReturnType{
@JsOverlay
static Module.ImportsReturnType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getKind();
@JsProperty
String getModule();
@JsProperty
String getName();
@JsProperty
void setKind(String kind);
@JsProperty
void setModule(String module);
@JsProperty
void setName(String name);
}
public static native JsArray<ArrayBuffer> customSections(Module moduleObject,String sectionName);
public static native JsArray<Module.ExportsReturnType> exports(Module moduleObject);
public static native JsArray<Module.ImportsReturnType> imports(Module moduleObject);
public Module(ArrayBuffer bytes){}
public Module(ArrayBufferView bytes){}
public Module(Module.ConstructorBytesUnionType bytes){}
}
