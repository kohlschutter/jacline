package elemental2.dom;
import elemental2.dom.Event;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.FontFace;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FontFaceSet extends EventTarget{
@JsFunction
public interface ForEachCallbackFn{
Object onInvoke(FontFace p0,double p1,FontFaceSet p2);
}
@JsFunction
public interface OnloadingFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadingdoneFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadingerrorFn{
Object onInvoke(Event p0);
}
void add(FontFace value);
boolean check(String font,String text);
boolean check(String font);
void clear();
void delete(FontFace value);
void forEach(FontFaceSet.ForEachCallbackFn callback,JsObject selfObj);
@JsOverlay
default void forEach(FontFaceSet.ForEachCallbackFn callback,Object selfObj){
forEach(callback,Js.<JsObject>uncheckedCast(selfObj));
}
void forEach(FontFaceSet.ForEachCallbackFn callback);
@JsProperty
FontFaceSet.OnloadingFn getOnloading();
@JsProperty
FontFaceSet.OnloadingdoneFn getOnloadingdone();
@JsProperty
FontFaceSet.OnloadingerrorFn getOnloadingerror();
@JsProperty
Promise<FontFaceSet> getReady();
@JsProperty
String getStatus();
boolean has(FontFace font);
Promise<JsArray<FontFace>> load(String font,String text);
Promise<JsArray<FontFace>> load(String font);
@JsProperty
void setOnloading(FontFaceSet.OnloadingFn onloading);
@JsProperty
void setOnloadingdone(FontFaceSet.OnloadingdoneFn onloadingdone);
@JsProperty
void setOnloadingerror(FontFaceSet.OnloadingerrorFn onloadingerror);
@JsProperty
void setReady(Promise<FontFaceSet> ready);
@JsProperty
void setStatus(String status);
}
