package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Document;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLFrameElement extends HTMLElement{
public @Nullable Document contentDocument;
public String frameBorder;
public String longDesc;
public String marginHeight;
public String marginWidth;
public String name;
public boolean noResize;
public String scrolling;
public String src;
}
