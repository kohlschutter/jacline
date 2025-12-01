package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.core.Uint8Array;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextEncoder{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EncodeIntoReturnType{
@JsOverlay
static TextEncoder.EncodeIntoReturnType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getRead();
@JsProperty
double getWritten();
@JsProperty
void setRead(double read);
@JsProperty
void setWritten(double written);
}
public String encoding;
public TextEncoder(){}
public TextEncoder(String utfLabel){}
public native Uint8Array encode();
public native Uint8Array encode(String input);
public native TextEncoder.EncodeIntoReturnType encodeInto(String input,Uint8Array uint8Array);
}
