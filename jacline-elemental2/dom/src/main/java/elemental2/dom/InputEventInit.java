package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.UIEventInit;
import elemental2.dom.DataTransfer;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import elemental2.dom.StaticRange;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface InputEventInit extends UIEventInit{
@JsFunction
public interface GetTargetRangesFn{
JsArray<StaticRange> onInvoke();
}
@JsOverlay
static InputEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable String getData();
@JsProperty
@Nullable DataTransfer getDataTransfer();
@JsProperty
InputEventInit.GetTargetRangesFn getGetTargetRanges();
@JsProperty
String getInputType();
@JsProperty
boolean isIsComposing();
@JsProperty
void setData(@Nullable String data);
@JsProperty
void setDataTransfer(@Nullable DataTransfer dataTransfer);
@JsProperty
void setGetTargetRanges(InputEventInit.GetTargetRangesFn getTargetRanges);
@JsProperty
void setInputType(String inputType);
@JsProperty
void setIsComposing(boolean isComposing);
}
