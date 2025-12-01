package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.promise.IThenable;
import elemental2.dom.TransformStreamDefaultController;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TransformStreamTransformer<IN_VALUE extends @Nullable Object, OUT_VALUE extends @Nullable Object>{
@JsFunction
public interface FlushFn<OUT_VALUE extends @Nullable Object>{
IThenable<@Nullable Object> onInvoke(TransformStreamDefaultController<OUT_VALUE> p0);
}
@JsFunction
public interface StartFn<OUT_VALUE extends @Nullable Object>{
IThenable<@Nullable Object> onInvoke(TransformStreamDefaultController<OUT_VALUE> p0);
}
@JsFunction
public interface TransformFn<IN_VALUE extends @Nullable Object, OUT_VALUE extends @Nullable Object>{
IThenable<@Nullable Object> onInvoke(IN_VALUE p0,TransformStreamDefaultController<OUT_VALUE> p1);
}
@JsOverlay
static <IN_VALUE extends @Nullable Object, OUT_VALUE extends @Nullable Object> TransformStreamTransformer<IN_VALUE, OUT_VALUE> create(){
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
