package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import java.lang.Deprecated;
import elemental2.dom.StyleSheetList;
import jsinterop.base.JsArrayLike;
import elemental2.dom.HTMLElement;
import elemental2.dom.Selection;
import elemental2.dom.DocumentFragment;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.GetHTMLOptions;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ShadowRoot extends DocumentFragment{
public @Nullable Element activeElement;
public Element host;
public String innerHTML;
public String mode;
@Deprecated
public @Nullable ShadowRoot olderShadowRoot;
public StyleSheetList styleSheets;
public native @Nullable Element elementFromPoint(double x,double y);
public native JsArrayLike<Element> elementsFromPoint(double x,double y);
public native @Nullable HTMLElement getElementById(String id);
public native String getHTML();
public native String getHTML(GetHTMLOptions options);
public native @Nullable Selection getSelection();
}
