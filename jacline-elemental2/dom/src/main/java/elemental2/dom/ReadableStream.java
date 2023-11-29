package elemental2.dom;
import elemental2.dom.WritableStream;
import elemental2.dom.ReadableStreamBYOBReader;
import java.lang.Void;
import elemental2.dom.ITransformStream;
import elemental2.dom.ReadableStreamSource;
import elemental2.dom.TransformStream;
import elemental2.promise.Promise;
import elemental2.dom.ReadableStreamIteratorOptions;
import elemental2.dom.ByteLengthQueuingStrategy;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import elemental2.core.AsyncIterator;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.CountQueuingStrategy;
import elemental2.dom.PipeOptions;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ReadableStreamDefaultReader;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ReadableStream<VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorQueuingStrategyUnionType{
@JsOverlay
static ReadableStream.ConstructorQueuingStrategyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ByteLengthQueuingStrategy asByteLengthQueuingStrategy(){
return Js.cast(this);
}
@JsOverlay
default CountQueuingStrategy asCountQueuingStrategy(){
return Js.cast(this);
}
@JsOverlay
default TransformStream.TransformStreamWritableStrategyType asTransformStreamWritableStrategyType(){
return Js.cast(this);
}
@JsOverlay
default boolean isByteLengthQueuingStrategy(){
return (Object)this instanceof ByteLengthQueuingStrategy;
}
@JsOverlay
default boolean isCountQueuingStrategy(){
return (Object)this instanceof CountQueuingStrategy;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetReaderOptionsType{
@JsOverlay
static ReadableStream.GetReaderOptionsType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getMode();
@JsProperty
void setMode(String mode);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetReaderUnionType<VALUE>{
@JsOverlay
static ReadableStream.GetReaderUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ReadableStreamBYOBReader asReadableStreamBYOBReader(){
return Js.cast(this);
}
@JsOverlay
default ReadableStreamDefaultReader<VALUE> asReadableStreamDefaultReader(){
return Js.cast(this);
}
}
public boolean locked;
public ReadableStream(){}
public ReadableStream(ReadableStreamSource<VALUE> underlyingSource,ByteLengthQueuingStrategy queuingStrategy){}
public ReadableStream(ReadableStreamSource<VALUE> underlyingSource,ReadableStream.ConstructorQueuingStrategyUnionType queuingStrategy){}
public ReadableStream(ReadableStreamSource<VALUE> underlyingSource,CountQueuingStrategy queuingStrategy){}
public ReadableStream(ReadableStreamSource<VALUE> underlyingSource,TransformStream.TransformStreamWritableStrategyType queuingStrategy){}
public ReadableStream(ReadableStreamSource<VALUE> underlyingSource){}
public native Promise<Void> cancel(Object reason);
public native AsyncIterator<VALUE, Object, Object> getIterator();
public native AsyncIterator<VALUE, Object, Object> getIterator(ReadableStreamIteratorOptions options);
public native ReadableStream.GetReaderUnionType<VALUE> getReader();
public native ReadableStream.GetReaderUnionType<VALUE> getReader(ReadableStream.GetReaderOptionsType options);
public native <PIPE_VALUE>ReadableStream<PIPE_VALUE> pipeThrough(ITransformStream<PIPE_VALUE, VALUE> transform,PipeOptions options);
public native <PIPE_VALUE>ReadableStream<PIPE_VALUE> pipeThrough(ITransformStream<PIPE_VALUE, VALUE> transform);
public native Promise<Void> pipeTo(WritableStream<VALUE> dest,PipeOptions options);
public native Promise<Void> pipeTo(WritableStream<VALUE> dest);
public native JsArray<ReadableStream<VALUE>> tee();
}
