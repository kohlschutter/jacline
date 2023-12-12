package elemental2.svg;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ElementTimeControl{
void beginElement();
void beginElementAt();
void beginElementAt(double offset);
void endElement();
void endElementAt();
void endElementAt(double offset);
}
