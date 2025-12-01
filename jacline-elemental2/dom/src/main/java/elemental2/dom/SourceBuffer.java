package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.TimeRanges;
import elemental2.dom.Event;
import elemental2.core.ArrayBuffer;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import elemental2.core.Uint8Array;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SourceBuffer implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AppendBufferDataUnionType{
@JsOverlay
static SourceBuffer.@Nullable AppendBufferDataUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default @Nullable ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
public double appendWindowEnd;
public double appendWindowStart;
public @Nullable TimeRanges buffered;
public String mode;
public double timestampOffset;
public boolean updating;
public native void abort();
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void append(@Nullable Uint8Array data);
public native void appendBuffer(SourceBuffer.@Nullable AppendBufferDataUnionType data);
@JsOverlay
public final void appendBuffer(ArrayBuffer data){
appendBuffer(Js.<SourceBuffer.@Nullable AppendBufferDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void appendBuffer(ArrayBufferView data){
appendBuffer(Js.<SourceBuffer.@Nullable AppendBufferDataUnionType>uncheckedCast(data));
}
public native void changeType(String type);
public native boolean dispatchEvent(Event evt);
public native void remove(double start,double end);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
