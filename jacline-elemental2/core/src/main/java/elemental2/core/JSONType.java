package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class JSONType{
@JsFunction
public interface ParseReviverFn{
@Nullable Object onInvoke(String p0,@Nullable Object p1);
}
@JsFunction
public interface StringifyReplacerFn{
@Nullable Object onInvoke(String p0,@Nullable Object p1);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface StringifyReplacerUnionType{
@JsOverlay
static JSONType.@Nullable StringifyReplacerUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JSONType.@Nullable StringifyReplacerFn asStringifyReplacerFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isStringifyReplacerFn(){
return (Object)this instanceof JSONType.StringifyReplacerFn;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface StringifySpaceUnionType{
@JsOverlay
static JSONType.StringifySpaceUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public native @Nullable Object parse(String jsonStr,JSONType.ParseReviverFn reviver);
public native @Nullable Object parse(String jsonStr);
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JsArray<String> replacer,String space){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer),Js.<JSONType.StringifySpaceUnionType>uncheckedCast(space));
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JsArray<String> replacer,JSONType.StringifySpaceUnionType space){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer),space);
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JsArray<String> replacer,int space){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer),Js.<JSONType.StringifySpaceUnionType>uncheckedCast(space));
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JsArray<String> replacer){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer));
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,String[] replacer,String space){
return stringify(jsonObj,Js.<JsArray<String>>uncheckedCast(replacer),space);
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,String[] replacer,JSONType.StringifySpaceUnionType space){
return stringify(jsonObj,Js.<JsArray<String>>uncheckedCast(replacer),space);
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,String[] replacer,int space){
return stringify(jsonObj,Js.<JsArray<String>>uncheckedCast(replacer),space);
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,String[] replacer){
return stringify(jsonObj,Js.<JsArray<String>>uncheckedCast(replacer));
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JSONType.StringifyReplacerFn replacer,String space){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer),Js.<JSONType.StringifySpaceUnionType>uncheckedCast(space));
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JSONType.StringifyReplacerFn replacer,JSONType.StringifySpaceUnionType space){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer),space);
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JSONType.StringifyReplacerFn replacer,int space){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer),Js.<JSONType.StringifySpaceUnionType>uncheckedCast(space));
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JSONType.StringifyReplacerFn replacer){
return stringify(jsonObj,Js.<JSONType.@Nullable StringifyReplacerUnionType>uncheckedCast(replacer));
}
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JSONType.@Nullable StringifyReplacerUnionType replacer,String space){
return stringify(jsonObj,replacer,Js.<JSONType.StringifySpaceUnionType>uncheckedCast(space));
}
public native String stringify(@Nullable Object jsonObj,JSONType.@Nullable StringifyReplacerUnionType replacer,JSONType.StringifySpaceUnionType space);
@JsOverlay
public final String stringify(@Nullable Object jsonObj,JSONType.@Nullable StringifyReplacerUnionType replacer,int space){
return stringify(jsonObj,replacer,Js.<JSONType.StringifySpaceUnionType>uncheckedCast(space));
}
public native String stringify(@Nullable Object jsonObj,JSONType.@Nullable StringifyReplacerUnionType replacer);
public native String stringify(@Nullable Object jsonObj);
}
