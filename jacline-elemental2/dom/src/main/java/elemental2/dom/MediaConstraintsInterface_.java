package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaConstraintsInterface_{
@JsProperty
JsObject getMandatory();
@JsProperty
JsArray<JsObject> getOptional();
@JsProperty
void setMandatory(JsObject mandatory);
@JsOverlay
default void setMandatory(Object mandatory){
setMandatory(Js.<JsObject>uncheckedCast(mandatory));
}
@JsProperty
void setOptional(JsArray<JsObject> optional);
@JsOverlay
default void setOptional(JsObject[] optional){
setOptional(Js.<JsArray<JsObject>>uncheckedCast(optional));
}
}
