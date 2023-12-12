package elemental2.webassembly;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TableDescriptor{
@JsOverlay
static TableDescriptor create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getElement();
@JsProperty
int getInitial();
@JsProperty
int getMaximum();
@JsProperty
void setElement(String element);
@JsProperty
void setInitial(int initial);
@JsProperty
void setMaximum(int maximum);
}
