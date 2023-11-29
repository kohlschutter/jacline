package elemental2.dom;
import java.lang.Void;
import jsinterop.base.JsConstructorFn;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.HTMLElement;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import java.lang.Class;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CustomElementRegistry{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DefineOptionsType{
@JsOverlay
static CustomElementRegistry.DefineOptionsType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getExtends();
@JsProperty
void setExtends(String extends_);
}
@JsOverlay
public final void define(String tagName,Class<? extends HTMLElement> klass,CustomElementRegistry.DefineOptionsType options){
define(tagName,Js.asConstructorFn(klass),options);
}
@JsOverlay
public final void define(String tagName,Class<? extends HTMLElement> klass){
define(tagName,Js.asConstructorFn(klass));
}
public native void define(String tagName,JsConstructorFn<? extends HTMLElement> klass,CustomElementRegistry.DefineOptionsType options);
public native void define(String tagName,JsConstructorFn<? extends HTMLElement> klass);
public native JsConstructorFn<? extends HTMLElement> get(String tagName);
public native void upgrade(Node root);
public native Promise<Void> whenDefined(String tagName);
}
