package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import elemental2.dom.XPathNSResolver;
import java.lang.Object;
import java.lang.String;
import elemental2.dom.XPathResult;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XPathEvaluator{
public native void createExpression(String expr,@Nullable XPathNSResolver resolver);
public native void createExpression(String expr);
public native void createNSResolver(@Nullable Node nodeResolver);
public native @Nullable XPathResult evaluate(String expr,@Nullable Node contextNode,@Nullable XPathNSResolver resolver,int type,@Nullable Object result);
public native @Nullable XPathResult evaluate(String expr,@Nullable Node contextNode,@Nullable XPathNSResolver resolver,int type);
public native @Nullable XPathResult evaluate(String expr,@Nullable Node contextNode,@Nullable XPathNSResolver resolver);
public native @Nullable XPathResult evaluate(String expr,@Nullable Node contextNode);
}
