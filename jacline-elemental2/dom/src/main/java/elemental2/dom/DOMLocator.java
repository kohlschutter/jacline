package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMLocator{
public double byteOffset;
public double columnNumber;
public double lineNumber;
public @Nullable Node relatedNode;
public String uri;
public double utf16Offset;
}
