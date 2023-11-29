package elemental2.dom;
import elemental2.dom.WritableStream;
import elemental2.dom.TransformStreamTransformer;
import elemental2.dom.ITransformStream;
import elemental2.dom.ReadableStream;
import elemental2.dom.ByteLengthQueuingStrategy;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.CountQueuingStrategy;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TransformStream<IN_VALUE, OUT_VALUE> implements ITransformStream<IN_VALUE, OUT_VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorReadableStrategyUnionType{
@JsOverlay
static TransformStream.ConstructorReadableStrategyUnionType of(Object o){
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
public interface ConstructorWritableStrategyUnionType{
@JsOverlay
static TransformStream.ConstructorWritableStrategyUnionType of(Object o){
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
public interface TransformStreamWritableStrategyType{
@JsFunction
public interface SizeFn{
double onInvoke(Object p0);
}
@JsOverlay
static TransformStream.TransformStreamWritableStrategyType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getHighWaterMark();
@JsProperty
TransformStream.TransformStreamWritableStrategyType.SizeFn getSize();
@JsProperty
void setHighWaterMark(double highWaterMark);
@JsProperty
void setSize(TransformStream.TransformStreamWritableStrategyType.SizeFn size);
}
public ReadableStream<OUT_VALUE> readable;
public WritableStream<IN_VALUE> writable;
public TransformStream(){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,ByteLengthQueuingStrategy writableStrategy,ByteLengthQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,ByteLengthQueuingStrategy writableStrategy,TransformStream.ConstructorReadableStrategyUnionType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,ByteLengthQueuingStrategy writableStrategy,CountQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,ByteLengthQueuingStrategy writableStrategy,TransformStream.TransformStreamWritableStrategyType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,ByteLengthQueuingStrategy writableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.ConstructorWritableStrategyUnionType writableStrategy,ByteLengthQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.ConstructorWritableStrategyUnionType writableStrategy,TransformStream.ConstructorReadableStrategyUnionType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.ConstructorWritableStrategyUnionType writableStrategy,CountQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.ConstructorWritableStrategyUnionType writableStrategy,TransformStream.TransformStreamWritableStrategyType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.ConstructorWritableStrategyUnionType writableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,CountQueuingStrategy writableStrategy,ByteLengthQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,CountQueuingStrategy writableStrategy,TransformStream.ConstructorReadableStrategyUnionType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,CountQueuingStrategy writableStrategy,CountQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,CountQueuingStrategy writableStrategy,TransformStream.TransformStreamWritableStrategyType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,CountQueuingStrategy writableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.TransformStreamWritableStrategyType writableStrategy,ByteLengthQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.TransformStreamWritableStrategyType writableStrategy,TransformStream.ConstructorReadableStrategyUnionType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.TransformStreamWritableStrategyType writableStrategy,CountQueuingStrategy readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.TransformStreamWritableStrategyType writableStrategy,TransformStream.TransformStreamWritableStrategyType readableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer,TransformStream.TransformStreamWritableStrategyType writableStrategy){}
public TransformStream(TransformStreamTransformer<IN_VALUE, OUT_VALUE> transformer){}
@JsProperty
public native ReadableStream<OUT_VALUE> getReadable();
@JsProperty
public native WritableStream<IN_VALUE> getWritable();
@JsProperty
public native void setReadable(ReadableStream<OUT_VALUE> readable);
@JsProperty
public native void setWritable(WritableStream<IN_VALUE> writable);
}
