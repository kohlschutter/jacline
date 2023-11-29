package elemental2.dom;
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
static ConstrainDOMStringParameters.GetExactUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
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
static ConstrainDOMStringParameters.GetIdealUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
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
ConstrainDOMStringParameters.GetExactUnionType getExact();
@JsProperty
ConstrainDOMStringParameters.GetIdealUnionType getIdeal();
@JsProperty
void setExact(ConstrainDOMStringParameters.GetExactUnionType exact);
@JsOverlay
default void setExact(JsArray<String> exact){
setExact(Js.<ConstrainDOMStringParameters.GetExactUnionType>uncheckedCast(exact));
}
@JsOverlay
default void setExact(String exact){
setExact(Js.<ConstrainDOMStringParameters.GetExactUnionType>uncheckedCast(exact));
}
@JsOverlay
default void setExact(String[] exact){
setExact(Js.<JsArray<String>>uncheckedCast(exact));
}
@JsProperty
void setIdeal(ConstrainDOMStringParameters.GetIdealUnionType ideal);
@JsOverlay
default void setIdeal(JsArray<String> ideal){
setIdeal(Js.<ConstrainDOMStringParameters.GetIdealUnionType>uncheckedCast(ideal));
}
@JsOverlay
default void setIdeal(String ideal){
setIdeal(Js.<ConstrainDOMStringParameters.GetIdealUnionType>uncheckedCast(ideal));
}
@JsOverlay
default void setIdeal(String[] ideal){
setIdeal(Js.<JsArray<String>>uncheckedCast(ideal));
}
}
