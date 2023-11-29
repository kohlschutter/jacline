package elemental2.dom;
import elemental2.promise.IThenable;
import java.lang.Void;
import elemental2.dom.ReadableStreamDefaultController;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.ReadableByteStreamController;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableStreamSource<VALUE>{
@JsFunction
public interface CancelFn{
Promise<Void> onInvoke(Object p0);
}
@JsFunction
public interface PullFn<VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P0UnionType<VALUE>{
@JsOverlay
static ReadableStreamSource.PullFn.P0UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ReadableByteStreamController asReadableByteStreamController(){
return Js.cast(this);
}
@JsOverlay
default ReadableStreamDefaultController<VALUE> asReadableStreamDefaultController(){
return Js.cast(this);
}
}
IThenable<Object> onInvoke(ReadableStreamSource.PullFn.P0UnionType<VALUE> p0);
@JsOverlay
default IThenable<Object> onInvoke(ReadableByteStreamController p0){
return onInvoke(Js.<ReadableStreamSource.PullFn.P0UnionType<VALUE>>uncheckedCast(p0));
}
@JsOverlay
default IThenable<Object> onInvoke(ReadableStreamDefaultController<VALUE> p0){
return onInvoke(Js.<ReadableStreamSource.PullFn.P0UnionType<VALUE>>uncheckedCast(p0));
}
}
@JsFunction
public interface StartFn<VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P0UnionType<VALUE>{
@JsOverlay
static ReadableStreamSource.StartFn.P0UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ReadableByteStreamController asReadableByteStreamController(){
return Js.cast(this);
}
@JsOverlay
default ReadableStreamDefaultController<VALUE> asReadableStreamDefaultController(){
return Js.cast(this);
}
}
IThenable<Object> onInvoke(ReadableStreamSource.StartFn.P0UnionType<VALUE> p0);
@JsOverlay
default IThenable<Object> onInvoke(ReadableByteStreamController p0){
return onInvoke(Js.<ReadableStreamSource.StartFn.P0UnionType<VALUE>>uncheckedCast(p0));
}
@JsOverlay
default IThenable<Object> onInvoke(ReadableStreamDefaultController<VALUE> p0){
return onInvoke(Js.<ReadableStreamSource.StartFn.P0UnionType<VALUE>>uncheckedCast(p0));
}
}
@JsOverlay
static ReadableStreamSource create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getAutoAllocateChunkSize();
@JsProperty
ReadableStreamSource.CancelFn getCancel();
@JsProperty
ReadableStreamSource.PullFn<VALUE> getPull();
@JsProperty
ReadableStreamSource.StartFn<VALUE> getStart();
@JsProperty
String getType();
@JsProperty
void setAutoAllocateChunkSize(int autoAllocateChunkSize);
@JsProperty
void setCancel(ReadableStreamSource.CancelFn cancel);
@JsProperty
void setPull(ReadableStreamSource.PullFn<? super VALUE> pull);
@JsProperty
void setStart(ReadableStreamSource.StartFn<? super VALUE> start);
@JsProperty
void setType(String type);
}
