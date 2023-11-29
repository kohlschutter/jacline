package elemental2.dom;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.File;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DataTransferItem;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DataTransferItemList implements JsArrayLike<DataTransferItem>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddDataUnionType{
@JsOverlay
static DataTransferItemList.AddDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default File asFile(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isFile(){
return (Object)this instanceof File;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public int length;
public native DataTransferItem add(DataTransferItemList.AddDataUnionType data,String type);
public native DataTransferItem add(DataTransferItemList.AddDataUnionType data);
@JsOverlay
public final DataTransferItem add(File data,String type){
return add(Js.<DataTransferItemList.AddDataUnionType>uncheckedCast(data),type);
}
@JsOverlay
public final DataTransferItem add(File data){
return add(Js.<DataTransferItemList.AddDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final DataTransferItem add(String data,String type){
return add(Js.<DataTransferItemList.AddDataUnionType>uncheckedCast(data),type);
}
@JsOverlay
public final DataTransferItem add(String data){
return add(Js.<DataTransferItemList.AddDataUnionType>uncheckedCast(data));
}
public native void clear();
public native DataTransferItem item(double i);
public native void remove(int i);
}
