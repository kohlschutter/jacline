package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
@Nullable Object onInvoke(FontFace p0,double p1,FontFaceSet p2);
}
@JsFunction
public interface OnloadingFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnloadingdoneFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnloadingerrorFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
void add(FontFace value);
boolean check(String font,String text);
boolean check(String font);
void clear();
void delete(FontFace value);
void forEach(FontFaceSet.ForEachCallbackFn callback,@Nullable JsObject selfObj);
@JsOverlay
default void forEach(FontFaceSet.ForEachCallbackFn callback,@Nullable Object selfObj){
forEach(callback,Js.<@Nullable JsObject>uncheckedCast(selfObj));
}
void forEach(FontFaceSet.ForEachCallbackFn callback);
@JsProperty
FontFaceSet.@Nullable OnloadingFn getOnloading();
@JsProperty
FontFaceSet.@Nullable OnloadingdoneFn getOnloadingdone();
@JsProperty
FontFaceSet.@Nullable OnloadingerrorFn getOnloadingerror();
@JsProperty
Promise<FontFaceSet> getReady();
@JsProperty
String getStatus();
boolean has(FontFace font);
Promise<JsArray<FontFace>> load(String font,String text);
Promise<JsArray<FontFace>> load(String font);
@JsProperty
void setOnloading(FontFaceSet.@Nullable OnloadingFn onloading);
@JsProperty
void setOnloadingdone(FontFaceSet.@Nullable OnloadingdoneFn onloadingdone);
@JsProperty
void setOnloadingerror(FontFaceSet.@Nullable OnloadingerrorFn onloadingerror);
@JsProperty
void setReady(Promise<FontFaceSet> ready);
@JsProperty
void setStatus(String status);
}
