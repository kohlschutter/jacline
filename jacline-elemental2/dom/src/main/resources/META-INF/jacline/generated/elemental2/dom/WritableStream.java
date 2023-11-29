package elemental2.dom;
import java.lang.Void;
import elemental2.dom.TransformStream;
import elemental2.promise.Promise;
import elemental2.dom.ByteLengthQueuingStrategy;
import elemental2.dom.WritableStreamDefaultWriter;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.CountQueuingStrategy;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.WritableStreamSink;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WritableStream<VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorQueuingStrategyUnionType{
@JsOverlay
static WritableStream.ConstructorQueuingStrategyUnionType of(Object o){
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
public boolean locked;
public WritableStream(){}
public WritableStream(WritableStreamSink<VALUE> underlyingSink,ByteLengthQueuingStrategy queuingStrategy){}
public WritableStream(WritableStreamSink<VALUE> underlyingSink,WritableStream.ConstructorQueuingStrategyUnionType queuingStrategy){}
public WritableStream(WritableStreamSink<VALUE> underlyingSink,CountQueuingStrategy queuingStrategy){}
public WritableStream(WritableStreamSink<VALUE> underlyingSink,TransformStream.TransformStreamWritableStrategyType queuingStrategy){}
public WritableStream(WritableStreamSink<VALUE> underlyingSink){}
public native Promise<Void> abort(Object reason);
public native Promise<Void> close();
public native WritableStreamDefaultWriter<VALUE> getWriter();
}
