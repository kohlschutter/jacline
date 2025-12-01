package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Gamepad{
@JsProperty
JsArray<Double> getAxes();
@JsProperty
JsArray<@Nullable Object> getButtons();
@JsProperty
String getId();
@JsProperty
double getIndex();
@JsProperty
String getMapping();
@JsProperty
double getTimestamp();
@JsProperty
boolean isConnected();
@JsProperty
void setAxes(JsArray<Double> axes);
@JsOverlay
default void setAxes(double[] axes){
setAxes(Js.<JsArray<Double>>uncheckedCast(axes));
}
@JsProperty
void setButtons(JsArray<@Nullable Object> buttons);
@JsOverlay
default void setButtons(@Nullable Object[] buttons){
setButtons(Js.<JsArray<@Nullable Object>>uncheckedCast(buttons));
}
@JsProperty
void setConnected(boolean connected);
@JsProperty
void setId(String id);
@JsProperty
void setIndex(double index);
@JsProperty
void setMapping(String mapping);
@JsProperty
void setTimestamp(double timestamp);
}
