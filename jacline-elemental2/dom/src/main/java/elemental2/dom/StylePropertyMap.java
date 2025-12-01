package elemental2.dom;
import elemental2.dom.StylePropertyMapReadOnly;
import org.jspecify.annotations.Nullable;
import elemental2.dom.CSSStyleValue;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class StylePropertyMap extends StylePropertyMapReadOnly{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AppendValuesUnionType{
@JsOverlay
static StylePropertyMap.@Nullable AppendValuesUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable CSSStyleValue asCSSStyleValue(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isCSSStyleValue(){
return (Object)this instanceof CSSStyleValue;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetValuesUnionType{
@JsOverlay
static StylePropertyMap.@Nullable SetValuesUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable CSSStyleValue asCSSStyleValue(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isCSSStyleValue(){
return (Object)this instanceof CSSStyleValue;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public native void append(String property,StylePropertyMap.@Nullable AppendValuesUnionType... values);
@JsOverlay
public final void append(String property,CSSStyleValue... values){
append(property,Js.<StylePropertyMap.@Nullable AppendValuesUnionType[]>uncheckedCast(values));
}
@JsOverlay
public final void append(String property,String... values){
append(property,Js.<StylePropertyMap.@Nullable AppendValuesUnionType[]>uncheckedCast(values));
}
public native void append(String property);
public native void clear();
public native void delete(String property);
@JsOverlay
public final void set(String property,CSSStyleValue... values){
set(property,Js.<StylePropertyMap.@Nullable SetValuesUnionType[]>uncheckedCast(values));
}
public native void set(String property,StylePropertyMap.@Nullable SetValuesUnionType... values);
@JsOverlay
public final void set(String property,String... values){
set(property,Js.<StylePropertyMap.@Nullable SetValuesUnionType[]>uncheckedCast(values));
}
public native void set(String property);
}
