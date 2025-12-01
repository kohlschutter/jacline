package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Deprecated;
import elemental2.core.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import elemental2.core.ObjectPropertyDescriptor;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "Object",namespace = JsPackage.GLOBAL)
public class JsObject{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DefinePropertyPropUnionType{
@JsOverlay
static JsObject.DefinePropertyPropUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Object asObject(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isObject(){
return (Object)this instanceof Object;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesArrayArrayUnionType<T extends @Nullable Object>{
@JsOverlay
static <T extends @Nullable Object> JsObject.EntriesArrayArrayUnionType<T> of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default T asT(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetOwnPropertyDescriptorPropUnionType{
@JsOverlay
static JsObject.GetOwnPropertyDescriptorPropUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Object asObject(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isObject(){
return (Object)this instanceof Object;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface HasOwnPropertyNameUnionType{
@JsOverlay
static JsObject.HasOwnPropertyNameUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Object asObject(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isObject(){
return (Object)this instanceof Object;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PropertyIsEnumerablePropertyNameUnionType{
@JsOverlay
static JsObject.PropertyIsEnumerablePropertyNameUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Object asObject(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isObject(){
return (Object)this instanceof Object;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public static native JsObject assign(JsObject target,@Nullable JsObject... var_args);
public static native JsObject assign(JsObject target);
@JsOverlay
public static final JsObject assign(Object target,@Nullable Object... var_args){
return assign(Js.<JsObject>uncheckedCast(target),Js.<@Nullable JsObject[]>uncheckedCast(var_args));
}
@JsOverlay
public static final JsObject assign(Object target){
return assign(Js.<JsObject>uncheckedCast(target));
}
public static native JsObject create(@Nullable JsObject proto,@Nullable JsPropertyMap<ObjectPropertyDescriptor<@Nullable Object>> properties);
public static native JsObject create(@Nullable JsObject proto);
@JsOverlay
public static final JsObject create(@Nullable Object proto,@Nullable JsPropertyMap<ObjectPropertyDescriptor<@Nullable Object>> properties){
return create(Js.<@Nullable JsObject>uncheckedCast(proto),properties);
}
@JsOverlay
public static final JsObject create(@Nullable Object proto){
return create(Js.<@Nullable JsObject>uncheckedCast(proto));
}
public static native <T extends @Nullable Object> T defineProperties(T obj,JsPropertyMap<ObjectPropertyDescriptor<T>> props);
public static native <T extends @Nullable Object> T defineProperty(T obj,JsObject.DefinePropertyPropUnionType prop,ObjectPropertyDescriptor<T> descriptor);
@JsOverlay
public static final <T extends @Nullable Object> T defineProperty(T obj,Object prop,ObjectPropertyDescriptor<T> descriptor){
return defineProperty(obj,Js.<JsObject.DefinePropertyPropUnionType>uncheckedCast(prop),descriptor);
}
@JsOverlay
public static final <T extends @Nullable Object> T defineProperty(T obj,String prop,ObjectPropertyDescriptor<T> descriptor){
return defineProperty(obj,Js.<JsObject.DefinePropertyPropUnionType>uncheckedCast(prop),descriptor);
}
public static native <T extends @Nullable Object> JsArray<JsArray<JsObject.EntriesArrayArrayUnionType<T>>> entries(JsPropertyMap<T> obj);
public static native <T extends @Nullable Object> T freeze(T obj);
public static native JsObject fromEntries(JsIterable<@Nullable Object, @Nullable Object, @Nullable Object> iter);
public static native <T extends @Nullable Object> ObjectPropertyDescriptor<T> getOwnPropertyDescriptor(T obj,JsObject.GetOwnPropertyDescriptorPropUnionType prop);
@JsOverlay
public static final <T extends @Nullable Object> ObjectPropertyDescriptor<T> getOwnPropertyDescriptor(T obj,Object prop){
return getOwnPropertyDescriptor(obj,Js.<JsObject.GetOwnPropertyDescriptorPropUnionType>uncheckedCast(prop));
}
@JsOverlay
public static final <T extends @Nullable Object> ObjectPropertyDescriptor<T> getOwnPropertyDescriptor(T obj,String prop){
return getOwnPropertyDescriptor(obj,Js.<JsObject.GetOwnPropertyDescriptorPropUnionType>uncheckedCast(prop));
}
public static native JsPropertyMap<ObjectPropertyDescriptor> getOwnPropertyDescriptors(JsObject obj);
@JsOverlay
public static final JsPropertyMap<ObjectPropertyDescriptor> getOwnPropertyDescriptors(Object obj){
return getOwnPropertyDescriptors(Js.<JsObject>uncheckedCast(obj));
}
public static native JsArray<String> getOwnPropertyNames(JsObject obj);
@JsOverlay
public static final JsArray<String> getOwnPropertyNames(Object obj){
return getOwnPropertyNames(Js.<JsObject>uncheckedCast(obj));
}
public static native JsArray<Object> getOwnPropertySymbols(JsObject obj);
@JsOverlay
public static final JsArray<Object> getOwnPropertySymbols(Object obj){
return getOwnPropertySymbols(Js.<JsObject>uncheckedCast(obj));
}
public static native @Nullable JsObject getPrototypeOf(JsObject obj);
@JsOverlay
public static final @Nullable JsObject getPrototypeOf(Object obj){
return getPrototypeOf(Js.<JsObject>uncheckedCast(obj));
}
public static native boolean hasOwn(JsObject obj,JsObject.HasOwnPropertyNameUnionType propertyName);
@JsOverlay
public static final boolean hasOwn(JsObject obj,Object propertyName){
return hasOwn(obj,Js.<JsObject.HasOwnPropertyNameUnionType>uncheckedCast(propertyName));
}
@JsOverlay
public static final boolean hasOwn(JsObject obj,String propertyName){
return hasOwn(obj,Js.<JsObject.HasOwnPropertyNameUnionType>uncheckedCast(propertyName));
}
@JsOverlay
public static final boolean hasOwn(Object obj,JsObject.HasOwnPropertyNameUnionType propertyName){
return hasOwn(Js.<JsObject>uncheckedCast(obj),propertyName);
}
@JsOverlay
public static final boolean hasOwn(Object obj,Object propertyName){
return hasOwn(Js.<JsObject>uncheckedCast(obj),propertyName);
}
@JsOverlay
public static final boolean hasOwn(Object obj,String propertyName){
return hasOwn(Js.<JsObject>uncheckedCast(obj),propertyName);
}
public static native boolean is(@Nullable Object a,@Nullable Object b);
public static native boolean isExtensible(JsObject obj);
@JsOverlay
public static final boolean isExtensible(Object obj){
return isExtensible(Js.<JsObject>uncheckedCast(obj));
}
public static native boolean isFrozen(JsObject obj);
@JsOverlay
public static final boolean isFrozen(Object obj){
return isFrozen(Js.<JsObject>uncheckedCast(obj));
}
public static native boolean isSealed(JsObject obj);
@JsOverlay
public static final boolean isSealed(Object obj){
return isSealed(Js.<JsObject>uncheckedCast(obj));
}
public static native JsArray<String> keys(JsObject obj);
@JsOverlay
public static final JsArray<String> keys(Object obj){
return keys(Js.<JsObject>uncheckedCast(obj));
}
public static native <T extends @Nullable Object> T preventExtensions(T obj);
public static native <T extends @Nullable Object> T seal(T obj);
public static native JsObject setPrototypeOf(JsObject obj,@Nullable Object proto);
@JsOverlay
public static final JsObject setPrototypeOf(Object obj,@Nullable Object proto){
return setPrototypeOf(Js.<JsObject>uncheckedCast(obj),proto);
}
public static native <T extends @Nullable Object> JsArray<T> values(JsPropertyMap<T> obj);
@Deprecated
public @Nullable JsObject __parent__;
public @Nullable JsObject __proto__;
public @Nullable Function constructor;
public JsObject(){}
public JsObject(@Nullable Object value){}
@Deprecated
public native void __defineGetter__(String sprop,@Nullable Function fun);
@Deprecated
public native void __defineSetter__(String sprop,@Nullable Function fun);
@Deprecated
public native @Nullable Function __lookupGetter__(String sprop);
@Deprecated
public native @Nullable Function __lookupSetter__(String sprop);
@Deprecated
public native @Nullable Object __noSuchMethod__(@Nullable Function fun);
public native boolean hasOwnProperty(@Nullable Object propertyName);
public native boolean isPrototypeOf(@Nullable JsObject other);
@JsOverlay
public final boolean isPrototypeOf(@Nullable Object other){
return isPrototypeOf(Js.<@Nullable JsObject>uncheckedCast(other));
}
@JsOverlay
public final boolean propertyIsEnumerable(Object propertyName){
return propertyIsEnumerable(Js.<JsObject.PropertyIsEnumerablePropertyNameUnionType>uncheckedCast(propertyName));
}
public native boolean propertyIsEnumerable(JsObject.PropertyIsEnumerablePropertyNameUnionType propertyName);
@JsOverlay
public final boolean propertyIsEnumerable(String propertyName){
return propertyIsEnumerable(Js.<JsObject.PropertyIsEnumerablePropertyNameUnionType>uncheckedCast(propertyName));
}
public native @Nullable Object toJSON();
public native @Nullable Object toJSON(String key);
public native String toLocaleString();
public native String toSource();
@JsMethod(name = "toString")
public native String toString_();
public native @Nullable Object valueOf();
}
