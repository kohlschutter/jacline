package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMTokenList;
import elemental2.dom.Window;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Document;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLIFrameElement extends HTMLElement{
public String align;
public String allow;
public @Nullable Document contentDocument;
public @Nullable Window contentWindow;
public String frameBorder;
public String height;
public String loading;
public String longDesc;
public String marginHeight;
public String marginWidth;
public String name;
public @Nullable DOMTokenList sandbox;
public String scrolling;
public String src;
public String srcdoc;
public String width;
}
