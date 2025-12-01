package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.HTMLElement;
import elemental2.dom.Node;
import elemental2.dom.NodeList;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLMeterElement extends HTMLElement{
public double high;
public @Nullable NodeList<Node> labels;
public double low;
public double max;
public double min;
public double optimum;
public double value;
}
