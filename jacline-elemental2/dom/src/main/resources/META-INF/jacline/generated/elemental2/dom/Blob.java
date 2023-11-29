package elemental2.dom;
import elemental2.dom.BlobPropertyBag;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Blob{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorBlobPartsArrayUnionType{
@JsOverlay
static Blob.ConstructorBlobPartsArrayUnionType of(Object o){
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
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
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
public int size;
public String type;
public Blob(){}
public Blob(Blob.ConstructorBlobPartsArrayUnionType[] blobParts,BlobPropertyBag options){}
public Blob(Blob.ConstructorBlobPartsArrayUnionType[] blobParts){}
public Blob(JsArray<Blob.ConstructorBlobPartsArrayUnionType> blobParts,BlobPropertyBag options){}
public Blob(JsArray<Blob.ConstructorBlobPartsArrayUnionType> blobParts){}
public native Promise<ArrayBuffer> arrayBuffer();
public native Blob slice();
public native Blob slice(int start,int length,String contentType);
public native Blob slice(int start,int length);
public native Blob slice(int start);
public native Promise<String> text();
}
