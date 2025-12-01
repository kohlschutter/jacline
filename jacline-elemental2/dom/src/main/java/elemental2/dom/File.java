package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Deprecated;
import elemental2.dom.FilePropertyBag;
import elemental2.dom.Blob;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class File extends Blob{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorContentsArrayUnionType{
@JsOverlay
static File.ConstructorContentsArrayUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default Blob asBlob(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@Deprecated
public String fileName;
@Deprecated
public String fileSize;
public double lastModified;
public @Nullable JsDate lastModifiedDate;
public String name;
public File(){}
public File(File.ConstructorContentsArrayUnionType[] contents,String name,@Nullable FilePropertyBag properties){}
public File(File.ConstructorContentsArrayUnionType[] contents,String name){}
public File(File.ConstructorContentsArrayUnionType[] contents){}
public File(JsArray<File.ConstructorContentsArrayUnionType> contents,String name,@Nullable FilePropertyBag properties){}
public File(JsArray<File.ConstructorContentsArrayUnionType> contents,String name){}
public File(JsArray<File.ConstructorContentsArrayUnionType> contents){}
}
