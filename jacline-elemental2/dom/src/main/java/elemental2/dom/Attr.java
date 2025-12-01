package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Attr extends Node{
public boolean isId;
public String name;
public @Nullable Element ownerElement;
public boolean specified;
public String value;
}
