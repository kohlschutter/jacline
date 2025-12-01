package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsConstructorFn;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.ObjectPropertyDescriptor;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ProxyHandler<TARGET extends @Nullable Object>{
@JsFunction
public interface ApplyFn<TARGET extends @Nullable Object>{
@Nullable Object onInvoke(TARGET p0,@Nullable Object p1,JsArray p2);
}
@JsFunction
public interface ConstructFn<TARGET extends @Nullable Object>{
@JsOverlay
default JsObject onInvoke(TARGET p0,JsArray p1,Class<?> p2){
return onInvoke(p0,p1,Js.asConstructorFn(p2));
}
JsObject onInvoke(TARGET p0,JsArray p1,JsConstructorFn<?> p2);
}
@JsFunction
public interface DefinePropertyFn<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P1UnionType{
@JsOverlay
static ProxyHandler.DefinePropertyFn.P1UnionType of(Object o){
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
@JsOverlay
default boolean onInvoke(TARGET p0,Object p1,ObjectPropertyDescriptor p2){
return onInvoke(p0,Js.<ProxyHandler.DefinePropertyFn.P1UnionType>uncheckedCast(p1),p2);
}
boolean onInvoke(TARGET p0,ProxyHandler.DefinePropertyFn.P1UnionType p1,ObjectPropertyDescriptor p2);
@JsOverlay
default boolean onInvoke(TARGET p0,String p1,ObjectPropertyDescriptor p2){
return onInvoke(p0,Js.<ProxyHandler.DefinePropertyFn.P1UnionType>uncheckedCast(p1),p2);
}
}
@JsFunction
public interface DeletePropertyFn<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P1UnionType{
@JsOverlay
static ProxyHandler.DeletePropertyFn.P1UnionType of(Object o){
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
@JsOverlay
default boolean onInvoke(TARGET p0,Object p1){
return onInvoke(p0,Js.<ProxyHandler.DeletePropertyFn.P1UnionType>uncheckedCast(p1));
}
boolean onInvoke(TARGET p0,ProxyHandler.DeletePropertyFn.P1UnionType p1);
@JsOverlay
default boolean onInvoke(TARGET p0,String p1){
return onInvoke(p0,Js.<ProxyHandler.DeletePropertyFn.P1UnionType>uncheckedCast(p1));
}
}
@JsFunction
public interface GetFn<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P1UnionType{
@JsOverlay
static ProxyHandler.GetFn.P1UnionType of(Object o){
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
@JsOverlay
default @Nullable Object onInvoke(TARGET p0,Object p1,JsObject p2){
return onInvoke(p0,Js.<ProxyHandler.GetFn.P1UnionType>uncheckedCast(p1),p2);
}
@JsOverlay
default @Nullable Object onInvoke(TARGET p0,Object p1,Object p2){
return onInvoke(p0,p1,Js.<JsObject>uncheckedCast(p2));
}
@Nullable Object onInvoke(TARGET p0,ProxyHandler.GetFn.P1UnionType p1,JsObject p2);
@JsOverlay
default @Nullable Object onInvoke(TARGET p0,ProxyHandler.GetFn.P1UnionType p1,Object p2){
return onInvoke(p0,p1,Js.<JsObject>uncheckedCast(p2));
}
@JsOverlay
default @Nullable Object onInvoke(TARGET p0,String p1,JsObject p2){
return onInvoke(p0,Js.<ProxyHandler.GetFn.P1UnionType>uncheckedCast(p1),p2);
}
@JsOverlay
default @Nullable Object onInvoke(TARGET p0,String p1,Object p2){
return onInvoke(p0,p1,Js.<JsObject>uncheckedCast(p2));
}
}
@JsFunction
public interface GetOwnPropertyDescriptorFn<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P1UnionType{
@JsOverlay
static ProxyHandler.GetOwnPropertyDescriptorFn.P1UnionType of(Object o){
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
@JsOverlay
default ObjectPropertyDescriptor onInvoke(TARGET p0,Object p1){
return onInvoke(p0,Js.<ProxyHandler.GetOwnPropertyDescriptorFn.P1UnionType>uncheckedCast(p1));
}
ObjectPropertyDescriptor onInvoke(TARGET p0,ProxyHandler.GetOwnPropertyDescriptorFn.P1UnionType p1);
@JsOverlay
default ObjectPropertyDescriptor onInvoke(TARGET p0,String p1){
return onInvoke(p0,Js.<ProxyHandler.GetOwnPropertyDescriptorFn.P1UnionType>uncheckedCast(p1));
}
}
@JsFunction
public interface GetPrototypeOfFn<TARGET extends @Nullable Object>{
@Nullable JsObject onInvoke(TARGET p0);
}
@JsFunction
public interface HasFn<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P1UnionType{
@JsOverlay
static ProxyHandler.HasFn.P1UnionType of(Object o){
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
@JsOverlay
default boolean onInvoke(TARGET p0,Object p1){
return onInvoke(p0,Js.<ProxyHandler.HasFn.P1UnionType>uncheckedCast(p1));
}
boolean onInvoke(TARGET p0,ProxyHandler.HasFn.P1UnionType p1);
@JsOverlay
default boolean onInvoke(TARGET p0,String p1){
return onInvoke(p0,Js.<ProxyHandler.HasFn.P1UnionType>uncheckedCast(p1));
}
}
@JsFunction
public interface IsExtensibleFn<TARGET extends @Nullable Object>{
boolean onInvoke(TARGET p0);
}
@JsFunction
public interface OwnKeysFn<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ArrayUnionType{
@JsOverlay
static ProxyHandler.OwnKeysFn.ArrayUnionType of(Object o){
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
JsArray<ProxyHandler.OwnKeysFn.ArrayUnionType> onInvoke(TARGET p0);
}
@JsFunction
public interface PreventExtensionsFn<TARGET extends @Nullable Object>{
boolean onInvoke(TARGET p0);
}
@JsFunction
public interface SetFn<TARGET extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P1UnionType{
@JsOverlay
static ProxyHandler.SetFn.P1UnionType of(Object o){
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
@JsOverlay
default boolean onInvoke(TARGET p0,Object p1,@Nullable Object p2,JsObject p3){
return onInvoke(p0,Js.<ProxyHandler.SetFn.P1UnionType>uncheckedCast(p1),p2,p3);
}
@JsOverlay
default boolean onInvoke(TARGET p0,Object p1,@Nullable Object p2,Object p3){
return onInvoke(p0,p1,p2,Js.<JsObject>uncheckedCast(p3));
}
boolean onInvoke(TARGET p0,ProxyHandler.SetFn.P1UnionType p1,@Nullable Object p2,JsObject p3);
@JsOverlay
default boolean onInvoke(TARGET p0,ProxyHandler.SetFn.P1UnionType p1,@Nullable Object p2,Object p3){
return onInvoke(p0,p1,p2,Js.<JsObject>uncheckedCast(p3));
}
@JsOverlay
default boolean onInvoke(TARGET p0,String p1,@Nullable Object p2,JsObject p3){
return onInvoke(p0,Js.<ProxyHandler.SetFn.P1UnionType>uncheckedCast(p1),p2,p3);
}
@JsOverlay
default boolean onInvoke(TARGET p0,String p1,@Nullable Object p2,Object p3){
return onInvoke(p0,p1,p2,Js.<JsObject>uncheckedCast(p3));
}
}
@JsFunction
public interface SetPrototypeOfFn<TARGET extends @Nullable Object>{
boolean onInvoke(TARGET p0,@Nullable JsObject p1);
@JsOverlay
default boolean onInvoke(TARGET p0,@Nullable Object p1){
return onInvoke(p0,Js.<@Nullable JsObject>uncheckedCast(p1));
}
}
@JsOverlay
static <TARGET extends @Nullable Object> ProxyHandler<TARGET> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ProxyHandler.ApplyFn<TARGET> getApply();
@JsProperty
ProxyHandler.ConstructFn<TARGET> getConstruct();
@JsProperty
ProxyHandler.DefinePropertyFn<TARGET> getDefineProperty();
@JsProperty
ProxyHandler.DeletePropertyFn<TARGET> getDeleteProperty();
@JsProperty
ProxyHandler.GetFn<TARGET> getGet();
@JsProperty
ProxyHandler.GetOwnPropertyDescriptorFn<TARGET> getGetOwnPropertyDescriptor();
@JsProperty
ProxyHandler.GetPrototypeOfFn<TARGET> getGetPrototypeOf();
@JsProperty
ProxyHandler.HasFn<TARGET> getHas();
@JsProperty
ProxyHandler.IsExtensibleFn<TARGET> getIsExtensible();
@JsProperty
ProxyHandler.OwnKeysFn<TARGET> getOwnKeys();
@JsProperty
ProxyHandler.PreventExtensionsFn<TARGET> getPreventExtensions();
@JsProperty
ProxyHandler.SetFn<TARGET> getSet();
@JsProperty
ProxyHandler.SetPrototypeOfFn<TARGET> getSetPrototypeOf();
@JsProperty
void setApply(ProxyHandler.ApplyFn<? super TARGET> apply);
@JsProperty
void setConstruct(ProxyHandler.ConstructFn<? super TARGET> construct);
@JsProperty
void setDefineProperty(ProxyHandler.DefinePropertyFn<? super TARGET> defineProperty);
@JsProperty
void setDeleteProperty(ProxyHandler.DeletePropertyFn<? super TARGET> deleteProperty);
@JsProperty
void setGet(ProxyHandler.GetFn<? super TARGET> get);
@JsProperty
void setGetOwnPropertyDescriptor(ProxyHandler.GetOwnPropertyDescriptorFn<? super TARGET> getOwnPropertyDescriptor);
@JsProperty
void setGetPrototypeOf(ProxyHandler.GetPrototypeOfFn<? super TARGET> getPrototypeOf);
@JsProperty
void setHas(ProxyHandler.HasFn<? super TARGET> has);
@JsProperty
void setIsExtensible(ProxyHandler.IsExtensibleFn<? super TARGET> isExtensible);
@JsProperty
void setOwnKeys(ProxyHandler.OwnKeysFn<? super TARGET> ownKeys);
@JsProperty
void setPreventExtensions(ProxyHandler.PreventExtensionsFn<? super TARGET> preventExtensions);
@JsProperty
void setSet(ProxyHandler.SetFn<? super TARGET> set);
@JsProperty
void setSetPrototypeOf(ProxyHandler.SetPrototypeOfFn<? super TARGET> setPrototypeOf);
}
