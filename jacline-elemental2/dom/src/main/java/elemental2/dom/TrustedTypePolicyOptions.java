package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TrustedTypePolicyOptions{
@JsFunction
public interface CreateHTMLFn{
String onInvoke(String p0,@Nullable Object... p1);
}
@JsFunction
public interface CreateScriptFn{
String onInvoke(String p0,@Nullable Object... p1);
}
@JsFunction
public interface CreateScriptURLFn{
String onInvoke(String p0,@Nullable Object... p1);
}
@JsOverlay
static TrustedTypePolicyOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
TrustedTypePolicyOptions.CreateHTMLFn getCreateHTML();
@JsProperty
TrustedTypePolicyOptions.CreateScriptFn getCreateScript();
@JsProperty
TrustedTypePolicyOptions.CreateScriptURLFn getCreateScriptURL();
@JsProperty
void setCreateHTML(TrustedTypePolicyOptions.CreateHTMLFn createHTML);
@JsProperty
void setCreateScript(TrustedTypePolicyOptions.CreateScriptFn createScript);
@JsProperty
void setCreateScriptURL(TrustedTypePolicyOptions.CreateScriptURLFn createScriptURL);
}
