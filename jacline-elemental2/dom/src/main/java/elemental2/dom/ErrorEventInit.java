package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ErrorEventInit extends EventInit{
@JsOverlay
static ErrorEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getColno();
@JsProperty
@Nullable Object getError();
@JsProperty
String getFilename();
@JsProperty
int getLineno();
@JsProperty
String getMessage();
@JsProperty
void setColno(int colno);
@JsProperty
void setError(@Nullable Object error);
@JsProperty
void setFilename(String filename);
@JsProperty
void setLineno(int lineno);
@JsProperty
void setMessage(String message);
}
