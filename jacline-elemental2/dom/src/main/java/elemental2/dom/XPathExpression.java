package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XPathExpression{
public native @Nullable Object evaluate(@Nullable Node contextNode,int type,@Nullable Object result);
public native @Nullable Object evaluate(@Nullable Node contextNode,int type);
public native @Nullable Object evaluate(@Nullable Node contextNode);
}
