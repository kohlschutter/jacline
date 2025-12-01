package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class StaticRange{
public boolean collapsed;
public @Nullable Node endContainer;
public double endOffset;
public @Nullable Node startContainer;
public double startOffset;
}
