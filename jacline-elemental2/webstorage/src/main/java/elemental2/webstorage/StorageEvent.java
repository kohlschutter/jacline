package elemental2.webstorage;
import org.jspecify.annotations.Nullable;
import elemental2.dom.URL;
import elemental2.webstorage.Storage;
import elemental2.dom.Event;
import jsinterop.base.Js;
import elemental2.webstorage.StorageEventInit;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class StorageEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface InitStorageEventUrlArgUnionType{
@JsOverlay
static StorageEvent.InitStorageEventUrlArgUnionType of(Object o){
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
public String key;
public @Nullable String newValue;
public @Nullable String oldValue;
public @Nullable Storage storageArea;
public String url;
public StorageEvent(String type,StorageEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public StorageEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public native void initStorageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,String keyArg,@Nullable String oldValueArg,@Nullable String newValueArg,StorageEvent.InitStorageEventUrlArgUnionType urlArg,@Nullable Storage storageAreaArg);
@JsOverlay
public final void initStorageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,String keyArg,@Nullable String oldValueArg,@Nullable String newValueArg,String urlArg,@Nullable Storage storageAreaArg){
initStorageEvent(typeArg,canBubbleArg,cancelableArg,keyArg,oldValueArg,newValueArg,Js.<StorageEvent.InitStorageEventUrlArgUnionType>uncheckedCast(urlArg),storageAreaArg);
}
@JsOverlay
public final void initStorageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,String keyArg,@Nullable String oldValueArg,@Nullable String newValueArg,URL urlArg,@Nullable Storage storageAreaArg){
initStorageEvent(typeArg,canBubbleArg,cancelableArg,keyArg,oldValueArg,newValueArg,Js.<StorageEvent.InitStorageEventUrlArgUnionType>uncheckedCast(urlArg),storageAreaArg);
}
}
