package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.MutationObserverInit;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MutationRecord;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MutationObserver{
@JsFunction
public interface MutationObserverCallbackFn{
@Nullable Object onInvoke(JsArray<MutationRecord> p0,MutationObserver p1);
@JsOverlay
default @Nullable Object onInvoke(MutationRecord[] p0,MutationObserver p1){
return onInvoke(Js.<JsArray<MutationRecord>>uncheckedCast(p0),p1);
}
}
public MutationObserver(MutationObserver.MutationObserverCallbackFn callback){}
public native @Nullable Object disconnect();
public native void observe(@Nullable Node target,MutationObserverInit options);
public native void observe(@Nullable Node target);
public native JsArray<MutationRecord> takeRecords();
}
