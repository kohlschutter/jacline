package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
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
@Nullable JsObject getMandatory();
@JsProperty
@Nullable JsArray<JsObject> getOptional();
@JsProperty
void setMandatory(@Nullable JsObject mandatory);
@JsOverlay
default void setMandatory(@Nullable Object mandatory){
setMandatory(Js.<@Nullable JsObject>uncheckedCast(mandatory));
}
@JsProperty
void setOptional(@Nullable JsArray<JsObject> optional);
@JsOverlay
default void setOptional(JsObject@Nullable [] optional){
setOptional(Js.<@Nullable JsArray<JsObject>>uncheckedCast(optional));
}
}
