package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import jsinterop.annotations.JsMethod;
import elemental2.core.ReadonlyArray;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import javaemul.internal.ArrayStamper;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,name = "Array",namespace = JsPackage.GLOBAL)
public class JsArray<T extends @Nullable Object> implements JsIterable<T, @Nullable Object, @Nullable Object>, ReadonlyArray<T>, JsArrayLike<T>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FromArrayLikeUnionType<T extends @Nullable Object>{
@JsOverlay
static <T extends @Nullable Object> JsArray.FromArrayLikeUnionType<T> of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArrayLike<T> asJsArrayLike(){
return Js.cast(this);
}
@JsOverlay
default JsIterable<T, @Nullable Object, @Nullable Object> asJsIterable(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsFunction
public interface FromMapFn<T extends @Nullable Object, R extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P0UnionType<T extends @Nullable Object>{
@JsOverlay
static <T extends @Nullable Object> JsArray.FromMapFn.P0UnionType<T> of(Object o){
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
R onInvoke(JsArray.FromMapFn.P0UnionType<T> p0,int p1);
@JsOverlay
default R onInvoke(String p0,int p1){
return onInvoke(Js.<JsArray.FromMapFn.P0UnionType<T>>uncheckedCast(p0),p1);
}
@JsOverlay
default R onInvoke(T p0,int p1){
return onInvoke(Js.<JsArray.FromMapFn.P0UnionType<T>>uncheckedCast(p0),p1);
}
}
@JsFunction
public interface SortCompareFn<T extends @Nullable Object>{
double onInvoke(T p0,T p1);
}
@JsOverlay
public static final <T extends @Nullable Object> JsArray<T> asJsArray(T[] array){
return Js.uncheckedCast(array);
}
public static native <T extends @Nullable Object, S extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsArray.FromArrayLikeUnionType<T> arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn,S this_);
public static native <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsArray.FromArrayLikeUnionType<T> arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn);
public static native <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsArray.FromArrayLikeUnionType<T> arrayLike);
@JsOverlay
public static final <T extends @Nullable Object, S extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsArrayLike<T> arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn,S this_){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike),mapFn,this_);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsArrayLike<T> arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike),mapFn);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsArrayLike<T> arrayLike){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike));
}
@JsOverlay
public static final <T extends @Nullable Object, S extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsIterable<T, @Nullable Object, @Nullable Object> arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn,S this_){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike),mapFn,this_);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsIterable<T, @Nullable Object, @Nullable Object> arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike),mapFn);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(JsIterable<T, @Nullable Object, @Nullable Object> arrayLike){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike));
}
@JsOverlay
public static final <T extends @Nullable Object, S extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(String arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn,S this_){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike),mapFn,this_);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(String arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike),mapFn);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(String arrayLike){
return from(Js.<JsArray.FromArrayLikeUnionType<T>>uncheckedCast(arrayLike));
}
@JsOverlay
public static final <T extends @Nullable Object, S extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(T[] arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn,S this_){
return from(Js.<JsArrayLike<T>>uncheckedCast(arrayLike),mapFn,this_);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(T[] arrayLike,JsArray.FromMapFn<? super T, ? extends R> mapFn){
return from(Js.<JsArrayLike<T>>uncheckedCast(arrayLike),mapFn);
}
@JsOverlay
public static final <T extends @Nullable Object, R extends @Nullable Object> JsArray<R> from(T[] arrayLike){
return from(Js.<JsArrayLike<T>>uncheckedCast(arrayLike));
}
public static native boolean isArray(@Nullable Object arr);
public static native <T extends @Nullable Object> JsArray<T> of(T... var_args);
public int index;
public @Nullable String input;
public int length;
public JsArray(T... items){}
@JsOverlay
public final T[] asArray(T[] reference){
return ArrayStamper.stampJavaTypeInfo(this,reference);
}
public native T at(int index);
public native JsArray<T> concat(T... items);
public native JsArray<T> copyWithin(int target,int start,int end);
public native JsArray<T> copyWithin(int target,int start);
public native JsIteratorIterable<JsArray<ReadonlyArray.EntriesJsIteratorIterableTypeParameterArrayUnionType<T>>, @Nullable Object, @Nullable Object> entries();
public native <S extends @Nullable Object> boolean every(ReadonlyArray.@Nullable EveryCallbackFn<? super T> callback,S thisobj);
public native boolean every(ReadonlyArray.@Nullable EveryCallbackFn<? super T> callback);
public native JsArray<T> fill(T value,int begin,int end);
public native JsArray<T> fill(T value,int begin);
public native JsArray<T> fill(T value);
public native <S extends @Nullable Object> JsArray<T> filter(ReadonlyArray.@Nullable FilterCallbackFn<? super T> callback,S thisobj);
public native JsArray<T> filter(ReadonlyArray.@Nullable FilterCallbackFn<? super T> callback);
public native <S extends @Nullable Object> T find(ReadonlyArray.FindPredicateFn<T> predicateFn,S this_);
public native T find(ReadonlyArray.FindPredicateFn<T> predicateFn);
public native <S extends @Nullable Object> int findIndex(ReadonlyArray.FindIndexPredicateFn<T> predicateFn,S this_);
public native int findIndex(ReadonlyArray.FindIndexPredicateFn<T> predicateFn);
public native <S extends @Nullable Object> T findLast(ReadonlyArray.FindLastPredicateFn<T> predicateFn,S this_);
public native T findLast(ReadonlyArray.FindLastPredicateFn<T> predicateFn);
public native <S extends @Nullable Object> int findLastIndex(ReadonlyArray.FindLastIndexPredicateFn<T> predicateFn,S this_);
public native int findLastIndex(ReadonlyArray.FindLastIndexPredicateFn<T> predicateFn);
public native <S extends @Nullable Object> JsArray<S> flat();
public native <S extends @Nullable Object> JsArray<S> flat(int depth);
public native <THIS extends @Nullable Object, S extends @Nullable Object> JsArray<S> flatMap(ReadonlyArray.FlatMapCallbackFn<S, T> callback,THIS thisArg);
public native <S extends @Nullable Object> JsArray<S> flatMap(ReadonlyArray.FlatMapCallbackFn<S, T> callback);
public native <S extends @Nullable Object> void forEach(ReadonlyArray.@Nullable ForEachCallbackFn<? super T> callback,S thisobj);
public native void forEach(ReadonlyArray.@Nullable ForEachCallbackFn<? super T> callback);
public native boolean includes(T searchElement,int fromIndex);
public native boolean includes(T searchElement);
public native int indexOf(T obj,int fromIndex);
public native int indexOf(T obj);
public native String join();
public native String join(@Nullable Object separator);
public native JsIteratorIterable<Double, @Nullable Object, @Nullable Object> keys();
public native int lastIndexOf(T obj,int fromIndex);
public native int lastIndexOf(T obj);
public native <S extends @Nullable Object, R extends @Nullable Object> JsArray<R> map(ReadonlyArray.@Nullable MapCallbackFn<? extends R, ? super T> callback,S thisobj);
public native <R extends @Nullable Object> JsArray<R> map(ReadonlyArray.@Nullable MapCallbackFn<? extends R, ? super T> callback);
public native T pop();
public native int push(T... var_args);
public native <R extends @Nullable Object> R reduce(ReadonlyArray.@Nullable ReduceCallbackFn<? extends R, ? super T> callback,@Nullable Object initialValue);
public native <R extends @Nullable Object> R reduce(ReadonlyArray.@Nullable ReduceCallbackFn<? extends R, ? super T> callback);
public native <R extends @Nullable Object> R reduceRight(ReadonlyArray.@Nullable ReduceRightCallbackFn<? extends R, ? super T> callback,@Nullable Object initialValue);
public native <R extends @Nullable Object> R reduceRight(ReadonlyArray.@Nullable ReduceRightCallbackFn<? extends R, ? super T> callback);
public native T[] reverse();
public native T shift();
public native JsArray<T> slice();
public native JsArray<T> slice(int begin,int end);
public native JsArray<T> slice(int begin);
public native <S extends @Nullable Object> boolean some(ReadonlyArray.@Nullable SomeCallbackFn<? super T> callback,S thisobj);
public native boolean some(ReadonlyArray.@Nullable SomeCallbackFn<? super T> callback);
public native JsArray<T> sort();
public native JsArray<T> sort(JsArray.SortCompareFn<? super T> compareFn);
public native JsArray<T> splice();
public native JsArray<T> splice(int index,int howMany,T... var_args);
public native JsArray<T> splice(int index);
public native String toSource();
@JsMethod(name = "toString")
public native String toString_();
public native int unshift(T... items);
public native JsIteratorIterable<T, @Nullable Object, @Nullable Object> values();
}
