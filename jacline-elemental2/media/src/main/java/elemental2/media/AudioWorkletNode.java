package elemental2.media;
import org.jspecify.annotations.Nullable;
import elemental2.dom.MessagePort;
import elemental2.media.AudioNode;
import jsinterop.base.JsPropertyMap;
import elemental2.media.AudioParam;
import elemental2.dom.EventListener;
import elemental2.media.AudioWorkletNodeOptions;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import elemental2.media.BaseAudioContext;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorkletNode extends AudioNode{
@JsFunction
public interface OnprocesserrorFn{
@Nullable Object onInvoke();
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnprocesserrorUnionType{
@JsOverlay
static AudioWorkletNode.OnprocesserrorUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default AudioWorkletNode.OnprocesserrorFn asOnprocesserrorFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnprocesserrorFn(){
return (Object)this instanceof AudioWorkletNode.OnprocesserrorFn;
}
}
public AudioWorkletNode.OnprocesserrorUnionType onprocesserror;
public JsPropertyMap<AudioParam> parameters;
public MessagePort port;
public AudioWorkletNode(BaseAudioContext context,String name,AudioWorkletNodeOptions options){}
public AudioWorkletNode(BaseAudioContext context,String name){}
}
