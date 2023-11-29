package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.CSSStyleDeclaration;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ElementCSSInlineStyle{
@JsOverlay
static ElementCSSInlineStyle create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
CSSStyleDeclaration getStyle();
@JsProperty
void setStyle(CSSStyleDeclaration style);
}
