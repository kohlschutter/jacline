package elemental2.dom;
import elemental2.core.JsIterable;
import java.lang.Double;
import java.lang.Deprecated;
import elemental2.dom.CSSProperties;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.CSSValue;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSStyleDeclaration extends CSSProperties implements JsIterable<String>, JsArrayLike<String>, JsPropertyMap<String>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAttributeUnionType{
@JsOverlay
static CSSStyleDeclaration.GetAttributeUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetExpressionUnionType{
@JsOverlay
static CSSStyleDeclaration.GetExpressionUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public String cssText;
public int length;
public CSSRule parentRule;
public native CSSStyleDeclaration.GetAttributeUnionType getAttribute(String name,double flags);
public native CSSStyleDeclaration.GetAttributeUnionType getAttribute(String name);
public native CSSStyleDeclaration.GetExpressionUnionType getExpression(String name);
public native CSSValue getPropertyCSSValue(String propertyName);
public native String getPropertyPriority(String propertyName);
public native String getPropertyValue(String propertyName);
public native String item(int index);
public native boolean removeAttribute(String name,double flags);
public native boolean removeAttribute(String name);
public native boolean removeExpression(String name);
public native String removeProperty(String propertyName);
@Deprecated
public native void setAttribute(String name,Object value,double flags);
@Deprecated
public native void setAttribute(String name,Object value);
public native void setExpression(String name,String expr,String language);
public native void setExpression(String name,String expr);
public native void setProperty(String propertyName,String value,String priority);
public native void setProperty(String propertyName,String value);
}
