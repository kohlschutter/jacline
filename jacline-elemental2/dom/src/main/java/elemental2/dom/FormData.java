package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import elemental2.dom.File;
import elemental2.dom.Blob;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FormData implements JsIterable<JsArray<FormData.JsIterableTypeParameterArrayUnionType>, @Nullable Object, @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AppendValueUnionType{
@JsOverlay
static FormData.@Nullable AppendValueUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable Blob asBlob(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAllArrayUnionType{
@JsOverlay
static FormData.GetAllArrayUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetUnionType{
@JsOverlay
static FormData.@Nullable GetUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable File asFile(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface JsIterableTypeParameterArrayUnionType{
@JsOverlay
static FormData.JsIterableTypeParameterArrayUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetValueUnionType{
@JsOverlay
static FormData.SetValueUnionType of(Object o){
return Js.cast(o);
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
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public FormData(){}
public FormData(@Nullable Element form){}
public native void append(String name,FormData.@Nullable AppendValueUnionType value,String filename);
public native void append(String name,FormData.@Nullable AppendValueUnionType value);
@JsOverlay
public final void append(String name,Blob value,String filename){
append(name,Js.<FormData.@Nullable AppendValueUnionType>uncheckedCast(value),filename);
}
@JsOverlay
public final void append(String name,Blob value){
append(name,Js.<FormData.@Nullable AppendValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void append(String name,String value,String filename){
append(name,Js.<FormData.@Nullable AppendValueUnionType>uncheckedCast(value),filename);
}
@JsOverlay
public final void append(String name,String value){
append(name,Js.<FormData.@Nullable AppendValueUnionType>uncheckedCast(value));
}
public native void delete(String name);
public native FormData.@Nullable GetUnionType get(String name);
public native JsArray<FormData.GetAllArrayUnionType> getAll(String name);
public native boolean has(String name);
@JsOverlay
public final void set(String name,Blob value,String filename){
set(name,Js.<FormData.SetValueUnionType>uncheckedCast(value),filename);
}
@JsOverlay
public final void set(String name,Blob value){
set(name,Js.<FormData.SetValueUnionType>uncheckedCast(value));
}
public native void set(String name,FormData.SetValueUnionType value,String filename);
public native void set(String name,FormData.SetValueUnionType value);
@JsOverlay
public final void set(String name,String value,String filename){
set(name,Js.<FormData.SetValueUnionType>uncheckedCast(value),filename);
}
@JsOverlay
public final void set(String name,String value){
set(name,Js.<FormData.SetValueUnionType>uncheckedCast(value));
}
}
