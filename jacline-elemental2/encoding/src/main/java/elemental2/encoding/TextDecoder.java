package elemental2.encoding;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextDecoder{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DecodeInputUnionType{
@JsOverlay
static TextDecoder.DecodeInputUnionType of(Object o){
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
public TextDecoder(){}
public TextDecoder(String encoding,JsObject options){}
public TextDecoder(String encoding,Object options){}
public TextDecoder(String encoding){}
public native String decode();
@JsOverlay
public final String decode(ArrayBuffer input,JsObject options){
return decode(Js.<TextDecoder.DecodeInputUnionType>uncheckedCast(input),options);
}
@JsOverlay
public final String decode(ArrayBuffer input,Object options){
return decode(input,Js.<JsObject>uncheckedCast(options));
}
@JsOverlay
public final String decode(ArrayBuffer input){
return decode(Js.<TextDecoder.DecodeInputUnionType>uncheckedCast(input));
}
@JsOverlay
public final String decode(ArrayBufferView input,JsObject options){
return decode(Js.<TextDecoder.DecodeInputUnionType>uncheckedCast(input),options);
}
@JsOverlay
public final String decode(ArrayBufferView input,Object options){
return decode(input,Js.<JsObject>uncheckedCast(options));
}
@JsOverlay
public final String decode(ArrayBufferView input){
return decode(Js.<TextDecoder.DecodeInputUnionType>uncheckedCast(input));
}
public native String decode(TextDecoder.DecodeInputUnionType input,JsObject options);
@JsOverlay
public final String decode(TextDecoder.DecodeInputUnionType input,Object options){
return decode(input,Js.<JsObject>uncheckedCast(options));
}
public native String decode(TextDecoder.DecodeInputUnionType input);
}
