package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.promise.IThenable;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.TransformStreamDefaultController;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TransformStreamTransformer<IN_VALUE, OUT_VALUE>{
@JsFunction
public interface FlushFn<OUT_VALUE>{
IThenable<Object> onInvoke(TransformStreamDefaultController<OUT_VALUE> p0);
}
@JsFunction
public interface StartFn<OUT_VALUE>{
IThenable<Object> onInvoke(TransformStreamDefaultController<OUT_VALUE> p0);
}
@JsFunction
public interface TransformFn<IN_VALUE, OUT_VALUE>{
IThenable<Object> onInvoke(IN_VALUE p0,TransformStreamDefaultController<OUT_VALUE> p1);
}
@JsOverlay
static TransformStreamTransformer create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
TransformStreamTransformer.FlushFn<OUT_VALUE> getFlush();
@JsProperty
TransformStreamTransformer.StartFn<OUT_VALUE> getStart();
@JsProperty
TransformStreamTransformer.TransformFn<IN_VALUE, OUT_VALUE> getTransform();
@JsProperty
void setFlush(TransformStreamTransformer.FlushFn<OUT_VALUE> flush);
@JsProperty
void setStart(TransformStreamTransformer.StartFn<OUT_VALUE> start);
@JsProperty
void setTransform(TransformStreamTransformer.TransformFn<? super IN_VALUE, OUT_VALUE> transform);
}
