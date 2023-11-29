package elemental2.dom;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import elemental2.dom.FontFaceDescriptors;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FontFace{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorSourceUnionType{
@JsOverlay
static FontFace.ConstructorSourceUnionType of(Object o){
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
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public String ascentOverride;
public String descentOverride;
public String display;
public String family;
public String featureSettings;
public String lineGapOverride;
public Promise<FontFace> loaded;
public String status;
public String stretch;
public String style;
public String unicodeRange;
public String variant;
public String variationSettings;
public String weight;
public FontFace(String fontFamily,ArrayBuffer source,FontFaceDescriptors descriptors){}
public FontFace(String fontFamily,ArrayBuffer source){}
public FontFace(String fontFamily,ArrayBufferView source,FontFaceDescriptors descriptors){}
public FontFace(String fontFamily,ArrayBufferView source){}
public FontFace(String fontFamily,FontFace.ConstructorSourceUnionType source,FontFaceDescriptors descriptors){}
public FontFace(String fontFamily,FontFace.ConstructorSourceUnionType source){}
public FontFace(String fontFamily,String source,FontFaceDescriptors descriptors){}
public FontFace(String fontFamily,String source){}
public native Promise<FontFace> load();
}
