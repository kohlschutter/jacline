package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import jsinterop.annotations.JsMethod;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadonlyArray<T extends @Nullable Object> extends JsIterable<T, @Nullable Object, @Nullable Object>, JsArrayLike<T>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesJsIteratorIterableTypeParameterArrayUnionType<T extends @Nullable Object>{
@JsOverlay
static <T extends @Nullable Object> ReadonlyArray.EntriesJsIteratorIterableTypeParameterArrayUnionType<T> of(Object o){
return Js.cast(o);
}
@JsOverlay
default Double asDouble(){
return Js.cast(this);
}
@JsOverlay
default T asT(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
@JsFunction
public interface EveryCallbackFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T p0,int p1);
}
@JsFunction
public interface FilterCallbackFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T p0,int p1);
}
@JsFunction
public interface FindIndexPredicateFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T p0,double p1,JsArray<T> p2);
@JsOverlay
default @Nullable Object onInvoke(T p0,double p1,T[] p2){
return onInvoke(p0,p1,Js.<JsArray<T>>uncheckedCast(p2));
}
}
@JsFunction
public interface FindLastIndexPredicateFn<T extends @Nullable Object>{
boolean onInvoke(T p0,double p1,JsArray<T> p2);
@JsOverlay
default boolean onInvoke(T p0,double p1,T[] p2){
return onInvoke(p0,p1,Js.<JsArray<T>>uncheckedCast(p2));
}
}
@JsFunction
public interface FindLastPredicateFn<T extends @Nullable Object>{
boolean onInvoke(T p0,double p1,JsArray<T> p2);
@JsOverlay
default boolean onInvoke(T p0,double p1,T[] p2){
return onInvoke(p0,p1,Js.<JsArray<T>>uncheckedCast(p2));
}
}
@JsFunction
public interface FindPredicateFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T p0,double p1,JsArray<T> p2);
@JsOverlay
default @Nullable Object onInvoke(T p0,double p1,T[] p2){
return onInvoke(p0,p1,Js.<JsArray<T>>uncheckedCast(p2));
}
}
@JsFunction
public interface FlatMapCallbackFn<S extends @Nullable Object, T extends @Nullable Object>{
ReadonlyArray<S> onInvoke(T p0,double p1,JsArrayLike<T> p2);
@JsOverlay
default ReadonlyArray<S> onInvoke(T p0,double p1,T[] p2){
return onInvoke(p0,p1,Js.<JsArrayLike<T>>uncheckedCast(p2));
}
}
@JsFunction
public interface ForEachCallbackFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T p0,int p1);
}
@JsFunction
public interface MapCallbackFn<R extends @Nullable Object, T extends @Nullable Object>{
R onInvoke(T p0,int p1);
}
@JsFunction
public interface ReduceCallbackFn<R extends @Nullable Object, T extends @Nullable Object>{
R onInvoke(@Nullable Object p0,T p1,int p2);
}
@JsFunction
public interface ReduceRightCallbackFn<R extends @Nullable Object, T extends @Nullable Object>{
R onInvoke(@Nullable Object p0,T p1,int p2);
}
@JsFunction
public interface SomeCallbackFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T p0,int p1);
}
T at(int index);
JsArray<T> concat(T... items);
JsIteratorIterable<JsArray<ReadonlyArray.EntriesJsIteratorIterableTypeParameterArrayUnionType<T>>, @Nullable Object, @Nullable Object> entries();
<S extends @Nullable Object> boolean every(ReadonlyArray.@Nullable EveryCallbackFn<? super T> callback,S thisobj);
boolean every(ReadonlyArray.@Nullable EveryCallbackFn<? super T> callback);
<S extends @Nullable Object> JsArray<T> filter(ReadonlyArray.@Nullable FilterCallbackFn<? super T> callback,S thisobj);
JsArray<T> filter(ReadonlyArray.@Nullable FilterCallbackFn<? super T> callback);
<S extends @Nullable Object> T find(ReadonlyArray.FindPredicateFn<T> predicateFn,S this_);
T find(ReadonlyArray.FindPredicateFn<T> predicateFn);
<S extends @Nullable Object> int findIndex(ReadonlyArray.FindIndexPredicateFn<T> predicateFn,S this_);
int findIndex(ReadonlyArray.FindIndexPredicateFn<T> predicateFn);
<S extends @Nullable Object> T findLast(ReadonlyArray.FindLastPredicateFn<T> predicateFn,S this_);
T findLast(ReadonlyArray.FindLastPredicateFn<T> predicateFn);
<S extends @Nullable Object> int findLastIndex(ReadonlyArray.FindLastIndexPredicateFn<T> predicateFn,S this_);
int findLastIndex(ReadonlyArray.FindLastIndexPredicateFn<T> predicateFn);
<S extends @Nullable Object> JsArray<S> flat();
<S extends @Nullable Object> JsArray<S> flat(int depth);
<THIS extends @Nullable Object, S extends @Nullable Object> JsArray<S> flatMap(ReadonlyArray.FlatMapCallbackFn<S, T> callback,THIS thisArg);
<S extends @Nullable Object> JsArray<S> flatMap(ReadonlyArray.FlatMapCallbackFn<S, T> callback);
<S extends @Nullable Object> void forEach(ReadonlyArray.@Nullable ForEachCallbackFn<? super T> callback,S thisobj);
void forEach(ReadonlyArray.@Nullable ForEachCallbackFn<? super T> callback);
boolean includes(T searchElement,int fromIndex);
boolean includes(T searchElement);
int indexOf(T obj,int fromIndex);
int indexOf(T obj);
String join();
String join(@Nullable Object separator);
JsIteratorIterable<Double, @Nullable Object, @Nullable Object> keys();
int lastIndexOf(T obj,int fromIndex);
int lastIndexOf(T obj);
<S extends @Nullable Object, R extends @Nullable Object> JsArray<R> map(ReadonlyArray.@Nullable MapCallbackFn<? extends R, ? super T> callback,S thisobj);
<R extends @Nullable Object> JsArray<R> map(ReadonlyArray.@Nullable MapCallbackFn<? extends R, ? super T> callback);
<R extends @Nullable Object> R reduce(ReadonlyArray.@Nullable ReduceCallbackFn<? extends R, ? super T> callback,@Nullable Object initialValue);
<R extends @Nullable Object> R reduce(ReadonlyArray.@Nullable ReduceCallbackFn<? extends R, ? super T> callback);
<R extends @Nullable Object> R reduceRight(ReadonlyArray.@Nullable ReduceRightCallbackFn<? extends R, ? super T> callback,@Nullable Object initialValue);
<R extends @Nullable Object> R reduceRight(ReadonlyArray.@Nullable ReduceRightCallbackFn<? extends R, ? super T> callback);
JsArray<T> slice();
JsArray<T> slice(int begin,int end);
JsArray<T> slice(int begin);
<S extends @Nullable Object> boolean some(ReadonlyArray.@Nullable SomeCallbackFn<? super T> callback,S thisobj);
boolean some(ReadonlyArray.@Nullable SomeCallbackFn<? super T> callback);
@JsMethod(name = "toString")
String toString_();
JsIteratorIterable<T, @Nullable Object, @Nullable Object> values();
}
