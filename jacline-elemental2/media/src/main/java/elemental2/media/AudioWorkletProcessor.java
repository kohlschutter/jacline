package elemental2.media;
import elemental2.dom.MessagePort;
import elemental2.media.AudioWorkletNodeOptions;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.core.Float32Array;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorkletProcessor{
public MessagePort port;
public AudioWorkletProcessor(){}
public AudioWorkletProcessor(AudioWorkletNodeOptions options){}
@JsOverlay
public final boolean process(Float32Array[][] inputs,Float32Array[][] outputs,JsPropertyMap<Float32Array> parameters){
return process(Js.<JsArray<JsArray<Float32Array>>>uncheckedCast(inputs),Js.<JsArray<JsArray<Float32Array>>>uncheckedCast(outputs),parameters);
}
public native boolean process(JsArray<JsArray<Float32Array>> inputs,JsArray<JsArray<Float32Array>> outputs,JsPropertyMap<Float32Array> parameters);
}
