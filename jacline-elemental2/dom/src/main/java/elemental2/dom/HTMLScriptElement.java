package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import elemental2.dom.HTMLElement;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLScriptElement extends HTMLElement{
@JsFunction
public interface OnreadystatechangeFn{
@Nullable Object onInvoke(Event p0);
}
public boolean async;
public String attributionSrc;
public String charset;
public @Nullable String crossOrigin;
public boolean defer;
public String event;
public String fetchPriority;
public String htmlFor;
public String integrity;
public boolean noModule;
public HTMLScriptElement.@Nullable OnreadystatechangeFn onreadystatechange;
public String referrerPolicy;
public String src;
public String text;
public String type;
}
