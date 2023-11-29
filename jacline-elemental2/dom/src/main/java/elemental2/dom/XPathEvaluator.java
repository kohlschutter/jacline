package elemental2.dom;
import elemental2.dom.Node;
import elemental2.dom.XPathNSResolver;
import java.lang.Object;
import java.lang.String;
import elemental2.dom.XPathResult;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XPathEvaluator{
public native void createExpression(String expr,XPathNSResolver resolver);
public native void createExpression(String expr);
public native void createNSResolver(Node nodeResolver);
public native XPathResult evaluate(String expr,Node contextNode,XPathNSResolver resolver,int type,Object result);
public native XPathResult evaluate(String expr,Node contextNode,XPathNSResolver resolver,int type);
public native XPathResult evaluate(String expr,Node contextNode,XPathNSResolver resolver);
public native XPathResult evaluate(String expr,Node contextNode);
}
