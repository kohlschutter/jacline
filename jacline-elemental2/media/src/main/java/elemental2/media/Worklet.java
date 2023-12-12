package elemental2.media;
import java.lang.Void;
import elemental2.media.WorkletOptions;
import jsinterop.base.Js;
import elemental2.dom.URL;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Worklet{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddModuleModuleURLUnionType{
@JsOverlay
static Worklet.AddModuleModuleURLUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
Promise<Void> addModule(Worklet.AddModuleModuleURLUnionType moduleURL,WorkletOptions options);
Promise<Void> addModule(Worklet.AddModuleModuleURLUnionType moduleURL);
@JsOverlay
default Promise<Void> addModule(String moduleURL,WorkletOptions options){
return addModule(Js.<Worklet.AddModuleModuleURLUnionType>uncheckedCast(moduleURL),options);
}
@JsOverlay
default Promise<Void> addModule(String moduleURL){
return addModule(Js.<Worklet.AddModuleModuleURLUnionType>uncheckedCast(moduleURL));
}
@JsOverlay
default Promise<Void> addModule(URL moduleURL,WorkletOptions options){
return addModule(Js.<Worklet.AddModuleModuleURLUnionType>uncheckedCast(moduleURL),options);
}
@JsOverlay
default Promise<Void> addModule(URL moduleURL){
return addModule(Js.<Worklet.AddModuleModuleURLUnionType>uncheckedCast(moduleURL));
}
}
