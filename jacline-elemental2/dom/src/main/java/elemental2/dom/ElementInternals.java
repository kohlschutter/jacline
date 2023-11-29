package elemental2.dom;
import elemental2.dom.HTMLFormElement;
import elemental2.dom.FormData;
import elemental2.dom.ValidityState;
import elemental2.dom.ShadowRoot;
import elemental2.dom.HTMLLabelElement;
import elemental2.dom.File;
import jsinterop.base.Js;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.NodeList;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ValidityStateFlags;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ElementInternals{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetFormValueStateUnionType{
@JsOverlay
static ElementInternals.SetFormValueStateUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default File asFile(){
return Js.cast(this);
}
@JsOverlay
default FormData asFormData(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isFile(){
return (Object)this instanceof File;
}
@JsOverlay
default boolean isFormData(){
return (Object)this instanceof FormData;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetFormValueValueUnionType{
@JsOverlay
static ElementInternals.SetFormValueValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default File asFile(){
return Js.cast(this);
}
@JsOverlay
default FormData asFormData(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isFile(){
return (Object)this instanceof File;
}
@JsOverlay
default boolean isFormData(){
return (Object)this instanceof FormData;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public HTMLFormElement form;
public NodeList<HTMLLabelElement> labels;
public ShadowRoot shadowRoot;
public String validationMessage;
public ValidityState validity;
public boolean willValidate;
public native boolean checkValidity();
public native boolean reportValidity();
@JsOverlay
public final Object setFormValue(File value,File state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(File value,FormData state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(File value,ElementInternals.SetFormValueStateUnionType state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),state);
}
@JsOverlay
public final Object setFormValue(File value,String state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(FormData value,File state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(FormData value,FormData state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(FormData value,ElementInternals.SetFormValueStateUnionType state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),state);
}
@JsOverlay
public final Object setFormValue(FormData value,String state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(ElementInternals.SetFormValueValueUnionType value,File state){
return setFormValue(value,Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(ElementInternals.SetFormValueValueUnionType value,FormData state){
return setFormValue(value,Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
public native Object setFormValue(ElementInternals.SetFormValueValueUnionType value,ElementInternals.SetFormValueStateUnionType state);
@JsOverlay
public final Object setFormValue(ElementInternals.SetFormValueValueUnionType value,String state){
return setFormValue(value,Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(String value,File state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(String value,FormData state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
@JsOverlay
public final Object setFormValue(String value,ElementInternals.SetFormValueStateUnionType state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),state);
}
@JsOverlay
public final Object setFormValue(String value,String state){
return setFormValue(Js.<ElementInternals.SetFormValueValueUnionType>uncheckedCast(value),Js.<ElementInternals.SetFormValueStateUnionType>uncheckedCast(state));
}
public native Object setValidity(ValidityStateFlags flags,String message,HTMLElement anchor);
}
