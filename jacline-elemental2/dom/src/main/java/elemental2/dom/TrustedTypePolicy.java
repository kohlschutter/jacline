package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.TrustedHTML;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.TrustedScript;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TrustedTypePolicy<Options extends @Nullable Object>{
public native TrustedHTML createHTML(String s,@Nullable Object... args);
public native TrustedScript createScript(String s,@Nullable Object... args);
public native TrustedScriptURL createScriptURL(String s,@Nullable Object... args);
}
