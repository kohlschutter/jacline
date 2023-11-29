package elemental2.dom;
import elemental2.dom.Node;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XPathExpression{
public native Object evaluate(Node contextNode,int type,Object result);
public native Object evaluate(Node contextNode,int type);
public native Object evaluate(Node contextNode);
}
