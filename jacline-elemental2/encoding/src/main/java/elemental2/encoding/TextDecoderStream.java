package elemental2.encoding;
import elemental2.dom.WritableStream;
import elemental2.dom.ReadableStream;
import elemental2.core.ArrayBuffer;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextDecoderStream{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface WritableWritableStreamTypeParameterUnionType{
@JsOverlay
static TextDecoderStream.WritableWritableStreamTypeParameterUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
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
public String encoding;
public boolean fatal;
public boolean ignoreBOM;
public ReadableStream<String> readable;
public WritableStream<TextDecoderStream.WritableWritableStreamTypeParameterUnionType> writable;
public TextDecoderStream(){}
public TextDecoderStream(String encoding,JsObject options){}
public TextDecoderStream(String encoding,Object options){}
public TextDecoderStream(String encoding){}
}
