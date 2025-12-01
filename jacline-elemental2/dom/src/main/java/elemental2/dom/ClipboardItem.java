package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.ClipboardItemOptions;
import elemental2.dom.Blob;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ClipboardItem{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorItemsJsPropertyMapTypeParameterUnionType{
@JsOverlay
static ClipboardItem.ConstructorItemsJsPropertyMapTypeParameterUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Blob asBlob(){
return Js.cast(this);
}
@JsOverlay
default Promise<@Nullable Object> asPromise(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isPromise(){
return (Object)this instanceof Promise;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public JsArray<String> types;
public ClipboardItem(JsPropertyMap<ClipboardItem.ConstructorItemsJsPropertyMapTypeParameterUnionType> items,@Nullable ClipboardItemOptions options){}
public ClipboardItem(JsPropertyMap<ClipboardItem.ConstructorItemsJsPropertyMapTypeParameterUnionType> items){}
public native Promise<Blob> getType(String type);
}
