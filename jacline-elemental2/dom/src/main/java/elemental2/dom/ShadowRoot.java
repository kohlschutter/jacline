package elemental2.dom;
import elemental2.dom.Element;
import jsinterop.base.JsArrayLike;
import elemental2.dom.HTMLElement;
import java.lang.Deprecated;
import elemental2.dom.Selection;
import elemental2.dom.DocumentFragment;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.StyleSheetList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ShadowRoot extends DocumentFragment{
public Element activeElement;
public Element host;
public String innerHTML;
public String mode;
@Deprecated
public ShadowRoot olderShadowRoot;
public StyleSheetList styleSheets;
public native Element elementFromPoint(double x,double y);
public native JsArrayLike<Element> elementsFromPoint(double x,double y);
public native HTMLElement getElementById(String id);
public native Selection getSelection();
}
