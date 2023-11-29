package elemental2.dom;
import elemental2.dom.MessagePort;
import elemental2.dom.ErrorEvent;
import elemental2.dom.URL;
import elemental2.dom.WorkerOptions;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.Event;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SharedWorker implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorOptionsUnionType{
@JsOverlay
static SharedWorker.ConstructorOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default WorkerOptions asWorkerOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorScriptURLUnionType{
@JsOverlay
static SharedWorker.ConstructorScriptURLUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedScriptURL asTrustedScriptURL(){
return Js.cast(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedScriptURL(){
return (Object)this instanceof TrustedScriptURL;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsFunction
public interface OnerrorFn{
void onInvoke(ErrorEvent p0);
}
public SharedWorker.OnerrorFn onerror;
public MessagePort port;
public SharedWorker(SharedWorker.ConstructorScriptURLUnionType scriptURL,SharedWorker.ConstructorOptionsUnionType options){}
public SharedWorker(SharedWorker.ConstructorScriptURLUnionType scriptURL,String options){}
public SharedWorker(SharedWorker.ConstructorScriptURLUnionType scriptURL,WorkerOptions options){}
public SharedWorker(SharedWorker.ConstructorScriptURLUnionType scriptURL){}
public SharedWorker(String scriptURL,SharedWorker.ConstructorOptionsUnionType options){}
public SharedWorker(String scriptURL,String options){}
public SharedWorker(String scriptURL,WorkerOptions options){}
public SharedWorker(String scriptURL){}
public SharedWorker(TrustedScriptURL scriptURL,SharedWorker.ConstructorOptionsUnionType options){}
public SharedWorker(TrustedScriptURL scriptURL,String options){}
public SharedWorker(TrustedScriptURL scriptURL,WorkerOptions options){}
public SharedWorker(TrustedScriptURL scriptURL){}
public SharedWorker(URL scriptURL,SharedWorker.ConstructorOptionsUnionType options){}
public SharedWorker(URL scriptURL,String options){}
public SharedWorker(URL scriptURL,WorkerOptions options){}
public SharedWorker(URL scriptURL){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
