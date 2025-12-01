package elemental2.media;
import org.jspecify.annotations.Nullable;
import java.lang.Deprecated;
import elemental2.media.AudioNode;
import elemental2.media.AudioProcessingEvent;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@Deprecated
public class ScriptProcessorNode extends AudioNode{
@JsFunction
public interface OnaudioprocessFn{
boolean onInvoke(AudioProcessingEvent p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnaudioprocessUnionType{
@JsOverlay
static ScriptProcessorNode.@Nullable OnaudioprocessUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default ScriptProcessorNode.@Nullable OnaudioprocessFn asOnaudioprocessFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnaudioprocessFn(){
return (Object)this instanceof ScriptProcessorNode.OnaudioprocessFn;
}
}
@Deprecated
public int bufferSize;
@Deprecated
public ScriptProcessorNode.@Nullable OnaudioprocessUnionType onaudioprocess;
}
