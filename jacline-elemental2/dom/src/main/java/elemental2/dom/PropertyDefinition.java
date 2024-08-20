package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PropertyDefinition{
@JsOverlay
static PropertyDefinition create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getInitialValue();
@JsProperty
String getName();
@JsProperty
String getSyntax();
@JsProperty
boolean isInherits();
@JsProperty
void setInherits(boolean inherits);
@JsProperty
void setInitialValue(String initialValue);
@JsProperty
void setName(String name);
@JsProperty
void setSyntax(String syntax);
}
