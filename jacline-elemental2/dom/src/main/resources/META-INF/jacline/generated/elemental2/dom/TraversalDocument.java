package elemental2.dom;
import elemental2.dom.NodeIterator;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.NodeFilter;
import elemental2.dom.TreeWalker;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TraversalDocument{
@JsFunction
public interface CreateNodeIteratorFn{
NodeIterator onInvoke(Node p0,double p1,NodeFilter p2,boolean p3);
}
@JsFunction
public interface CreateTreeWalkerFn{
TreeWalker onInvoke(Node p0,double p1,NodeFilter p2,boolean p3);
}
@JsOverlay
static TraversalDocument create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
TraversalDocument.CreateNodeIteratorFn getCreateNodeIterator();
@JsProperty
TraversalDocument.CreateTreeWalkerFn getCreateTreeWalker();
@JsProperty
void setCreateNodeIterator(TraversalDocument.CreateNodeIteratorFn createNodeIterator);
@JsProperty
void setCreateTreeWalker(TraversalDocument.CreateTreeWalkerFn createTreeWalker);
}
