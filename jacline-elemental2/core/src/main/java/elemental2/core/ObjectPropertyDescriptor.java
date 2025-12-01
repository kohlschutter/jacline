package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ObjectPropertyDescriptor<THIS extends @Nullable Object>{
@JsFunction
public interface GetFn{
@Nullable Object onInvoke();
}
@JsFunction
public interface SetFn{
void onInvoke(@Nullable Object p0);
}
@JsOverlay
static <THIS extends @Nullable Object> ObjectPropertyDescriptor<THIS> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ObjectPropertyDescriptor.GetFn getGet();
@JsProperty
ObjectPropertyDescriptor.SetFn getSet();
@JsProperty
@Nullable Object getValue();
@JsProperty
boolean isConfigurable();
@JsProperty
boolean isEnumerable();
@JsProperty
boolean isWritable();
@JsProperty
void setConfigurable(boolean configurable);
@JsProperty
void setEnumerable(boolean enumerable);
@JsProperty
void setGet(ObjectPropertyDescriptor.GetFn get);
@JsProperty
void setSet(ObjectPropertyDescriptor.SetFn set);
@JsProperty
void setValue(@Nullable Object value);
@JsProperty
void setWritable(boolean writable);
}
