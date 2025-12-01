package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Event{
@JsFunction
public interface DeepPathFn{
@Nullable JsArray<EventTarget> onInvoke();
}
@JsOverlay
public static final int AT_TARGET=Event__Constants.AT_TARGET;
@JsOverlay
public static final int BUBBLING_PHASE=Event__Constants.BUBBLING_PHASE;
@JsOverlay
public static final int CAPTURING_PHASE=Event__Constants.CAPTURING_PHASE;
public boolean bubbles;
public boolean cancelable;
public boolean composed;
public @Nullable EventTarget currentTarget;
public Event.DeepPathFn deepPath;
public boolean defaultPrevented;
public int eventPhase;
public String namespaceURI;
public @Nullable JsArray<Element> path;
public @Nullable EventTarget target;
public double timeStamp;
public String type;
public Event(String type,@Nullable EventInit eventInitDict){}
public Event(String type){}
public native JsArray<EventTarget> composedPath();
public native void initEvent(String eventTypeArg,boolean canBubbleArg,boolean cancelableArg);
public native void initEvent(String eventTypeArg,boolean canBubbleArg);
public native void initEvent(String eventTypeArg);
public native void preventDefault();
public native void stopImmediatePropagation();
public native void stopPropagation();
}
