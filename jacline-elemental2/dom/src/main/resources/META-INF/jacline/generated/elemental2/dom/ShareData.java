package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ShareData{
@JsOverlay
static ShareData create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getText();
@JsProperty
String getTitle();
@JsProperty
String getUrl();
@JsProperty
void setText(String text);
@JsProperty
void setTitle(String title);
@JsProperty
void setUrl(String url);
}
