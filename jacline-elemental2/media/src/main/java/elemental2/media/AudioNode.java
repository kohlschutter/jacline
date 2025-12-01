package elemental2.media;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import elemental2.dom.Event;
import elemental2.dom.EventTarget;
import elemental2.media.AudioParam;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.media.AudioContext;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioNode implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConnectDestinationUnionType{
@JsOverlay
static AudioNode.ConnectDestinationUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default AudioNode asAudioNode(){
return Js.cast(this);
}
@JsOverlay
default AudioParam asAudioParam(){
return Js.cast(this);
}
@JsOverlay
default boolean isAudioNode(){
return (Object)this instanceof AudioNode;
}
@JsOverlay
default boolean isAudioParam(){
return (Object)this instanceof AudioParam;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DisconnectDestinationUnionType{
@JsOverlay
static AudioNode.DisconnectDestinationUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default AudioNode asAudioNode(){
return Js.cast(this);
}
@JsOverlay
default AudioParam asAudioParam(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default boolean isAudioNode(){
return (Object)this instanceof AudioNode;
}
@JsOverlay
default boolean isAudioParam(){
return (Object)this instanceof AudioParam;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
public int channelCount;
public String channelCountMode;
public String channelInterpretation;
public AudioContext context;
public int numberOfInputs;
public int numberOfOutputs;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType useCapture);
public native void addEventListener(String type,EventListener listener);
@JsOverlay
public final @Nullable AudioNode connect(AudioNode destination,int output,int input){
return connect(Js.<AudioNode.ConnectDestinationUnionType>uncheckedCast(destination),output,input);
}
@JsOverlay
public final @Nullable AudioNode connect(AudioNode destination,int output){
return connect(Js.<AudioNode.ConnectDestinationUnionType>uncheckedCast(destination),output);
}
@JsOverlay
public final @Nullable AudioNode connect(AudioNode destination){
return connect(Js.<AudioNode.ConnectDestinationUnionType>uncheckedCast(destination));
}
@JsOverlay
public final @Nullable AudioNode connect(AudioParam destination,int output,int input){
return connect(Js.<AudioNode.ConnectDestinationUnionType>uncheckedCast(destination),output,input);
}
@JsOverlay
public final @Nullable AudioNode connect(AudioParam destination,int output){
return connect(Js.<AudioNode.ConnectDestinationUnionType>uncheckedCast(destination),output);
}
@JsOverlay
public final @Nullable AudioNode connect(AudioParam destination){
return connect(Js.<AudioNode.ConnectDestinationUnionType>uncheckedCast(destination));
}
public native @Nullable AudioNode connect(AudioNode.ConnectDestinationUnionType destination,int output,int input);
public native @Nullable AudioNode connect(AudioNode.ConnectDestinationUnionType destination,int output);
public native @Nullable AudioNode connect(AudioNode.ConnectDestinationUnionType destination);
public native @Nullable Object disconnect();
@JsOverlay
public final @Nullable Object disconnect(AudioNode destination,int output,int input){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination),output,input);
}
@JsOverlay
public final @Nullable Object disconnect(AudioNode destination,int output){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination),output);
}
@JsOverlay
public final @Nullable Object disconnect(AudioNode destination){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination));
}
@JsOverlay
public final @Nullable Object disconnect(AudioParam destination,int output,int input){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination),output,input);
}
@JsOverlay
public final @Nullable Object disconnect(AudioParam destination,int output){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination),output);
}
@JsOverlay
public final @Nullable Object disconnect(AudioParam destination){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination));
}
public native @Nullable Object disconnect(AudioNode.DisconnectDestinationUnionType destination,int output,int input);
public native @Nullable Object disconnect(AudioNode.DisconnectDestinationUnionType destination,int output);
public native @Nullable Object disconnect(AudioNode.DisconnectDestinationUnionType destination);
@JsOverlay
public final @Nullable Object disconnect(double destination,int output,int input){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination),output,input);
}
@JsOverlay
public final @Nullable Object disconnect(double destination,int output){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination),output);
}
@JsOverlay
public final @Nullable Object disconnect(double destination){
return disconnect(Js.<AudioNode.DisconnectDestinationUnionType>uncheckedCast(destination));
}
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType useCapture);
public native void removeEventListener(String type,EventListener listener);
}
