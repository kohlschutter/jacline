package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ConstrainDOMStringParameters{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetExactUnionType{
@JsOverlay
static ConstrainDOMStringParameters.@Nullable GetExactUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetIdealUnionType{
@JsOverlay
static ConstrainDOMStringParameters.@Nullable GetIdealUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsOverlay
static ConstrainDOMStringParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ConstrainDOMStringParameters.@Nullable GetExactUnionType getExact();
@JsProperty
ConstrainDOMStringParameters.@Nullable GetIdealUnionType getIdeal();
@JsProperty
void setExact(ConstrainDOMStringParameters.@Nullable GetExactUnionType exact);
@JsOverlay
default void setExact(JsArray<String> exact){
setExact(Js.<ConstrainDOMStringParameters.@Nullable GetExactUnionType>uncheckedCast(exact));
}
@JsOverlay
default void setExact(String exact){
setExact(Js.<ConstrainDOMStringParameters.@Nullable GetExactUnionType>uncheckedCast(exact));
}
@JsOverlay
default void setExact(String[] exact){
setExact(Js.<JsArray<String>>uncheckedCast(exact));
}
@JsProperty
void setIdeal(ConstrainDOMStringParameters.@Nullable GetIdealUnionType ideal);
@JsOverlay
default void setIdeal(JsArray<String> ideal){
setIdeal(Js.<ConstrainDOMStringParameters.@Nullable GetIdealUnionType>uncheckedCast(ideal));
}
@JsOverlay
default void setIdeal(String ideal){
setIdeal(Js.<ConstrainDOMStringParameters.@Nullable GetIdealUnionType>uncheckedCast(ideal));
}
@JsOverlay
default void setIdeal(String[] ideal){
setIdeal(Js.<JsArray<String>>uncheckedCast(ideal));
}
}
