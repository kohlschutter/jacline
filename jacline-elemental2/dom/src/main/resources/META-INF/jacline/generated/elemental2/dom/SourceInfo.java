package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SourceInfo{
@JsProperty
String getId();
@JsProperty
String getKind();
@JsProperty
String getLabel();
@JsProperty
boolean isFacing();
}
